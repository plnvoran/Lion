package Writter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.thoughtworks.xstream.XStream;


public class Writer {

    public static void main(String[] args) {
        Employee e = new Employee();

       
        e.setName("Jack");
        e.setDesignation("Manager");
        e.setDepartment("Finance");

        XStream xs = new XStream();
  


        //Write to a file in the file system
        try {
            FileOutputStream fs = new FileOutputStream("e://test//employeedata.xml", true);
            
           
            xs.toXML(e, fs);
            
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}
