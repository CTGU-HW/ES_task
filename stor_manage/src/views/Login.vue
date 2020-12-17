
<template>
    <div id="login_body">
        <div id="login">
            <Form ref="formInline" :model="formInline" :rules="ruleInline" inline>
                <p>后台</p>
                <div class="form">
                    <div class="item">
                        <FormItem prop="adminname">
                            <Input id="username" type="text" v-model="formInline.adminname" placeholder="电话号码">
                                <Icon type="ios-lock-outline" slot="prepend"></Icon>
                            </Input>
                        </FormItem>
                    </div>
                    <div class="item">
                        <FormItem prop="adminname">
                            <Input id="password" type="password" v-model="formInline.adminpwd" placeholder="密码">
                                <Icon type="ios-lock-outline" slot="prepend"></Icon>
                            </Input>
                        </FormItem>
                    </div>
                </div>
                <FormItem>
                    <Button id="login_button" style="width: 210px;height: 35px" type="primary" @click="gotolink()">登陆</Button>
                </FormItem>
            </Form>
        </div>
    </div>

</template>
<script>

    export default {
        name: "login&register",
        data () {
            return {
                arr_tel:[],
                arr_pas:[],
                dialogTableVisible: false,
                formInline:{
                        adminid:'',
                        adminpwd: '',
                        adminname:'',
                },
                tableDate:[],
                ruleInline: {
                    adminname: [
                        { required: true, message: '用户名不能为空', trigger: 'blur' }
                    ],
                    adminpwd: [
                        { required: true, message: '密码不能为空', trigger: 'blur' }
                    ]
                }
            }
        },
        methods: {
            addUser(){
                this.dialogTableVisible=true;//默认页面不显示为false,点击按钮将这个属性变成true
            },
            gotolink(){
                // this.$router.push({path: '/cart?goodsId=12'});
                let t1 = -1;
                for (let i = 0; i < this.arr_tel.length; i++) {
                    if(this.formInline.adminname === ''){
                        alert("账号不能为空");
                        return;
                    }
                    if (this.arr_tel[i] === this.formInline.adminname && this.arr_pas[i] === this.formInline.adminpwd){
                        sessionStorage.setItem('uName',JSON.stringify(this.formInline.adminname));
                        this.$router.push('/Manage');
                        return;
                        // alert("123")
                    }else if ( this.arr_tel[i] === this.formInline.adminname && this.arr_pas[i] !== this.formInline.adminpwd){
                        t1 = 1;
                        break;
                    }else {
                        t1 = 0;
                        continue;
                    }
                }
                if (t1 === 1){
                    alert("密码错误，请重新输入");
                    this.formInline.adminpwd= '';
                }
                else{
                    alert("用户名错误，请重新输入");
                    this.formInline.adminpwd= '';
                    this.formInline.adminname = '';
                }
            }
        },
        created(){
            const _this = this
            axios.get('http://localhost:8089/admins/selectAll').then(function(resp){
                _this.tableDate = resp.data
                _this.arr = resp.data.content
                for (let i = 0; i < _this.tableDate.length; i++) {
                    _this.arr_pas[i] = _this.tableDate[i].adminpwd;
                    _this.arr_tel[i] = _this.tableDate[i].adminname;
                }
            })
        }
    }
</script>

<style>
    *{margin: 0px;padding: 0px;}
    a{text-decoration: none;}
    ul{list-style: none;}
    html, body {margin:0; padding:0; width:100%; height:100%}
    #login_body{
        position: absolute;
        top: 0;left: 0;
        width:100%;height: 100%;
        zoom: 1;
        background-image:  url(../static/pic/背景1.jpg);
        background-repeat: no-repeat;
        background-size: cover;
        -webkit-background-size: cover;
        -o-background-size: cover;

    }
    #login{
        position: relative;
        top: 140px;
        margin: 0 auto;
        width: 520px;
        height: 310px;
        border: 1px black solid;
        text-align: center;
        background: rgb(00, 00, 00, 0.5);
        color: white;
    }
    #login p{
        margin-top: 20px;
        top: 30px;
        font-family: 'Courier New', Courier, monospace;
        font-size: 60px;
    }
    #login button{
        margin-top: 15px;
        margin-bottom: 30px;
        margin-right: 20px;
        margin-left: 20px;
        width: 90px;height: 30px;
        font-size: 20px;
        font-family: 'Times New Roman', Times, serif;
        color: white;
        background-image: linear-gradient(to right,rgb(46, 46, 136), #fa719d);
        border-radius: 10px;
        border: none;
        outline: none;
        cursor: pointer;
    }
</style>