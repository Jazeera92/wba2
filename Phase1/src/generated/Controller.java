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
	
	private static Scanner sc1 = new Scanner( System.in );
	public static void main(String[] args) throws Exception {
      
	  Unmarshaller u;
	  Marshaller m;
	  Rezepte r;
	  
	  JAXBContext jc = JAXBContext.newInstance ("generated");
      u = jc.createUnmarshaller();
      r = (Rezepte) u.unmarshal (new File ("src/aufgabe3a.xml"));
      
      menu();    
      int x = menu();
      
	  do {
		  switch (x) {
		  	case 0:
				System.out.println( "\nProgramm wurde beendet." );
				break;
		    case 1:  
		  		for (Rezept each : r.rezept) {
				System.out.println(each.getTitel());
				  
				}
		  		break;
		  }
	  }while (x > 0);
}
	  
   
	
	public static int menu(){
		System.out.println("Willkommen bei Chefkoch.de");
		System.out.println();
		System.out.println( "Bitte wählen Sie aus:" );
		System.out.println( "\t1 - Rezeptübersicht anzeigen" );
		System.out.println( "\t2 - Rezept anzeigen" );
		System.out.println( "\t3 - Rezept kommentieren" );
		System.out.println( "\t0 - Beenden" );

		System.out.print( "Eingabe: " );
		return sc1.nextInt();
	}
	
	public static void titles() {
		
	}
}