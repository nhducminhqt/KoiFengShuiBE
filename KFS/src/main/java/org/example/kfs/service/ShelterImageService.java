package org.example.kfs.service;

import com.fengshuisystem.demo.dto.ShelterImageDTO;

import java.util.List;

public interface ShelterImageService {
    public List<ShelterImageDTO> getAllShelterImage(Integer shelterId, List<String> imgUrl);
}