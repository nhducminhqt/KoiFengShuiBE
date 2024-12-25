package org.example.kfs.mapper;

import com.fengshuisystem.demo.dto.ConsulationCategoryDTO;
import com.fengshuisystem.demo.entity.ConsultationCategory;
import org.mapstruct.Mapper;

@Mapper(
        config = DefaultConfigMapper.class

)
public interface ConsulationCategoryMapper extends EntityMapper<ConsulationCategoryDTO, ConsultationCategory>{
}
