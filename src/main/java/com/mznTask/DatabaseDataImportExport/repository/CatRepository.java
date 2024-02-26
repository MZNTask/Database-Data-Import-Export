package com.mznTask.DatabaseDataImportExport.repository;

import com.mznTask.DatabaseDataImportExport.entities.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat,Long> {

}
