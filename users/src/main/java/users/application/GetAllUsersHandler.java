package users.application;

import users.api.model.UserDTO;

import java.util.List;

/**
 * Created by timmygilissen on 8/12/15.
 */
public interface GetAllUsersHandler {

    List<UserDTO> GetAllUsers();

}
