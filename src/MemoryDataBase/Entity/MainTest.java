package MemoryDataBase.Entity;

import java.util.HashMap;

public class MainTest {

    public static void main(String[] args) {
        // Create a database manager
        DataBaseManager dataBaseManager = new DataBaseManager();

        // Create a database
        DataBase myDatabase = dataBaseManager.craeteDataBase("MyDatabase");

        // Create a table in the database
        Table myTable = myDatabase.craetetable("MyTable");

        // Insert a new row into the table
        HashMap<String, String> columnsMap = new HashMap<>();
        columnsMap.put("Column1", "Value1");
        columnsMap.put("Column2", "Value2");
        myTable.insertEntry("Row1", columnsMap);

        // Read the inserted row
        HashMap<String, String> readResult = myTable.readEntry("Row1");
        System.out.println("Read Result: " + readResult);

        // Update the inserted row
        HashMap<String, String> updateValuesMap = new HashMap<>();
        updateValuesMap.put("Column1", "UpdatedValue1");
        myTable.upadteEntry("Row1", updateValuesMap);

        // Read the updated row
        readResult = myTable.readEntry("Row1");
        System.out.println("Read Updated Result: " + readResult);

        // Delete the row
        myTable.deleteEntry("Row1");

        // Attempt to read the deleted row
        readResult = myTable.readEntry("Row1");
        System.out.println("Read Result after deletion: " + readResult);

        // Drop the table
        myDatabase.droptable("MyTable");

        // Attempt to create a table with the same name again
        Table newTable = myDatabase.craetetable("MyTable");

        // Create another database (testing database creation duplication)
        DataBase duplicateDatabase = dataBaseManager.craeteDataBase("MyDatabase");

        // Delete a database
        dataBaseManager.deleteDatabase("MyDatabase");

        // Attempt to create a database with the same name again
        DataBase recreatedDatabase = dataBaseManager.craeteDataBase("MyDatabase");
    }
}
