package spring.boot.core.service;


import spring.boot.core.domain.User;

import java.util.List;

/**
 * User 业务层接口
 *
 * Created by bysocket on 24/07/2017.
 */
public interface UserService {

    List<User> findAll();

    User insertByUser(User user);
}
