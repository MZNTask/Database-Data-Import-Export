package com.mznTask.DatabaseDataImportExport.Controller;

import com.mznTask.DatabaseDataImportExport.service.CatExportService;
import com.mznTask.DatabaseDataImportExport.service.CatImportService;
import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@CrossOrigin(origins = "*")
@Builder
public class CatController {
    private final CatExportService catExportService;
    private final CatImportService catImportService;
    @PostMapping("/import")
    public String importCats(String filePath) {
        catImportService.importCatsFromJSON(filePath);
        return "Cats imported successfully";
    }
    @GetMapping("/export")
    public String exportCats(String filePath) {
        catExportService.exportCatsToJSON(filePath);
        try {
            String jsonContent = new String(Files.readAllBytes(Paths.get(filePath)));
            return jsonContent;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error reading JSON file: " + e.getMessage();
        }
    }


}
