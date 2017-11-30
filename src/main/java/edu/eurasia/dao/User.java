package edu.eurasia.dao;

import edu.eurasia.entity.UserBean;

public interface User {
    UserBean findUserById(int id) throws Exception;
}
