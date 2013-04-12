package generated;
import java.io.File;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class Controller {

	private static final Scanner sc1 = new Scanner( System.in );
	
	private Unmarshaller u;
	private Marshaller m;
	private Rezepte r;
	
	public Controller() {
		try {
            JAXBContext jc = JAXBContext.newInstance ("generated");
            Unmarshaller u = jc.createUnmarshaller();
            File f = new File ("Phase1/src/aufgabe3a.xml");
            JAXBElement element = (JAXBElement) u.unmarshal (f);

            r = (Rezepte) element.getValue ();
            System.out.println(r);
        }
		catch(JAXBException e) {
           e.printStackTrace ();
	    }
		
	
		for(Rezepte.Rezept each : r.rezept){
			System.out.print(each.getTitel());
		}
   }
	
}