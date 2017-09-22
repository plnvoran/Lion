package Writter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import com.thoughtworks.xstream.*;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Reader {

    public static void main(String[] args) {
        XStream xs = new XStream(new DomDriver());
        Employee e = new Employee();

        try {
            FileInputStream fis = new FileInputStream("e://test//employeedata.xml");
            xs.fromXML(fis, e);

         
            System.out.println(e.getName());
            System.out.println(e.getDepartment());


        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}