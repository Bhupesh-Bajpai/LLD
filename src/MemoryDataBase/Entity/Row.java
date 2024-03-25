package MemoryDataBase.Entity;

import java.util.Date;
import java.util.HashMap;

public class Row {

    private String rowId;

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public HashMap<String, String> getColumnsValueMap() {
        return columnsValueMap;
    }

    public void setColumnsValueMap(HashMap<String,String> columnsValueMap) {
        this.columnsValueMap = columnsValueMap;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    private HashMap<String,String> columnsValueMap;
    private Date createdAt;
    private Date updatedAt;


    public Row(String rowId, HashMap<String, String> columnsValueMap, Date createdAt, Date updatedAt) {
        this.rowId = rowId;
        this.columnsValueMap = columnsValueMap;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }




}
