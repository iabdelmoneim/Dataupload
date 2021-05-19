package com.example.dataupload.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class datatabledefination {
    @Id
    private Integer id;

    private String Name;
    private String newspaperName;
    private String appInfo;
    private String editionDefId;

    @Lob
    private byte[] data;

    public datatabledefination(Integer id, String name, String newspaperName, String appInfo, String editionDefId, byte[] data) {
        this.id = id;
        Name = name;
        this.newspaperName = newspaperName;
        this.appInfo = appInfo;
        this.editionDefId = editionDefId;
        this.data = data;
    }

    public datatabledefination(String docname, String contentType, byte[] bytes) {

    }

    public datatabledefination() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNewspaperName() {
        return newspaperName;
    }

    public void setNewspaperName(String newspaperName) {
        this.newspaperName = newspaperName;
    }

    public String getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(String appInfo) {
        this.appInfo = appInfo;
    }

    public String getEditionDefId() {
        return editionDefId;
    }

    public void setEditionDefId(String editionDefId) {
        this.editionDefId = editionDefId;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String save(datatabledefination doc) {
        return null;
    }
}

