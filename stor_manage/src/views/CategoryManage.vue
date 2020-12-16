<template>
    <div id="app">
        <el-table stripe="true" border :data="tableData" style="width: 650px">
            <el-table-column
                    prop="cid"
                    label="分类编号"
                    width="200px"
            >
            </el-table-column>
            <el-table-column
                    prop="cname"
                    label="分类名称"
                    width="200px"
            >
            </el-table-column>
            <el-table-column
                    fixed="right"
                    label="删除 / 修改"
                    width="200"
            >
                <template slot-scope="scope">
                    <el-button style="margin-left: -10px" size="small" @click="edit(scope.row)" type="primary" icon="el-icon-edit">修改
                    </el-button>
                    <el-button size="small" @click="deleteCategory(scope.row)" type="danger" icon="el-icon-delete">删除
                    </el-button>
                </template>
            </el-table-column>
        </el-table>
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
                total: '8',
                tableData: [
                    {
                        cid: 1,
                        cname: '国产水果',
                    }
        ]
            }
        },
        methods: {
            filterTag(value, row) {
                return row.status === value;
            },
            deleteCategory(row) {
                const _this = this
                axios.delete('http://localhost:8089/category/deleteById/' + row.cid).then(function (resp) {
                    _this.$alert('类别' + row.cid + '删除成功！', '消息', {
                        confirmButtonText: '确定',
                        callback: action => {
                            window.location.reload()
                        }
                    })
                })
            },
            edit: function (row) {
                this.$router.push({
                    path: '/CategoryUpdate',
                    query: {
                        cid: row.cid
                    }
                });
            },
            // change(currentPage) {
            //     const _this = this
            //     axios.get('http://localhost:8183/bill/findAll/' + (currentPage - 1) + '/6').then(function (resp) {
            //         _this.tableData = resp.data.content
            //         _this.pageSize = resp.data.size
            //         _this.total = resp.data.totalElements
            //     })
            // }
        },
        created() {
            const _this = this
            axios.get('http://localhost:8089/category/selectAll').then(
                function (resp) {
                    _this.tableData = resp.data
                }
            )
        }
    }
</script>