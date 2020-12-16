<template>
	<div id="main">
    <header-nav></header-nav>
	    <div class="home">
      <el-carousel :interval="2000" height="400px" style="width: 100%;margin:0 auto">
        <el-carousel-item v-for="item in imgArr" >
          <img :src="item.imgSrc" height="100%" style="width: 90%;margin:0 auto"/>
        </el-carousel-item>
      </el-carousel>
    </div>
		<div class="sku-box store-content">
			<div class="sort-option">
				<ul class="line clear">
					<li><a href="javascript:;" class="active"></a></li>

				</ul>
			</div>
			<div class="gray-box">
				<div class="item-box">
							<div class="categoryTitle">
                <span style="margin-left: 30px">国产水果</span>
              </div>
					<shop-item key="index" v-for="item,index in goodsShow3" :item="item"></shop-item>
				</div>
			</div>
		</div>
		<div class="sku-box store-content">
			<div class="sort-option">
				<ul class="line clear">
					<li><a href="javascript:;" class="active"></a></li>

				</ul>
			</div>
			<div class="gray-box">
				<div class="item-box">
							<div class="categoryTitle">
                <span style="margin-left: 30px">进口水果</span>
              </div>
					<shop-item key="index" v-for="item,index in goodsShow4" :item="item"></shop-item>
				</div>
			</div>
		</div>
    <div class="sku-box store-content">
      <div class="sort-option">
        <ul class="line clear">
          <li><a href="javascript:;" class="active"></a></li>

        </ul>
      </div>
      <div class="gray-box">
        <div class="item-box">
          <div class="categoryTitle">
            <span style="margin-left: 30px">特价水果</span>
          </div>
          <shop-item key="index" v-for="item,index in goodsShow1" :item="item"></shop-item>
        </div>
      </div>
    </div>
    <div class="sku-box store-content">
      <div class="sort-option">
        <ul class="line clear">
          <li><a href="javascript:;" class="active"></a></li>

        </ul>
      </div>
      <div class="gray-box">
        <div class="item-box">
          <div class="categoryTitle">
            <span style="margin-left: 30px">果脯系列</span>
          </div>
          <shop-item key="index" v-for="item,index in goodsShow5" :item="item"></shop-item>
        </div>
      </div>
    </div>
    <div class="sku-box store-content">
      <div class="sort-option">
        <ul class="line clear">
          <li><a href="javascript:;" class="active"></a></li>

        </ul>
      </div>
      <div class="gray-box">
        <div class="item-box">
          <div class="categoryTitle">
            <span style="margin-left: 30px">精美包装</span>
          </div>
          <shop-item key="index" v-for="item,index in goodsShow2" :item="item"></shop-item>
        </div>
      </div>
    </div>
    <prompt v-if="maxCount"></prompt>
    <el-backtop></el-backtop>
  </div>
</template>


<script>
  import "../plugins/iview"
  import "../plugins/element.js"
  import headerNav from '@/components/header-nav'
  import goodData from '@/lib/newGoodsData'
  import shopItem from '@/components/shop-item'
  import prompt from '@/components/prompt'
export default {

  data () {
    return {
      goodsList: goodData,
      goodsShow1: [],
      goodsShow2: [],
      goodsShow3: [],
      goodsShow4: [],
      goodsShow5: [],
	    imgArr: [
          {
            imgSrc: require("../assets/img/1.jpg"),
          },
          {
            imgSrc: require("../assets/img/2.jpg"),
          },
          {
            imgSrc: require("../assets/img/3.jpg"),
          },
        ]
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
        // this.$axios({
        //   method:'get',
        //   url:'http://localhost:8089/products/selectAll'
        // }).then(function (response) {
        //   // switch (response.data.cid) {
        //   //
        //   // }
        //   // alert(response.data[0].cid)
        //   for (let i = 0;i < response.data.length;i++){
        //     switch (response.data[i].cid) {
        //       case 1:
        //         _this.goodsShow1
        //     }
        //   }
        //   _this.goodsShow = response.data;
        // })
        _this.$axios({
          method:'get',
          url:'http://localhost:8089/products/findByCid/1'
        }).then(function (response) {
          _this.goodsShow1 = response.data;
        });
        _this.$axios({
          method:'get',
          url:'http://localhost:8089/products/findByCid/2'
        }).then(function (response) {
          _this.goodsShow2 = response.data;
        });
        _this.$axios({
          method:'get',
          url:'http://localhost:8089/products/findByCid/3'
        }).then(function (response) {
            _this.goodsShow3 = response.data;
        });
        _this.$axios({
          method:'get',
          url:'http://localhost:8089/products/findByCid/4'
        }).then(function (response) {
          _this.goodsShow4 = response.data;
        });
        _this.$axios({
          method:'get',
          url:'http://localhost:8089/products/findByCid/5'
        }).then(function (response) {
          _this.goodsShow5 = response.data;
        });
    }
  }
}
</script>

<style>
  div.categoryTitle {
    background-color: #8ac6ca;
    font-size: 30px;
    font-weight: bold;
    color: #646464;
  }
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
