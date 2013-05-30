package com.example.list;
import com.example.*;
import java.io.File;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Marshaller;

import com.example.Ulist;
import com.example.prd.Produkt;

import java.util.Scanner;

public class lemain 
{

  public static void main (String[] args) throws Exception{
    Scanner sc1= new Scanner(System.in);
    // Creating some objects and vars
    com.example.ObjectFactory oj = new com.example.ObjectFactory();
    
    JAXBContext j1;
    
    j1 = JAXBContext.newInstance("com.example.list");
    
    Unmarshaller um = j1.createUnmarshaller();
    
    Marshaller ma = j1.createMarshaller();
    
    //Listen fag = (Listen) um.unmarshal(new File("src/einkaufsliste.xml"));
    int cc=0, choice=0, i=0,y=0;
    Listen f = (Listen)((JAXBElement) um.unmarshal(new File("src/einkaufsliste.xml"))).getValue();
    for(Liste each: f.list)
    {
    	for(UserdataPublic a:each.owners.owner)
    	{
    		System.out.println(a.getEmail());
    		System.out.println(a.getUsername());
    	}
    	System.out.print("\nProdukt\t");
    	System.out.print("Marke\t");
    	System.out.print("Anzahl\t");
    	System.out.println("Preis\t\n");
    	
    	for(Listeneintrag e :each.listentrys.listentry)
    	{		
    			System.out.print(e.produkt.getBezeichnugn());
    	    	System.out.print(e.produkt.getMarke());
    	    	System.out.print(e.produkt.getPreis());
 
    	}
    }
   sc1.close();
  }

  public static String readLine() {
    return new Scanner(System.in).nextLine();
  }
}