package example.core.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import example.core.domain.User;
import example.core.port.UserPort;
import example.core.usecase.GetUsers;

import java.util.List;

/**
 * @author CTRLY
 * @version 1.1.0
 */
@Service
@RequiredArgsConstructor
public class GetUserService implements GetUsers {

    private final UserPort port;

    @Override
    public List<User> getUsers() {
        return port.findUsers();
    }
}
