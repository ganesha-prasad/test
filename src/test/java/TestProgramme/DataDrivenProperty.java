package TestProgramme;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataDrivenProperty {
    public static void main(String[] args) throws  IOException {
        FileInputStream fis =new FileInputStream("src/test/resources/data/test.property");//GET JAVA REPRESENTATIVE OBJECT OF PHYSICAL FILE
        Properties ps=new Properties();// OBJECT OF PROPERTIES CLASS
        ps.load(fis);// LOAD PROPERTY FILE
        System.out.println(ps.getProperty("name"));
    }
}
