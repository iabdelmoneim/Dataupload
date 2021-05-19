package com.example.dataupload.Controller;

import com.example.dataupload.service.storgeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.model.IDocType;

import javax.annotation.Resource;
import javax.print.Doc;
import java.util.List;


@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private storgeservice service ;
    private MultipartFile file;

    @GetMapping("/")
    public String get(Model model){
        List<Doc> docs= service.getFiles();
        model.addAttribute("docs", docs);
        return "doc";
    }

    @PostMapping("/uploadFiles")
    public String uploadMultipleDiles(@RequestParam("files")MultipartFile[] files){
        storgeservice.saveFile(file);
        return null;
    }
    @GetMapping("/downloadFile/{fileid}")
    public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Integer fileid){
        Doc doc= (Doc) storgeservice.getFile(fileid).service;
        return (ResponseEntity<ByteArrayResource>) ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(String.valueOf(doc.getDocFlavor())));
    }


}
