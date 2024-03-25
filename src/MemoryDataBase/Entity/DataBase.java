package MemoryDataBase.Entity;

import java.util.Date;
import java.util.HashMap;

public class DataBase {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Table> getTableHashMap() {
        return tableHashMap;
    }

    public void setTableHashMap(HashMap<String, Table> tableHashMap) {
        this.tableHashMap = tableHashMap;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    private String name;
    private HashMap<String,Table> tableHashMap;

    private Date createdAt;

    public  DataBase(String name){
        this.name = name;
        this.tableHashMap = new HashMap<>();
        this.createdAt  =new Date();
    }

    public Table craetetable(String tableName){
        if(tableHashMap.containsKey(tableName)){
            System.out.println("table already exist");
        }else{
            Table table = new Table(tableName);
            tableHashMap.put(tableName,table);
            System.out.println("created successfully");
        }

        return tableHashMap.get(tableName);
    }

    public void droptable(String tableName){
        tableHashMap.remove(tableName);
        System.out.println("table drop successfully");
    }
}
