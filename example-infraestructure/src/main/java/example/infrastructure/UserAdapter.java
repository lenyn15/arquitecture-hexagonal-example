package example.infrastructure;

import org.springframework.stereotype.Repository;
import example.core.domain.User;
import example.core.port.UserPort;

import java.util.List;

/**
 * @author CTRLY
 * @version 1.1.0
 */
@Repository
public class UserAdapter implements UserPort {

    @Override
    public List<User> findUsers() {
        return List.of(
                User.builder().name( "Test" ).build()
        );
    }
}
