# 图书管理系统
一个基于 SpringBoot + MyBatis + Thymeleaf 开发的完整后台管理系统

项目亮点
 1.企业级架构：严格遵循 MVC 分层设计，代码规范，结构清晰
 2.完整业务流程：用户登录 → 图书管理 → 增删改查 → 数据持久化
 3.精美可视化界面：统一的 UI 设计，响应式布局，媲美商业系统
 4.具备完整文档、规范结构、可直接部署运行
访问https://springboot-production-5580.up.railway.app/book/login，用admin/123456登录即可正常使用。

## 功能
- 用户登录
- 图书增删改查
- 分页查询
- 前后端交互

## 技术栈
SpringBoot2.7、MySQL、MyBatis、HTML、CSS、Maven
1. 环境准备
   JDK 1.8 或以上版本
   MySQL 8.0 或以上版本
   Maven 3.6 或以上版本
   IntelliJ IDEA / Eclipse（推荐 IDEA）
2. 数据库配置
   打开 MySQL，创建数据库：
   执行 SQL 脚本（项目目录下的 sql/init.sql）
   修改 application.properties 中的数据库配置：
3. 运行项目
   导入项目到 IDEA，等待 Maven 依赖下载完成
   找到启动类 BookSysytemApplication.java，右键运行
   浏览器访问：http://localhost:8080/book/login
   使用默认账号登录：
   账号：admin
   密码：123456