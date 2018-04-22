##一 优化
>  1 把加载配置文件和创建对象的过程，也就是spring核心配置文件，在服务器启动的时候完成

实现：
```
<!DOCTYPE web-app PUBLIC
 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >

<web-app>
  <display-name>Archetype Created Web Application</display-name>
  <!--配置监听器，添加applicationContext.xml，使服务器启动时，执行applicationContext.xml-->
  <context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>classpath:applicationContext.xml</param-value>
  </context-param>
  <!--添加监听器-->
  <listener>
    <listener-class>org.springframework.web.context.ContextCleanupListener</listener-class>
  </listener>
</web-app>
```
