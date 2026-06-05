package schoolapp.service;

import schoolapp.dto.RegionReadOnlyDTO;

import java.util.List;

public interface IRegionService {
    List<RegionReadOnlyDTO> findAllRegionsSortedByName();
}
