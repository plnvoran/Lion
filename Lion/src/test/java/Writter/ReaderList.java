package Writter;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;



import com.thoughtworks.xstream.*;
import com.thoughtworks.xstream.io.xml.DomDriver;

import Lion.Data.Lion;



public class ReaderList {

    public static void main(String[] args) {
        XStream xs = new XStream(new DomDriver());
      

        try {
            FileInputStream fis = new FileInputStream("e://test//list.xml");
           
         
           // PersonList pList = (PersonList)xs.fromXML(fis);
          
            List<Lion> pList = (ArrayList<Lion>)xs.fromXML(fis);
            
            
            
         printModel (pList);
     

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }
    
    public static void printModel(List<Lion> l) {

		for (Lion p : l) {

			System.out.print(p.getState());
			System.out.println();
			
		

		}
		

	}
}
