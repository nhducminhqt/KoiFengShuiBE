package org.example.kfs.service;

import com.fengshuisystem.demo.dto.NumberDTO;

import java.util.List;

public interface NumberService {
    List<NumberDTO> getNumbers(Integer destiny);
    List<NumberDTO> getAllNumbers();

}
