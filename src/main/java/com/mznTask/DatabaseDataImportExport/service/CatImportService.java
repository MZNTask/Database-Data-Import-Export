package com.mznTask.DatabaseDataImportExport.service;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mznTask.DatabaseDataImportExport.entities.Cat;
import com.mznTask.DatabaseDataImportExport.repository.CatRepository;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
@Builder
public class CatImportService {
    private final CatRepository catRepository;
    public void importCatsFromJSON(String filePath) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Cat> cats = mapper.readValue(new File(filePath), new TypeReference<List<Cat>>() {});
            catRepository.saveAll(cats);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
