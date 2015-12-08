package users.application;

import users.api.model.UserDTO;
import users.command.GetUserByReferenceCommand;

/**
 * Created by timmygilissen on 8/12/15.
 */
public interface GetUserByReferenceHandler {
    UserDTO getUserByReference(GetUserByReferenceCommand getUserByReferenceCommand);
}
