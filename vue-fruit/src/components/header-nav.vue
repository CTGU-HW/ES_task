<template>
	<div id="header">
		<div class="nav-global">
			<div class="container">
				<h1 class="nav-logo">
					<a href="javascript:;"></a>
				</h1>
				<ul class="nav-aside">
					<li class="nav-user">
					  <router-link to="/account">个人中心</router-link>
						<!--active-->
						<div class="nav-user-wrapper">
							<div class="nav-user-list">
								<dl class="nav-user-avatar">
									<dd><span class="ng-scope"></span></dd>
									<dt class="ng-binding">+86{{phone}}</dt>
								</dl>
								<ul>
									<li class="order"><router-link to="/order" exact>我的订单</router-link></li>
									<li class="address"><router-link to="/address">收货地址</router-link></li>
									<li class="logout"><a @click="isout()">退出</a></li>
								</ul>
							</div>
						</div>
					</li>
					<!--active-->
					<car-panel class="nav-cart"></car-panel>
				</ul>

			</div>
		</div>
		<div class="nav-sub">
			<div class="nav-sub-wrapper">
				<div class="container">
					<ul class="nav-list">
						<!-- <li><a href="javascript:;">首页</a></li> -->
            <router-link to="/homepage" exact tag="li" activeClass="active">
                <a>首页</a>
            </router-link>
						<router-link to="/shop" exact tag="li" activeClass="active">
						    <a>特价水果</a>
						</router-link>
						<router-link to="/shop1" exact tag="li" activeClass="active">
						    <a>精美包装</a>
							</router-link>
						<router-link to="/shop2" exact tag="li" activeClass="active">
						    <a>国产水果</a>
							</router-link>
						<router-link to="/shop3" exact tag="li" activeClass="active">
						    <a>进口水果</a>
							</router-link>
						<router-link to="/shop4" exact tag="li" activeClass="active">
						    <a>果脯系列</a>
						</router-link>

					</ul>
				</div>
			</div>
		</div>
	</div>
</template>
<script>
import CarPanel from '@/components/car-panel'
export default {
  data(){
    return{
      phone:''
    }
  },
  components: {
    CarPanel
  },
  methods:{
    isout(){
      this.$confirm('确认登出吗, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        // alert(sessionStorage.getItem('nowUid'));
        // alert(sessionStorage.getItem('nowPhone'));
        sessionStorage.removeItem('nowUid');
        sessionStorage.removeItem('nowPhone');
        // alert(sessionStorage.getItem('nowUid'));
        // alert(sessionStorage.getItem('nowPhone'));
        this.$router.push('/user_login')
      }).catch(() => {
        window.location.reload();
      });
    }
  },
  created() {
    this.phone = sessionStorage.getItem('nowPhone')
  }
}
</script>
