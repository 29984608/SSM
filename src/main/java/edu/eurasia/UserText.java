package edu.eurasia;

import edu.eurasia.dao.User;
import edu.eurasia.entity.UserBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserText {
    private ApplicationContext applicationContext;

    @Before
    public void setUp()throws Exception{
        //获取spring核心配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }
    @Test
    public void findUserById() throws  Exception{
        //根据id获取注入sqlSessionFactory的方法
        User user = (User) applicationContext.getBean("userDao");
        UserBean userBean = user.findUserById(1);
        System.out.println(userBean);
    }
}
