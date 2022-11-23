package web.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUserById(Integer id) { return entityManager.find(User.class, id); }

    @Override
    public List<User> listUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(Integer id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }
}
