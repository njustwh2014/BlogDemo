## 简介



## 项目结构
```
├── back-end -- 后端
|  └── blog -- 后端客户系统
|     ├── src
|     |  ├── main
|     |  |  ├── java-cn-edu-seu-wh-blog
|     |  |  |                 ├── aspect -- 日志切面
|     |  |  |                 ├── async -- 异步消息队列
|     |  |  |                 ├── configuration -- 配置类
|     |  |  |                 ├── controller -- 控制层
|     |  |  |                 ├── dao -- dao层
|     |  |  |                 ├── interceptor -- 拦截器配置
|     |  |  |                 ├── jedis -- jedis配置
|     |  |  |                 ├── mapper -- mapper接口
|     |  |  |                 ├── model -- model层
|     |  |  |                 ├── result -- 返回前端数据封装
|     |  |  |                 ├── service --service层
|     |  |  |                 └── utils --常用工具类
|     |  |  └── resources -- 配置文件和一些静态资源
|     |  └── test
|     └── target
├── front-end -- 前端
|  └── blogapp -- 前端用户界面
|     ├── build 
|     ├── config
|     ├── dist
|     ├── node_modules
|     ├── src
|     |  ├── api -- 接口
|     |  ├── assets -- 静态文件
|     |  ├── components -- 组件
|     |  |  ├── common -- 常用组件
|     |  |  |  ├── carousel
|     |  |  |  ├── markdown --markdown组件
|     |  |  |  ├── mssage -- 消息组件
|     |  |  |  └── scrollPage -- 分页组件
|     |  |  ├── userinfo -- 用户信息组件
|     |  |  ├── userinfonew
|     |  |  └── view -- 视图
|     |  ├── request -- 请求配置
|     |  ├── router
|     |  ├── store
|     |  └── util
|     ├── static
|     └── test        
└── resources
```

## 技术栈

### 后端技术

技术 | 说明 | 地址
----|----|----
Spring Boot | 新一代 JavaEE 开发标准 | [GitHub](https://github.com/spring-projects/spring-boot)
TkMyBatis | 基于 MyBatis 二次开发的轻量级框架，用于简化 MyBatis 操作 | [GitHub](https://github.com/abel533/Mapper)
MyBatisGenerator | Maven 插件，用于 MyBatis 相关代码生成 | [官网](http://www.mybatis.org/generator/)
MybatisCodeHelper | Intellij IDEA 插件，用于 MyBatis 相关代码生成 | [官网](https://plugins.jetbrains.com/plugin/9837-mybatiscodehelperpro)
PageHelper | MyBatis 分页插件 | [GitHub](https://github.com/pagehelper/Mybatis-PageHelper)
Swagger | API 文档生成工具 | [GitHub](https://github.com/swagger-api/swagger-ui)
HikariCP | 数据库连接池 | [GitHub](https://github.com/brettwooldridge/HikariCP)
Docker | 容器化引擎 | [官网](https://www.docker.com/)
Docker Compose | 容器编排工具 | [官网](https://docs.docker.com/compose/)
Mysql | 关系型数据库 | [官网](https://www.mysql.com/cn/)
Redis | 非关系型数据库 | [官网](https://redis.io/)
Nginx | 高性能的HTTP和反向代理web服务器 | [官网](https://www.nginx.com/)

## 前端技术

技术 | 说明 | 地址
----|----|----
Vue | 前端框架，MVVM 模式的实现者 | [GitHub](https://github.com/vuejs/vue)
Vue CLI | Vue 脚手架，基于 NodeJS | [GitHub](https://github.com/vuejs/vue-cli)
Vue Router | Vue 路由框架 | [GitHub](https://github.com/vuejs/vue-router)
Vuex | Vue 全局状态管理框架 | [GitHub](https://github.com/vuejs/vuex)
Axios | 前端 HTTP 框架 | [GitHub](https://github.com/axios/axios)
Element UI | 饿了么 UI 框架 | [官网](https://element.eleme.cn)
Vue Element Admin | 基于 Element UI 的前端后台解决方案 | [GitHub](https://github.com/PanJiaChen/vue-element-admin)
Vue Image Crop Upload | Vue 图片剪裁上传组件 | [GitHub](https://github.com/dai-siki/vue-image-crop-upload)

## 配置项以及如何启动


## 技术难点总结


## 展望
