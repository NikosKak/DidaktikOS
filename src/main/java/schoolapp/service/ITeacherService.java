package schoolapp.service;

import schoolapp.core.exceptions.EntityAlreadyExistsException;
import schoolapp.core.exceptions.EntityInvalidArgumentException;
import schoolapp.core.exceptions.EntityNotFoundException;
import schoolapp.dto.TeacherEditDTO;
import schoolapp.dto.TeacherInsertDTO;
import schoolapp.dto.TeacherReadOnlyDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface ITeacherService {
    TeacherReadOnlyDTO saveTeacher(TeacherInsertDTO teacherInsertDTO)
        throws EntityAlreadyExistsException, EntityInvalidArgumentException;

    TeacherReadOnlyDTO updateTeacher(TeacherEditDTO teacherEditDTO)
            throws EntityNotFoundException, EntityAlreadyExistsException, EntityInvalidArgumentException;

    TeacherReadOnlyDTO deleteTeacherByUUID(UUID uuid) throws EntityNotFoundException;

    TeacherEditDTO getTeacherByUUID(UUID uuid) throws EntityNotFoundException;
    public TeacherEditDTO getTeacherByUUIDDeletedFalse(UUID uuid) throws EntityNotFoundException;

    Page<TeacherReadOnlyDTO> getPaginatedTeachers(Pageable pageable);
    Page<TeacherReadOnlyDTO> getPaginatedTeachersDeletedFalse(Pageable pageable);

    boolean isTeacherExists(String uuid);
}
