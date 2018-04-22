package edu.eurasia;
import edu.eurasia.dao.UserMapper;
import edu.eurasia.entity.UserBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MapperText {
    private ApplicationContext applicationContext;

    @Before
    public void setUp()throws Exception{
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }
    @Test
    public void findUserById() throws  Exception{
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        UserBean userBean = userMapper.findUserByIdMapper(1);
        System.out.println(userBean);
    }
}
