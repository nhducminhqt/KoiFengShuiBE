package org.example.kfs.service;

import com.fengshuisystem.demo.dto.AnimalCategoryDTO;
import com.fengshuisystem.demo.dto.PageResponse;

import java.util.List;

public interface AnimalService {
    AnimalCategoryDTO createAnimal(AnimalCategoryDTO request);
    PageResponse<AnimalCategoryDTO> getAnimalsBySearch(String search, int page, int size);
    PageResponse<AnimalCategoryDTO> getAnimals(int page, int size);
    void deleteAnimal(Integer id);
    AnimalCategoryDTO updateAnimal(Integer id, AnimalCategoryDTO request);
    List<AnimalCategoryDTO> getAnimalCategoryByColorId(int color);
    AnimalCategoryDTO getAnimalById(Integer id);
    List<AnimalCategoryDTO> getAllAnimalCategory();
    PageResponse<AnimalCategoryDTO> getAnimalsByDestiny(List<String> destiny, int page, int size);
    PageResponse<AnimalCategoryDTO> getAnimalsByDestinyAndName(List<String> destiny, String name, int page, int size);

}
