package com.mznTask.DatabaseDataImportExport.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mznTask.DatabaseDataImportExport.entities.Cat;
import com.mznTask.DatabaseDataImportExport.repository.CatRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
@Builder
public class CatExportService {
    private final CatRepository catRepository;

    public void exportCatsToJSON(String filePath) {
        try {
            List<Cat> cats = catRepository.findAll();
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(filePath), cats);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
