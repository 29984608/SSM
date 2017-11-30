package edu.eurasia.dao;

import edu.eurasia.entity.UserBean;

public interface UserMapper {
    UserBean findUserByIdMapper(int id) throws Exception;
}
