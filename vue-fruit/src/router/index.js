import Vue from 'vue'
import VueRouter from 'vue-router'
import '@/assets/css/reset.css'
import '@/assets/css/header.css'

Vue.use(VueRouter)
import Shop4 from '@/views/shop4'
import Shop3 from '@/views/shop3'
import Shop2 from '@/views/shop2'
import Shop1 from '@/views/shop1'
import Shop from '@/views/shop'
import Item from '@/views/item'
import Cart from '@/views/cart'
import Checkout from '@/views/checkout'
import Payment from '@/views/payment'
import Account from '@/views/account'
import Order from '@/views/account/order'
import Address from '@/views/account/address'
import user_login from "../views/user_login";
import user_register from "../views/user_register";
import Homepage from "../views/homepage";
import myaccount from "../views/account/myaccount";

// export default new Router({
//   mode: 'history',
//   scrollBehavior (to, from, savePosition) {
//     if (savePosition) {
//       return savePosition
//     } else {
//       return {x: 0, y: 0}
//     }
//   },
  const routes = [
    {
      path:'/',
      redirect:'/user_login'
    },
    { path:'/user_login',
      name:"Login",
      component: user_login,
      // redirect:'/Login',
      // show:true,
      // children:[
      //   {path: 'Login',component: Login}
      // ]
    },
    { path:'/user_register',
      name:"Register",
      component: user_register
    },
    {
      path: '/homepage',
      name: 'Homepage',
      component: Homepage
    },
    {
      path: '/item',
      name: 'Item',
      component: Item
    },
    {
      path: '/shop',
      name: 'Shop',
      component: Shop
    },
	{
      path: '/shop1',
      name: 'Shop1',
      component: Shop1
    },
	{
      path: '/shop2',
      name: 'Shop2',
      component: Shop2
    },
	{
      path: '/shop3',
      name: 'Shop3',
      component: Shop3
    },
	{
      path: '/shop4',
      name: 'Shop4',
      component: Shop4
    },
    {
      path: '/cart',
      name: 'Cart',
      component: Cart
    },
    {
      path: '/checkout',
      name: 'Checkout',
      component: Checkout
    },
    {
      path: '/payment',
      name: 'Payment',
      component: Payment
    },
    {
      path: '/account',
      component: Account,
      redirect:'/order',
      children: [
        {
          path: '/order',
          name: 'Order',
          component: Order
        },
        {
          path: '/address',
          name: 'Address',
          component: Address
        }
      ]
    }
  ]
// })
const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
