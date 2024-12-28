package org.example.kfs.service;

import com.fengshuisystem.demo.dto.AnimalImageDTO;

import java.util.List;

public interface AnimalImageService {
    List<AnimalImageDTO> getAllAnimalImage(Integer animalId, List<String> imgUrl);
}