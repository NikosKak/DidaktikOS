package schoolapp.service;

import schoolapp.dto.RoleReadOnlyDTO;
import schoolapp.mapper.Mapper;
import schoolapp.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class RoleServiceImpl implements IRoleService {
    private final RoleRepository roleRepository;
    private final Mapper mapper;

    @Override
    public List<RoleReadOnlyDTO> findAllRolesSortedByName() {
        return roleRepository.findAllByOrderByNameAsc()
                .stream()
                .map(mapper::mapToRoleReadOnlyDTO)
                .toList();
    }
}
