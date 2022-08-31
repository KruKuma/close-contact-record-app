package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PeopleController {
	
	private PeopleList p1;
	
	public PeopleController() {
		p1 = new PeopleList();
	}
	
	public void addPeopleToList(String pFName, String pLName, String pID, String pPhone) {
		
		int id = Integer.parseInt(pID);
		int phone = Integer.parseInt(pPhone);
		People ap = new People(pFName, pLName, id, phone);
		p1.addPeople(ap);
		
	}
	
	public void removePeopleFromList(String pFName, String pLName) {
		
		String pName = pFName + " " + pLName;
		p1.removePeopleByName(pName);
		
	}
	
	public String getPeopleList() {
		
		String allPeople = "\0";
		
		for (int i = 0; i < p1.getSize(); i++) {
			allPeople = allPeople + p1.getPeople(i);
		}
		
		return allPeople;
	}
	
	public void readFile() {
		try {
			
			File personFile = new File("data.txt");
			Scanner sc = new Scanner(personFile);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (line.length() !=0) {
					processLine(line);
				}
			}
			
			sc.close();
		}
		
		catch (FileNotFoundException fnf) {
			System.out.println("File not found!");
			System.exit(0);
		}
	}
	
	private void processLine(String line) {
		try {
			
			String parts[] = line.split(",");
			String fName = parts[0];
			String lName = parts[1];
			String pID = parts[2];
			String pPhone = parts[3];
			
			int id = Integer.parseInt(pID);
			int phone = Integer.parseInt(pPhone);
			
			People p = new People(fName, lName, id, phone);
			p1.addPeople(p);
		}
		
		catch(NumberFormatException nfe) {
			String error = "Number conversion error in '" + line + "'  - " 
	                  + nfe.getMessage();
			System.out.println(error);
		}
		
		catch (ArrayIndexOutOfBoundsException air) {
			String error = "Not enough items in  : '" + line
			                        + "' index position : " + air.getMessage();
			System.out.println(error);
		}
	}
	
	public void writeToFile() {
		try {
			
			String allPeople = "";
			
			for (int i = 0; i < p1.getSize(); i++) {
				allPeople = allPeople + p1.getPeople(i);
			}
			
			PrintWriter myWriter = new PrintWriter("data.txt");
			myWriter.write(allPeople);
		    myWriter.close();
		      
		    } 
		
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
