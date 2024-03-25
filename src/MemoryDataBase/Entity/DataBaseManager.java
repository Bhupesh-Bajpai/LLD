package MemoryDataBase.Entity;

import java.util.HashMap;

public class DataBaseManager {
    private HashMap<String,DataBase> dataBaseHashMap;

    public DataBaseManager() {
        this.dataBaseHashMap = new HashMap<>();
    }


    public DataBase craeteDataBase(String databaseName){
        if(dataBaseHashMap.containsKey(databaseName)){
            System.out.println("database already exist");
        }else{
            dataBaseHashMap.put(databaseName,new DataBase(databaseName));
        }
        return dataBaseHashMap.get(databaseName);
    }

    public void deleteDatabase(String databaseName){
        dataBaseHashMap.remove(databaseName);
    }

    public HashMap<String, DataBase> getDataBaseHashMap() {
        return dataBaseHashMap;
    }

    public void setDataBaseHashMap(HashMap<String, DataBase> dataBaseHashMap) {
        this.dataBaseHashMap = dataBaseHashMap;
    }
}
