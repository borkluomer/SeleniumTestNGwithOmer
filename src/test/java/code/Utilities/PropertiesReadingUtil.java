package code.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadingUtil {

    private static Properties properties = new Properties();
    //encapsulation method , data hiding

    static {
        //will get execute before everything
        //get the path and store in a string
        String pathForPropertiesFile ="configuration.properties";

        //open the file using FileInputStream method
        try{
            FileInputStream fileInputStream = new FileInputStream(pathForPropertiesFile);
            //load the file to properties object by using load method
            properties.load(fileInputStream);
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Properties File Not Found !");
        }

    }

    //this is a parameter will repentant configuration property
    public static String getProperties(String keyword){
        return properties.getProperty(keyword);
    }

}
