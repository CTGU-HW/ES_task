<style scoped>
    .el-header {
        background-color: #B3C0D1;
        color: #333;
        line-height: 60px;
    }

    .el-aside {
        color: #333;
    }
</style>
<template>
        <el-container style="height: 577px; border: 1px solid #eee">
            <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
                <el-menu router :default-openeds="['0','1','2','3']">
                    <el-submenu index="1">
                        <template slot="title"><i class="el-icon-menu"></i>商品管理
                        </template>
                        <el-menu-item-group>
                            <el-menu-item index="/ProductsManage">查询商品</el-menu-item>
                            <el-menu-item index="/AddProducts">添加商品</el-menu-item>
                        </el-menu-item-group>
                    </el-submenu>
                    <el-submenu index="2">
                        <template slot="title"><i class="el-icon-user-solid"></i>用户管理
                        </template>
                        <el-menu-item-group>
                            <el-menu-item index="/UserManage">查询用户</el-menu-item>
                        </el-menu-item-group>
                    </el-submenu>
                    <el-submenu index="3">
                        <template slot="title"><i class="el-icon-crop"></i>分类管理</template>
                        <el-menu-item-group>
                            <el-menu-item index="/CategoryManage">查询分类</el-menu-item>
                        </el-menu-item-group>
                        <el-menu-item-group>
                            <el-menu-item index="/AddCategory">添加分类</el-menu-item>
                        </el-menu-item-group>
                    </el-submenu>
                </el-menu>
            </el-aside>

            <el-container style="border: 10px solid #DCDFE6">
                <el-main>
                    <router-view></router-view>
                </el-main>
            </el-container>
        </el-container>
</template>
<script>
    export default {

    }
</script>
