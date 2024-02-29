package Fileses.Log;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Loger {
    private final static Logger logger = Logger.getLogger(Loger.class.getName());
    public static void main(String[] args) {
        LogManager.getLogManager().reset();
        try {
            FileHandler fileHandler = new FileHandler("src/DATA/log.log");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader input = new FileReader("src/DATA/Holidays.json");
            JSONTokener jsonTokener = new JSONTokener(input);
            JSONArray jsonArray = new JSONArray(jsonTokener);
            System.out.println(jsonArray.get(0).toString());

            for (Object el :jsonArray){
                String s = ((JSONObject)el).getString("name");
                logger.severe(s);
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //вывести в лог



    }
}
