<script>
  import "../plugins/iview"
  import "../plugins/element.js"
  export default {
    inject: ['reload'],
    name: "login&register",
    components:{
      // user_register
    },
    data () {
      return {
        arr_userId:[],
        arr_tel:[],
        arr_pas:[],
        tableDate:[],
        formInline: {
          uid: '',
          tel:'',
          password: '',
        },
        rules: {
          tel: [
            { required: true, message: '账号不能为空', trigger: 'blur' }
          ],
          password: [
            { required: true, message: '密码不能为空', trigger: 'blur' },
            { type: 'string', min: 6, message: '密码长度不能小于6位', trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      gotolink(){
        if(this.formInline.tel === ''){
          alert("账号不能为空");
          return;
        }
        let t1 = -1;
        for (let i = 0; i < this.arr_tel.length; i++) {
            if (this.arr_tel[i] === this.formInline.tel && this.arr_pas[i] === this.formInline.password){
              // this.$store.state.nowUid = this.arr_userId[i];
              // this.$store.state.nowPhone = this.arr_tel[i];
              sessionStorage.setItem('nowUid',this.arr_userId[i]);
              sessionStorage.setItem('nowPhone',this.arr_tel[i]);
              // alert("state:"+this.$store.state.nowUid);   //查看此时存入的Uid
              this.$alert('欢迎来到五色鲜！', '消息', {
                confirmButtonText: '确定',
                callback: action => {
                  this.$router.push({
                    path:'/homepage'
                  });
                }
              });
                return;
            }else if (this.arr_tel[i] === this.formInline.tel && this.arr_pas[i] !== this.formInline.password){
                t1 = 1;
                break;
            }else {
                t1 = 0;
                continue;
            }
        }
        if (t1 === 1){
            alert("密码错误，请重新输入");
            this.formInline.password = '';
        }
        else{
            alert("用户名不存在，请重新输入");
            this.formInline.password = '';
            this.formInline.tel = '';
        }
      },
      setBack(){
        let element = document.getElementById("back_body");
        element.style.background =  "rgba(00, 00, 00, 0.6)";
      },
      deleteBack(){
        let element = document.getElementById("back_body");
        element.style.background =  "rgba(00, 00, 00, 0)";
      },
      deleteUser(){           //测试用例，删除
        alert("删除");
        let id = 35;
        const _this = this;
        this.$axios({
          method: 'delete',
          url:'http://localhost:8089/user/deleteById/'+id
        }).then(function (response) {
            if (response.data === 'success'){
              _this.$alert('删除成功','消息',{
                confirmButtonText:'确定',
                callback:action => {
                  window.location.reload()
                }
              })
            }else{
              alert(response.data);
            }
        });
      },
      updateUser(){       //测试用例，修改
        alert("修改");
        const _this = this;
        let testUser = {
          uid:20,
          name:'user28',
          password:'000000',
          username:'xx',
          email:'000@qq.com',
          phone:'123456789'
        };
        this.$axios({
          method: 'put',
          url:'http://localhost:8089/user/update',
          data:testUser
        }).then(function (response) {
          if (response.data === 'success'){
            _this.$alert('修改成功','消息',{
              confirmButtonText:'确定',
              callback:action => {
                window.location.reload()
              }
            })
          }else{
            alert(response.data);
          }
        });
      },
    },
    created(){
      const _this = this
      this.$axios({
        method:'get',
        url:'http://localhost:8089/user/selectAll'
      }).then(function (response) {
        _this.tableDate = response.data;
        for (let i = 0;i < _this.tableDate.length;i++){
          _this.arr_userId[i] = _this.tableDate[i].uid;
          _this.arr_pas[i] = _this.tableDate[i].password;
          _this.arr_tel[i] = _this.tableDate[i].phone;
        }
      })
    }
  }
</script>
<template>
  <div style="
    position: absolute;
    width: 100%;height:100%;
    overflow:hidden;">
    <div id="login_body"></div>
    <div id="back_body"></div>
      <div id="login">
        <el-form ref="formInline" :model="formInline" :rules="rules" inline>
          <p>欢迎登录</p>
          <div class="form">
            <div class="item">
              <el-form-item prop="tel">
                <el-input prefix-icon="el-icon-user-solid" @focus="setBack()" @blur="deleteBack()" type="text" v-model="formInline.tel" placeholder="账号">
                  <!--                                <Icon size="24" type="ios-contact-outline" slot="prepend"></Icon>prefix-icon="el-icon-user-solid"-->
                </el-input>
              </el-form-item>
            </div>
            <div class="item">
              <el-form-item prop="password">
                <el-input @focus="setBack()" @blur="deleteBack()" prefix-icon="el-icon-lock"   type="password" v-model="formInline.password" placeholder="密码">
                </el-input>
              </el-form-item>
            </div>
          </div>
          <router-link :to="{name: 'Register'}" tag="li" activeClass="current">
            <span>还没有鲜果账号？点击注册吧</span><a style="font-size: 18px;font-weight:500"><i style="font-size: 20px"  class="el-icon-apple" />注册账号<i style="font-size: 20px" class="el-icon-watermelon"></i></a>
          </router-link>
          <el-form-item>
            <Button type="primary" @click="gotolink()">登录</Button>
            <!--                    <Button type="primary" @click="addUser()">注册</Button>-->
            <!--        <el-button type="primary" icon="el-icon-plus" size="small" @click="addUser()" :disabled="disp()">添加</el-button>-->
            <!--                    <el-dialog title="欢迎~" :visible.sync="dialogTableVisible" center :append-to-body='true' :lock-scroll="false" width="30%">-->
            <!--&lt;!&ndash;                        <user_register></user_register>&ndash;&gt;-->
            <!--                    </el-dialog>-->
          </el-form-item>
        </el-form>
                                                <!--      测试所用按钮
        <Button style="margin: 0;width:130px;height: 40px" type="primary" @click="deleteUser()">删除用户</Button>
        <Button style="margin: 0;width: 130px;height: 40px" type="primary" @click="updateUser()">修改用户</Button>
                                                     测试所用按钮      -->
  </div>
  </div>

</template>

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
    #login_body{
      position: absolute;
      width: 100%;height:100%;
      overflow:hidden;
      zoom: 1;
      background:url(../assets/img/user_login.jpg) no-repeat top center ;
      background-size:cover;
      text-align:center;
    }
    #back_body{
      position: absolute;
      width: 100%;height:100%;
      overflow:hidden;
      zoom: 1;
      transition:background-color 2s;
    }
    #login{
        position: relative;
        top: 21%;
        margin: 0 auto;
        width: 480px;
        height: 340px;
        border: 0.5px black solid;
        text-align: center;
        background: rgba(108, 200, 111, 0.1);
        color:#fff;
        text-shadow:0 0 2px #000;
        border-radius:12px;
        box-shadow:0 0 5px #000;
    }
    #login p{
        margin-top: 15px;
        top: 30px;
        font-family: 'Courier New', Courier, monospace;
        font-size: 60px;
    }
    #login button{
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
  #login input{
    border-radius: 7px;
    height: 40px;
    width: 240px;
  }
  #login i{
    font-size: 18px;
  }
</style>
