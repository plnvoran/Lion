package Writter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.thoughtworks.xstream.XStream;

import Lion.Data.Lion;

public class GeneratorLion {
	
	public static void main(String[] args) {
        Lion lion = new Lion();

       
       

        XStream xs = new XStream();
  


        //Write to a file in the file system
        try {
            FileOutputStream fs = new FileOutputStream("e://test//lion.xml", true);
            
           
            xs.toXML(lion, fs);
            xs.toXML(lion, fs);
            
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }

}
