package ru.code.Code11Boot.dao;



import ru.code.Code11Boot.model.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    List<User> viewAll();

    User findById(Long id);

    void redact(User user);

    void delete(Long id);
}
