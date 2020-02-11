package hs.tasklistie.auth.dataAccessObject;

import hs.tasklistie.auth.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);
    User save(User user);
    User findByUserId(long userId);

}
