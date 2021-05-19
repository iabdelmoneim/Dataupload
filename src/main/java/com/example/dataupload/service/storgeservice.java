package com.example.dataupload.service;

import com.example.dataupload.Controller.Controller;
import com.example.dataupload.model.datatabledefination;
import com.example.dataupload.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.print.Doc;
import java.util.List;

@Service
public class storgeservice {
    @Autowired
    private repository repository;
    public static String saveFile(MultipartFile file){
        String docname = file.getOriginalFilename();
        try{
            datatabledefination doc= new datatabledefination(docname, file.getContentType(),file.getBytes());
            return doc.save(doc);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
      return null;
    }

    public static Controller getFile(Integer fileid) {
        return null;
    }

    public List<Doc> getFiles(){
        return  repository.findAll();

    }
}
