package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    User getUserById(Integer id);
    List<User> listUsers();
    void updateUser(User user);
    void deleteUser(Integer id);
}
