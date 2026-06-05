package schoolapp.service;

import schoolapp.core.exceptions.EntityAlreadyExistsException;
import schoolapp.core.exceptions.EntityInvalidArgumentException;
import schoolapp.dto.UserInsertDTO;
import schoolapp.dto.UserReadOnlyDTO;

public interface IUserService {
    UserReadOnlyDTO saveUser(UserInsertDTO userInsertDTO)
        throws EntityAlreadyExistsException, EntityInvalidArgumentException;
}
