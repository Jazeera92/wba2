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
      
          
      
      int x = menu(); 
      while (x > 0){
    	  
		  switch (x) {
		  	case 0:
				System.out.println( "\nProgramm wurde beendet." );
				break;
		    case 1:  
		  		for (Rezept each : r.rezept) {
		  			System.out.println("-------------------");
		  			System.out.print(each.getTitel());
		  			System.out.print(" | Rezept ID "+each.getRezeptId());
		  			System.out.println();
		  			System.out.println("-------------------");
				}
		  		break;
		    case 2:
		    	System.out.println("Bitte geben sie die Rezept ID ein");
		    	System.out.print("Eingabe: ");
				int f = sc1.nextInt();
		    	for (Rezept each : r.rezept) {
		    		if(each.getRezeptId() == f) {
		    			System.out.println("-------------------");
			  			System.out.println(each.getTitel());
			  			System.out.println("...................");
			  			System.out.println(each.getBeschreibung());
			  			for (Rezept.Bilder.Bild pic :each.bilder.bild) {
			  				System.out.print(pic.getNummer()+" ");
			  				System.out.println(pic.getQuelle()+" ");
			  				System.out.println(pic.getTitel()+" ");
			  				System.out.println("");
			  			}
			  			System.out.println("...................");
			  			System.out.println("Zutaten");
			  			System.out.println("...................");
			  			for (Rezept.Zutaten.Zutat var :each.zutaten.zutat) {
			  				System.out.print(var.getMenge()+" ");
			  				System.out.print(var.getEinheit()+" ");
			  				System.out.print(var.getName()+" ");
			  				System.out.println("");
			  			}
			  			System.out.println("...................");
			  			System.out.println("Zubereitung");
			  			System.out.println("...................");
			  			//for (Rezept.Zubereitung v :each.zubereitung) {
			  			//	System.out.println(v.getArbeitszeit()+"");
			  			//	System.out.println(v.()+"");
			  			//}	
			  			
			  			System.out.println("...................");
			  			for (Rezept.Kommentare.Kommentar v :each.kommentare.kommentar) {
			  				System.out.println(v.getAvatar()+"");
			  			}
			  			System.out.println("-------------------");
		    			break;
		    		}
		    		else 
		    			System.out.println("-------------------");
		    			System.out.println("Das Rezept ist leider nicht vorhanden!");
		    			System.out.println("-------------------");
		    		break;
				}
		    	break;
		    
		    case 3:
		    	break;
		  	
		    	
		  }
		  x = menu();
	  }
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