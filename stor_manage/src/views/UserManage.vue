<template>
    <div id="app">
        <el-table :data="tableData" border style="width: 100%;">
            <el-table-column
                    prop="username"
                    label="昵称"
                    width="240px"
            >
            </el-table-column>
            <el-table-column
                    prop="name"
                    label="姓名"
                    width="240px"
            >
            </el-table-column>
            <el-table-column
                    prop="phone"
                    label="电话"
                    width="240px"
            >
            </el-table-column>
            <el-table-column
                    prop="password"
                    label="密码"
                    width="240px"
            >
            </el-table-column>
            <el-table-column
                    prop="email"
                    label="邮箱"
                    width="240px"
            >
            </el-table-column>
            <el-table-column
                    fixed="right"
                    label="修改   /   删除"
                    width="350">
                <template slot-scope="scope">
                    <el-button size="small" @click="edit(scope.row)" type="primary" icon="el-icon-edit">修改</el-button>
                    <el-button size="small" @click="deleteUser(scope.row)" type="danger" icon="el-icon-delete">删除</el-button>
                </template>
            </el-table-column>
        </el-table>
        <!--        :current-page.sync="currentPage3"-->
        <!--<el-pagination-->
                <!--background-->
                <!--@current-change="change"-->
                <!--:page-size="pageSize"-->
                <!--layout="prev, pager, next"-->
                <!--:total="total">-->
        <!--</el-pagination>-->
    </div>
</template>

<script>
    export default {
        data() {
            return {
                pageSize: '5',
                total: '12',
                // currentPage3:1,
                tableData: [
                    {
                        uid: 1,
                        phone: '13788888888',
                        password: '123123',
                        username: '张三',
                        email: '136@qq.com',
                        name: "张三"
                    }
                ]
            }
        },
        methods: {
            deleteUser(row) {
                const _this = this
                axios.delete('http://localhost:8089/user/deleteById/' + row.uid).then(function (resp) {
                    _this.$alert('用户' + row.username + '删除成功！', '消息', {
                        confirmButtonText: '确定',
                        callback: action => {
                            window.location.reload()
                        }
                    })
                })
            },
            edit(row) {
                this.$router.push({
                    path: '/UserUpdate',
                    query: {
                        uid: row.uid
                    }
                });
            },
            // change(currentPage) {
            //     const _this = this
            //     axios.get('http://localhost:8183/user/findAll/' + (currentPage - 1) + '/6').then(function (resp) {
            //         _this.tableData = resp.data.content
            //         _this.pageSize = resp.data.size
            //         _this.total = resp.data.totalElements
            //     })
            // }
        },
        created: function () {
            const _this = this
            axios.get('http://localhost:8089//user/selectAll').then(
                function (resp) {
                    _this.tableData = resp.data
                })
        }
    }
</script>