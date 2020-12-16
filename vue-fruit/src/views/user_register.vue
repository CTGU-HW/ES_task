<template>
  <div style="
    position: absolute;
    width: 100%;height:100%;
    overflow:hidden;">
    <div id="register_body"></div>
    <div id="back"></div>
    <div id="register">
      <el-form ref="formInline" :model="formInline" :rules="ruleInline" inline>
        <p>欢迎注册</p>
        <div class="form">
          <div class="item">
            <el-form-item prop="userName">
              <el-input @focus="setBack()" @blur="deleteBack()"
                        prefix-icon="el-icon-user-solid" type="text" v-model="formInline.userName" placeholder="请输入昵称">
                <!--                                <Icon size="24" type="ios-contact-outline" slot="prepend"></Icon>-->
              </el-input>
            </el-form-item>
          </div>
          <div class="item">
          <el-form-item prop="tel">
            <el-input @focus="setBack()" @blur="deleteBack()"
                      prefix-icon="el-icon-phone"   type="text" v-model="formInline.tel" placeholder="请输入电话">
            </el-input>
          </el-form-item>
          </div>
          <div class="item">
            <el-form-item prop="password">
              <el-input @focus="setBack()" @blur="deleteBack()"
                        prefix-icon="el-icon-key"   type="password" v-model="formInline.password" placeholder="请输入密码">
              </el-input>
            </el-form-item>
          </div>
          <div class="item">
            <el-form-item prop="passCheck">
              <el-input @focus="setBack()" @blur="deleteBack()"
                        prefix-icon="el-icon-key"   type="password" v-model="formInline.passCheck" placeholder="请再次输入密码">
              </el-input>
            </el-form-item>
          </div>
        </div>
        <router-link :to="{name: 'Login'}" tag="li" activeClass="current">
          <span>已经有鲜果账号？</span><a style="font-size: 14.5px;font-weight:500"><i style="font-size: 20px"  class="el-icon-apple" />点击登录吧<i style="font-size: 20px" class="el-icon-watermelon"></i></a>
        </router-link>
        <el-form-item>
          <Button type="primary" @click="addUser(formInline)">注册</Button>
        </el-form-item>
      </el-form>
    </div>
  </div>

