<template>
  <div id="app">
<!--  	<header-nav></header-nav>-->
  	<router-view v-if="isRouterAlive"></router-view>
  </div>
</template>

<script>
  import "../src/plugins/iview.js"
  import "../src/plugins/element.js"
  // import headerNav from '@/components/header-nav'  type="text/javascript" src="../src/plugins/iview.js"

export default {
  name: 'app',
  // components: {
  //   headerNav
  // }
  data () {
    return {
      isRouterAlive: true
    }
  },
  methods: {
    reload () {
      this.isRouterAlive = false
      this.$nextTick(function() {
        this.isRouterAlive = true
      })
    }
  },
  provide () {
    return {
      reload: this.reload
    }
  }
}
</script>

<style>
</style>
