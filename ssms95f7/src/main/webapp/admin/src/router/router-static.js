import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import nongjiale from '@/views/modules/nongjiale/list'
    import news from '@/views/modules/news/list'
    import kefangyuding from '@/views/modules/kefangyuding/list'
    import discusszhusuxinxi from '@/views/modules/discusszhusuxinxi/list'
    import discussmeishixinxi from '@/views/modules/discussmeishixinxi/list'
    import huodongxinxi from '@/views/modules/huodongxinxi/list'
    import discusshuodongxinxi from '@/views/modules/discusshuodongxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import users from '@/views/modules/users/list'
    import forum from '@/views/modules/forum/list'
    import discussnongjiale from '@/views/modules/discussnongjiale/list'
    import zhusuxinxi from '@/views/modules/zhusuxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import huodongbaoming from '@/views/modules/huodongbaoming/list'
    import yonghupingjia from '@/views/modules/yonghupingjia/list'
    import chat from '@/views/modules/chat/list'
    import meishixinxi from '@/views/modules/meishixinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/nongjiale',
        name: '农家乐',
        component: nongjiale
      }
          ,{
	path: '/news',
        name: '系统公告',
        component: news
      }
          ,{
	path: '/kefangyuding',
        name: '客房预订',
        component: kefangyuding
      }
          ,{
	path: '/discusszhusuxinxi',
        name: '住宿信息评论',
        component: discusszhusuxinxi
      }
          ,{
	path: '/discussmeishixinxi',
        name: '美食信息评论',
        component: discussmeishixinxi
      }
          ,{
	path: '/huodongxinxi',
        name: '活动信息',
        component: huodongxinxi
      }
          ,{
	path: '/discusshuodongxinxi',
        name: '活动信息评论',
        component: discusshuodongxinxi
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/forum',
        name: '论坛交流',
        component: forum
      }
          ,{
	path: '/discussnongjiale',
        name: '农家乐评论',
        component: discussnongjiale
      }
          ,{
	path: '/zhusuxinxi',
        name: '住宿信息',
        component: zhusuxinxi
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/huodongbaoming',
        name: '活动报名',
        component: huodongbaoming
      }
          ,{
	path: '/yonghupingjia',
        name: '用户评价',
        component: yonghupingjia
      }
          ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
          ,{
	path: '/meishixinxi',
        name: '美食信息',
        component: meishixinxi
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
