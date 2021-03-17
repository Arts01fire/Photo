package com.yogesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yogesh.db.FileDB;

public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