</template>
<script>
  import "../plugins/iview"
  import "../plugins/element.js"
  export default {
    data () {
      const validatePass = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请输入密码'));
          this.formInline.error1 = false;
        } else {
          if (value.length < 6){
            callback(new Error('密码长度不能小于6位'));
            this.formInline.error1 = false;
          }else if (this.formInline.passCheck !== '') {
            // 对第二个密码框单独验证
            this.$refs.formCustom.validateField('passCheck');
            this.formInline.error1 = true;
          }
          callback();
        }
      };
      const validatePassCheck = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请重新输入'));
          this.formInline.error2 = false;
        }
        else if(value.length < 6){
          callback(new Error('密码长度不能小于6位'));
          this.formInline.error2 = false;
        }else if (value !== this.formInline.password) {
          callback(new Error('两次密码不一致！'));
          this.formInline.error2 = false;
        } else {
          callback();
          this.formInline.error2 = true;
        }
      };
      const validateTel = (rule, value, callback) =>{
        if (!value) {
          callback(new Error('电话不为空'));
          this.formInline.error4 = false;
        }
        // 模拟异步验证效果
        setTimeout(() => {
          if (Number.isInteger(value)) {
            callback(new Error('请输入数字'));
            this.formInline.error4 = false;
          } else {
            if (value.length < 8) {
              callback(new Error('电话号码长度不能小于8位'));
              this.formInline.error4 = false;
            } else {
              callback();
              this.formInline.error4 = true;
            }
          }
        }, 1000);
      };
      const validateName = (rule, value, callback) =>{
        if (value === '') {
          callback(new Error('昵称不为空'));
          this.formInline.error5 = false;
        }else{
          callback();
          this.formInline.error5 = true;
        }
      };
      return {
        tableDate:[],
        formInline: {
          userName:'',
          tel:'',
          password:'',
          passCheck:'',
          error1:true,
          error2:true,
          error4:true,
          error5:true
        },
        user:{
          uid:'',
          name:'',
          password:'',
          username:'',
          email:'',
          phone:''
        },
        ruleInline: {
          tel: [
            { validator: validateTel, trigger: 'blur' }
          ],
          password: [
            { validator: validatePass, trigger: 'blur' }
          ],
          passCheck: [
            { validator: validatePassCheck, trigger: 'blur' }
          ],
          userName:[
            { validator: validateName, trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      addUser(name){
        const _this = this;
        if (this.formInline.error1&&this.formInline.error2&&
          this.formInline.error4&&this.formInline.error5){
          _this.user.phone = _this.formInline.tel;
          _this.user.password = _this.formInline.password;
          _this.user.username = _this.formInline.userName;
          if (name.tel!==''&&name.userName!==''&&name.passCheck!==''&&name.password!==''){
            this.$axios({
              method: 'post',
              url: 'http://localhost:8089/user/save',
              data:_this.user
            }).then(function (response) {
              alert(response.data);
              if (response.data === 'success'){
                _this.$alert('注册成功！您的账号是'+_this.user.phone,'消息',{
                  confirmButtonText:'点击登陆吧',
                  callback:action => {
                    _this.$router.push('/user_login')
                  }
                })
              }else {
                alert('该电话号码已被注册，请重试');//后端存储数据出错，检查后端代码
              }
            })
          }else{
            alert("注册失败！");//注册表单为空禁止发出请求，不符
          }
        }else{
          alert("注册失败！");//校验规则显示表单内数据格式出错，不符
        }
        this.formInline.tel = this.formInline.age = this.formInline.userName
          = this.formInline.password = this.formInline.passCheck = '';
        this.formInline.error1 = this.formInline.error2 =
          this.formInline.error4 = this.formInline.error5 = true;
      },
      setBack(){
        let element = document.getElementById("back");
        element.style.background =  "rgba(00, 00, 00, 0.6)";
      },
      deleteBack(){
        let element = document.getElementById("back");
        element.style.background =  "rgba(00, 00, 00, 0)";
      }
    }
  }
</script>
<style>
  *{margin: 0px;padding: 0px;}
  a{text-decoration: none;color: #ffff09
  }
  ul{list-style: none;}
  html, body {
    margin:0; padding:0; width:100%; height:100%;
  }
  a:hover{
    color: #FA0858
  }
  #register_body{
    position: absolute;
    width: 100%;height:100%;
    overflow:hidden;
    zoom: 1;
    background:url(../assets/img/user_login.jpg) no-repeat top center ;
    background-size:cover;
    text-align:center;
  }
  #back{
    position: absolute;
    width: 100%;height:100%;
    overflow:hidden;
    zoom: 1;
    transition:background-color 2s;
  }
  #register{
    position: relative;
    top: 13%;
    margin: 0 auto;
    width: 480px;
    height: 450px;
    border: 0.5px black solid;
    text-align: center;
    background: rgba(108, 200, 111, 0.1);
    color:#fff;
    text-shadow:0 0 2px #000;
    border-radius:12px;
    box-shadow:0 0 5px #000;
  }
  #register p{
    margin-top: 15px;
    top: 30px;
    font-family: 'Courier New', Courier, monospace;
    font-size: 60px;
  }
  #register button{
    margin-top: 8px;
    margin-bottom: 30px;
    margin-right: 20px;
    margin-left: 20px;
    width: 220px;height: 40px;
    font-size: 20px;
    font-family: 'Times New Roman', Times, serif;
    color: white;
    background-image: linear-gradient(to right,#AE102D,#FA0858);
    border-radius: 10px;
    border: none;
    outline: none;
    cursor: pointer;
  }
  #register input{
    border-radius: 7px;
    height: 40px;
    width: 240px;
  }
  #register i{
    font-size: 18px;
  }
</style>
