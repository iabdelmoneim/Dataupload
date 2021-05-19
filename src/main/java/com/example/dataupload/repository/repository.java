package com.example.dataupload.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.print.Doc;

public interface repository extends JpaRepository<Doc,Integer>{
}
