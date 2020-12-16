<template>
    <el-form :model="ruleForm" :rules="rules" ref="ruleForm"
             label-width="100px" class="demo-ruleForm">
        <el-form-item label="分类名称" prop="cname">
            <el-input v-model="ruleForm.cname"></el-input>
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
                    cid: 2,
                    cname: '国产水果',
                },
                rules: {}
            };
        },
        methods: {
            submitForm(formName) {
                const _this = this;
                this.$refs[formName].validate((valid) => {
                    if (valid) {
                        axios.post('http://localhost:8089/category/save', this.ruleForm).then(
                            function (resp) {
                                if (resp.data === 'success') {
                                    _this.$alert('《' + _this.ruleForm.cname + '》添加成功！', '消息', {
                                        confirmButtonText: '确定',
                                        callback: action => {
                                            _this.$router.push('/CategoryManage');
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
        }
    }
</script>