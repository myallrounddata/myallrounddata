package users.application.impl;

import org.springframework.beans.factory.annotation.Autowired;
import users.api.model.UserDTO;
import users.application.GetAllUsersHandler;
import users.domain.User;
import users.mapper.Mapper;
import users.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timmygilissen on 8/12/15.
 */
public class GetAllUsersHandlerHandler implements GetAllUsersHandler {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> GetAllUsers() {

        List<UserDTO> result = new ArrayList<>();

        List<User> users = userRepository.findAll();

        for (User user:users) {
            result.add(Mapper.MapToUserDTO(user));
        }

        return result;
    }
}
