package edu.eurasia.dao.impl;

import edu.eurasia.dao.User;
import edu.eurasia.entity.UserBean;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserImpl extends SqlSessionDaoSupport implements User {
    //继承SqlSessionDaoSupport，使用getSqlSession获取sqlSession，不用手动注入sqlSessionFactory
    public UserBean findUserById(int id) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        UserBean userBean = sqlSession.selectOne("test.findUserById",id);
        return userBean;
    }
}
