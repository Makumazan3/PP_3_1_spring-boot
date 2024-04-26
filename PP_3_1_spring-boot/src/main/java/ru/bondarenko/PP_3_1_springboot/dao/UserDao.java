package ru.bondarenko.PP_3_1_springboot.dao;


import ru.bondarenko.PP_3_1_springboot.model.User;

import java.util.List;

public interface UserDao {
    List<User> showAllUser();

    User getUserById(long id);

    void save(User user);

    void update(long id, User user);

    void delete(long id);
}
