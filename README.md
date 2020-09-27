# MyMicroService
基于微服务架构的综合项目

基础服务：
core: 菜单管理、redis、elasticsearch
user: 用户管理、角色管理
auth: 登录、鉴权、安全认证（SpringSecurity、OAuth2）
message：消息收发、消息管理（kafka）
flow：流程管理(flowyable)
job: 任务管理、定时任务(quartz)

业务服务：
sale(秒杀)

微服务组件：
nacos
zuul
feign
hystrix

Spring扩展点：
1、事件发布、监听
2、容器扩展
3、FactoryBeanPostProcessor
4、InitializingBean
5、BeanPostProcessor
6、Aware接口
7、SPI机制

功能模块：
1、动态生成接口；
2、异步执行器，动态监听配置文件，参照Nacos配置中心；
3、分布式定时任务实现；
4、高并发请求，秒杀模块；
