<template>
    <div id="app">
        <el-table :data="tableData" border style="width: 100%;">
            <el-table-column
                    prop="pname"
                    label="名称"
            >
            </el-table-column>
            <el-table-column
                    prop="pnametitle"
                    label="描述"
            >
            </el-table-column>
            <el-table-column
                    prop="price"
                    label="价格"
            >
            </el-table-column>
            <el-table-column
                    prop="aliimage"
                    label="图片路径"
            >
            </el-table-column>
            <el-table-column
                    prop="limitnum"
                    label="限购数量"
            >
            </el-table-column>
            <el-table-column
                    prop="cid"
                    label="分类编号"
            >
            </el-table-column>
            <el-table-column
                    fixed="right"
                    label="修改   /   删除">
                <template slot-scope="scope">
                    <el-button style="margin-left: -10px" size="small" @click="edit(scope.row)" type="primary" icon="el-icon-edit">修改</el-button>
                    <el-button size="small" @click="deleteProduct(scope.row)" type="danger" icon="el-icon-delete">删除</el-button>
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
                pageSize:'5',
                total:'12',
                // currentPage3:1,
                tableData: [
                    {
                        pid:1,
                        pname: '草莓',
                        pnameTitle: '特价新鲜水果来啦，好吃又营养，快来选购叭',
                        price: 12.0,
                        aliImage: '/static/img/特价水果/草莓.jpg',
                        limitNum:5,
                        cid: 1
                    }
                ]
            }
        },
        methods: {
            deleteProduct(row){
                const _this = this
                axios.delete('http://localhost:8089/products/deleteById/'+row.pid).then(function(resp){
                    _this.$alert('《'+row.pname+'》删除成功！', '消息', {
                        confirmButtonText: '确定',
                        callback: action => {
                            window.location.reload()
                        }
                    })
                })
            },
            edit(row) {
                this.$router.push({
                    path: '/ProductsUpdate',
                    query: {
                        pid: row.pid
                    }
                });
            },
            // change(currentPage) {
            //     const _this = this
            //     axios.get('http://localhost:8183/book/findAll/' + (currentPage - 1) + '/6').then(function (resp) {
            //         _this.tableData = resp.data.content
            //         _this.pageSize = resp.data.size
            //         _this.total = resp.data.totalElements
            //     })
            // }
        },
        created() {
            const _this = this
            axios.get('http://localhost:8089/products/selectAll').then(
                function (resp) {
                    _this.tableData = resp.data
                }
            )
        }


    }
</script>