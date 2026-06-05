package schoolapp.service;

import schoolapp.dto.RoleReadOnlyDTO;

import java.util.List;

public interface IRoleService {
    List<RoleReadOnlyDTO> findAllRolesSortedByName();
}
