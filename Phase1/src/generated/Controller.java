package generated;
import generated.Rezepte.Rezept;

import java.io.File;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class Controller {
	
	private static Scanner sc1 = new Scanner( System.in );
	public static void main(String[] args) throws Exception {
      
	  Unmarshaller u;
	  Marshaller m;
	  Rezepte r;
	  ObjectFactory of = new ObjectFactory();
	  JAXBContext jc = JAXBContext.newInstance ("generated");
      u = jc.createUnmarshaller();
      m = jc.createMarshaller();
      r = (Rezepte) u.unmarshal (new File ("src/rezept.xml"));
      int f; 
  	  boolean called;  
      
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
				f = sc1.nextInt();
				called = false;
		    	for (Rezept each : r.rezept) {
		    		if(f == each.rezeptId)
		    		{
		    			called = true;
		    			System.out.println("\n\n-------------------");
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
			  			System.out.println("Brennwert > " + each.zubereitung.brennwert.getWert() + " "  + each.zubereitung.brennwert.getEinheit());
			  			System.out.println("Arbeitszeit > " + each.zubereitung.arbeitszeit.getZeit() + each.zubereitung.arbeitszeit.getEinheit());
			  			System.out.println("Schwierigkeitsgrad > " + each.zubereitung.schwierigkeitsgrad.toString());
			  			System.out.println("\n" + each.zubereitung.text.toString());
			  			
			  			System.out.println("...................");
			  			System.out.println("Kommentare");
			  			System.out.println("...................\n\n");
			  			
			  			for (Rezept.Kommentare.Kommentar v :each.kommentare.kommentar) {
			  				System.out.println("...................");
			  				System.out.println("KommentarID > " + v.getKommentarId());
			  				System.out.println("...................");
			  				System.out.println("Nutzer > "  + v.getNutzer());
			  				System.out.println("Avatar > " + v.getAvatar());
			  				System.out.println("Datum > " + v.zeitstempel.getTag() + "." + v.zeitstempel.getMonat() + "." + v.zeitstempel.getJahr());
			  				System.out.println("\n" + v.text);
			  				System.out.println("");
			  			}
			  			System.out.println("-------------------\n\n");
			  			break;
		    			
		    		}
				}
		    	if(!called)
	    		{
	    			System.out.println("\n-------------------");
	    			System.out.println("Das Rezept ist leider nicht vorhanden!");
	    			System.out.println("-------------------\n");
	    		}
		    	break;
		    
		    case 3:
		    	System.out.println("Bitte geben sie die Rezept ID vom Rezept an welches sie Kommentieren wollen ");
		    	System.out.print("Eingabe: ");
				f = sc1.nextInt();
				called = false;
		    	for (Rezept each : r.rezept) {
		    		if(f == each.rezeptId)
		    		{
		    			called = true;
		    			String name, nachricht;
		    			System.out.print("Bitte geben sie ihren Namen an : ");
		    			name = readLine();
		    			System.out.print("Bitte geben sie ihr Kommentar ab: ");
		    			nachricht = readLine();
		    			Rezepte.Rezept.Kommentare.Kommentar com ;
		    			com = of.createRezepteRezeptKommentareKommentar();
		    			com.setAvatar("unset");
		    			com.setHilfreich("nein");
		    			com.setNutzer(name);
		    			com.setText(nachricht);
		    			com.setKommentarId((each.kommentare.kommentar.size()+1));
		    			Rezepte.Rezept.Kommentare.Kommentar.Zeitstempel zs;
		    			zs = of.createRezepteRezeptKommentareKommentarZeitstempel();
		    			java.util.Date now = new java.util.Date();
		    	        java.text.SimpleDateFormat day = new java.text.SimpleDateFormat("dd");
		    	        java.text.SimpleDateFormat month = new java.text.SimpleDateFormat("MM");
		                java.text.SimpleDateFormat yearTHOUSEND= new java.text.SimpleDateFormat("yyyy");
		                int dd = Integer.parseInt(day.format(now));  
		                int mm = Integer.parseInt(month.format(now));
		                int yy = Integer.parseInt(yearTHOUSEND.format(now));
		                zs.setTag(dd);
		                zs.setMonat(mm);
		                zs.setJahr(yy);
		                com.setZeitstempel(zs);
		                each.kommentare.kommentar.add(com);
		                System.out.println("Kommentar wurde abgegeben !\n\n");
		                break;
		    		}
		    	}
		    	if(!called)
	    		{
	    			System.out.println("-------------------");
	    			System.out.println("Das Rezept ist leider nicht vorhanden!");
	    			System.out.println("-------------------");
	    		}
		    	break;
		    	
		  }
		  x = menu();
	  }
      m.marshal(r,new File("src/rezept.xml"));
}
	  
   
	 public static String readLine() {
		 return new Scanner(System.in).nextLine();
		  }
	
	public static int menu(){
		System.out.println("Willkommen bei Chefkoch.de");
		System.out.println();
		System.out.println( "Bitte wählen Sie aus:" );
		System.out.println( "\t1 - Rezeptübersicht anzeigen" );
		System.out.println( "\t2 - Rezept anzeigen" );
		System.out.println( "\t3 - Rezept kommentieren" );
		System.out.println( "\t0 - Beenden und speichern" );

		System.out.print( "Eingabe: " );
		return sc1.nextInt();
	}
	
	public static void titles() {
		
	}
}