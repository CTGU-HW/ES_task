<template>
    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
        <el-form-item label="昵称" prop="userName">
            <el-input  v-model="ruleForm.username"></el-input>
        </el-form-item>
        <el-form-item label="姓名" prop="name" readOnly>
            <el-input :disabled="true" v-model="ruleForm.name"></el-input>
        </el-form-item>
        <el-form-item label="电话" prop="phone">
            <el-input :disabled="true" v-model="ruleForm.phone"></el-input>
        </el-form-item>
        <el-form-item label="密码" prop="password">
            <el-input v-model="ruleForm.password"></el-input>
        </el-form-item>
        <el-form-item label="邮箱" prop="email">
            <el-input v-model="ruleForm.email"></el-input>
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
                    uid: '',
                    phone: '',
                    password: '',
                    username: '',
                    email: '',
                    name: ''
                },
                rules: {
                }
            };
        },
        methods: {
            submitForm(formName) {
                const _this = this;
                this.$refs[formName].validate((valid) => {
                    if (valid) {
                        axios.put('http://localhost:8089/user/update', this.ruleForm).then(
                            function (resp) {
                                if (resp.data == 'success') {
                                    _this.$alert('用户' + _this.ruleForm.username + '保存成功！', '消息', {
                                        confirmButtonText: '确定',
                                        callback: action => {
                                            _this.$router.push('/UserManage');
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
        created() {
            const _this = this
            axios.get('http://localhost:8089/user/findById/' + this.$route.query.uid).then(function (resp) {
                _this.ruleForm = resp.data
            })
        }
    }
</script>