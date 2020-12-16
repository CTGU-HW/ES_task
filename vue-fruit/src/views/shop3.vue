<template>
	<div id="main">
    <header-nav></header-nav>
		<div class="sku-box store-content">
			<div class="gray-box">
				<div class="item-box">
					<shop-item key="index" v-for="item,index in goodsShow" :item="item"></shop-item>
				</div>
			</div>
		</div>
    <prompt v-if="maxCount"></prompt>
	</div>
</template>


<script>
  import headerNav from '@/components/header-nav'
import goodData from '@/lib/newGoodsData'
import shopItem from '@/components/shop-item'
import prompt from '@/components/prompt'
export default {
  data () {
    return {
      goodsList: goodData,
      goodsShow: []
    }
  },
  watch:{
    "$route": 'reseat'
  },
  mounted(){
      this.reseat()
  },
  components: {
    shopItem,
    prompt,
    headerNav
  },
  computed: {
    maxCount () {
      return this.$store.state.maxOff
    }
  },
  methods:{
    reseat(){
      const _this = this
      this.$axios({
        method:'get',
        url:'http://localhost:8089/products/findByCid/4'
      }).then(function (response) {
        _this.goodsShow = response.data;
      })
    }
  }
}
</script>

<style>
.sku-box{
    position: relative;
}
.sort-option{
    border-top: 1px solid #D8D8D8;
    color: #999;
}
.sort-option ul{
    height: 60px;
    line-height: 60px;
}
.sort-option li{
    position: relative;
    float: left;
    padding-left: 42px;
}
.sort-option li:first-child{
	padding-left: 9px;
}
.sort-option li:before{
	content: ' ';
    display: block;
    position: absolute;
    left: 20px;
    top: 50%;
    width: 2px;
    height: 2px;
    margin-top: -1px;
    background: #C7C7C7;
}
.sort-option li:first-child:before{
	display: none;
}
.sort-option a{
	display: block;
    font-size: 12px;
    color: #999;
}
.sort-option a.active, .sort-option a:hover{
    color: #5683EA;
}
.gray-box{
	overflow: hidden;
    background: #fff;
    border-radius: 8px;
    border: 1px solid #dcdcdc;
    border-color: rgba(0,0,0,.14);
    box-shadow: 0 3px 8px -6px rgba(0,0,0,.1);
}
.sku-box .item-box{
	clear: both;
    overflow: hidden;
    margin: 0 -1px -1px -1px;
}

</style>
