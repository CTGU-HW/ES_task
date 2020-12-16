<template>
    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
        <el-form-item label="名称"  prop="pname">
            <el-input v-model="ruleForm.pname"></el-input>
        </el-form-item>
        <el-form-item label="描述"  prop="pnameTitle">
            <el-input v-model="ruleForm.pnametitle"></el-input>
        </el-form-item>
        <el-form-item label="价格"  prop="price">
            <el-input v-model="ruleForm.price"></el-input>
        </el-form-item>
        <el-form-item label="图片路径"  prop="aliImage">
            <el-input v-model="ruleForm.aliimage"></el-input>
        </el-form-item>
        <el-form-item label="分类编号"  prop="cid">
            <el-input v-model="ruleForm.cid"></el-input>
        </el-form-item>
        <el-form-item>
            <el-button type="primary" @click="submitForm('ruleForm')">提交</el-button>
            <el-button @click="resetForm('ruleForm')">重置</el-button>
        </el-form-item>
    </el-form>
</template>

<script>
    export default {
        data() {
            return {
                ruleForm: {
                    pid:1,
                    pname: '草莓',
                    pnameiitle: '特价新鲜水果来啦，好吃又营养，快来选购叭',
                    price: 12.0,
                    aliimage: '/static/img/特价水果/草莓.jpg',
                    limitNum:5,
                    cid: 1
                },
                rules: {
                }
            };
        },
        methods: {
            submitForm(formName) {
                const _this =this;
                this.$refs[formName].validate((valid) => {
                    if (valid) {
                        axios.put('http://localhost:8089/products/update',this.ruleForm).then(
                            function (resp) {
                                if (resp.data == 'success') {
                                    _this.$alert('《'+_this.ruleForm.pname+'》保存成功！', '消息', {
                                        confirmButtonText: '确定',
                                        callback: action => {
                                            _this.$router.push('/ProductsManage');
                                        }
                                    });

                                }
                            }
                        )
                    } else {
                        return false;
                    }
                });
            },
            resetForm(formName) {
                this.$refs[formName].resetFields();
            }
        },
        created(){
            const _this = this
            axios.get('http://localhost:8089/products/findById/'+this.$route.query.pid).then(function(resp){
                _this.ruleForm = resp.data
            })
        }
    }
</script>