package web.repository;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    User getUserById(Integer id);
    List<User> listUsers();
    void updateUser(User user);
    void deleteUser(Integer id);
}
