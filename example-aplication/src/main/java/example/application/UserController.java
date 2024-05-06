package example.application;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import example.core.domain.User;
import example.core.usecase.GetUsers;

import java.util.List;

/**
 * @author CTRLY
 * @version 1.1.0
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final GetUsers getUsers;

    @GetMapping
    public List<User> getUsers() {
        return getUsers.getUsers();
    }
}
