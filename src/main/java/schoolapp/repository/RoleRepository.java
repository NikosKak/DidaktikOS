package schoolapp.repository;

import schoolapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findAllByOrderByNameAsc();
}
