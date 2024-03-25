package MemoryDataBase.Entity;

import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;

public class Table {

    private String tableName;
    private HashMap<String,Row> rows;

    private Date createdAt;


    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public HashMap<String, Row> getRows() {
        return rows;
    }

    public void setRows(HashMap<String, Row> rows) {
        this.rows = rows;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Table(String tableName) {
        this.tableName = tableName;
        this.rows = new HashMap<>();
        this.createdAt = new Date();
    }


    //     crud operations
    public void insertEntry(String rowId,HashMap<String,String> columsMap){
    if(rows.containsKey(rowId)){
            System.out.println("duplicate primary key");
        }else{
        Row row = new Row(rowId,columsMap,new Date(),new Date());
        rows.put(rowId,row);
        System.out.println("successfully added a new row");
    }
    }




    public void upadteEntry(String rowId,HashMap<String,String> valuesMap){
        Row row = rows.get(rowId);
        valuesMap.forEach((k,v)->{
            row.getColumnsValueMap().put(k,v);
        });
        System.out.println("row updated successfully");
    }

    public void deleteEntry(String rowId){
        rows.remove(rowId);
        System.out.println("row deleted successfully");
    }
    public HashMap<String,String> readEntry(String rowId){
        return rows.get(rowId).getColumnsValueMap();
    }



}
