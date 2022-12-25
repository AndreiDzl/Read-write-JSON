package mainpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JsonReadWrite {

    public void readFile(String fileName,String personJSON) {
        GsonBuilder gb = new GsonBuilder();
        Gson gson = gb.create();
        Person p = gson.fromJson(personJSON, Person.class);
        System.out.println(p);
    }

    public String writeFile(String fileName, Person p) {
        GsonBuilder gb = new GsonBuilder();
        Gson gson = gb.create();
        String personJSon = gson.toJson(p);
        System.out.println(gson.toJson(p));
        
          try {
         FileWriter fw = new FileWriter(fileName);
         gson.toJson(p,fw);
         fw.close();

        } catch (FileNotFoundException ex) {
              System.out.println(ex.getMessage());
        } catch (IOException ex) {
              System.out.println(ex.getMessage());
        }
        return personJSon;
        //ToDO de scris in fisier
      
    }
}
