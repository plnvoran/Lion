package Writter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;



import com.thoughtworks.xstream.XStream;

import Lion.Data.Lion;


public class WritterList {

	public static void main(String[] args) {

		XStream xs = new XStream();

	

		// Write to a file in the file system
		try {
			FileOutputStream fs = new FileOutputStream(
					"e://test//list.xml", true);

			xs.toXML(generateContacts(5), fs);

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}

	public static List<Lion> generateContacts(int count) {
		List <Lion> listOfEmp = new ArrayList<Lion>();
		
		
		for (int i=1; i<count+1; i++)
		{
			listOfEmp.add(new Lion().withState("qwert"+i));
		}

		
		return listOfEmp;
	}

}