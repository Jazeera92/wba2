package generated;
import generated.Rezepte.Rezept;

import java.io.File;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class Controller {
	
	public static void main(String[] args) throws Exception {
      
	  Scanner sc1 = new Scanner( System.in );
		
	  Unmarshaller u;
	  Marshaller m;
	  Rezepte r;
	  
	  JAXBContext jc = JAXBContext.newInstance ("generated");
      u = jc.createUnmarshaller();
      r = (Rezepte) u.unmarshal (new File ("src/aufgabe3a.xml"));
           
	
	  for (Rezept each : r.rezept) {
		  System.out.println(each.getTitel());
	  }
   }
	
}