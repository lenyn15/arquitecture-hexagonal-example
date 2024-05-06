package example.core.port;

import example.core.domain.User;

import java.util.List;

/**
 * @author CTRLY
 * @version 1.1.0
 */
public interface UserPort {
    List<User> findUsers();
}
