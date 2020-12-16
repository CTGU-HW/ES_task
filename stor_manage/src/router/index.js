import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from "../views/Login";
import Manage from "../views/Manage";
import ProductsManage from "../views/ProductsManage";
import AddProducts from "../views/AddProducts";
import UserManage from "../views/UserManage";
import CategoryManage from "../views/CategoryManage";
import ProductsUpdate from "../views/ProductsUpdate";
import UserUpdate from "../views/UserUpdate";
import CategoryUpdate from "../views/CategoryUpdate";
import AddCategory from "../views/AddCategory";

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        redirect: '/Login'
    },
    {
        path: '/Login',
        component: Login
    },
    {
        path: '/Manage',
        component: Manage,
        redirect: '/ProductsManage',
        show: true,
        children: [
            {path: '/ProductsManage', component: ProductsManage},
            {path: '/AddProducts', component: AddProducts},
            {path: '/UserManage', component: UserManage},
            {path: '/CategoryManage', component: CategoryManage},
            {path: '/ProductsUpdate', component: ProductsUpdate, show: false},
            {path: '/UserUpdate', component: UserUpdate, show: false},
            {path: '/CategoryUpdate', component: CategoryUpdate, show: false},
            {path: '/AddCategory', component: AddCategory, show: false}
        ]
    }
]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
})

export default router
