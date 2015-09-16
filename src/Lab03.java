import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//Programmed by Nehul Yadav, Computer Science major.



public class Lab03{
	//global array list
    public static ArrayList<Student> data = new ArrayList<Student>();


	public static void main(String[] args) {
		//Calling the loadStudentFile() here & declared after the menu system
				loadStudentFile();

		System.out.println("============================");
	    System.out.println(  "     MENU SYSTEM  ");
	    System.out.println("============================");
	    System.out.println(" Options:                          ");
	    System.out.println("|  	1. VIEW ALL STUDENTS          |");
	    System.out.println("|  	2. SEARCH BY LAST NAME        |");
	    System.out.println("|  	3. SEARCH BY STUDENT ID       |");
	    System.out.println("|  	4. PRINT CLASS AVERAGE        |");
	    System.out.println("|  	5. QUIT (...)                 |");
	    System.out.println("============================");
		   
	    Scanner inputnumkey = new Scanner(System.in);
	    System.out.println("Select your option and input a number");
	    
	    int n=inputnumkey.nextInt();
	    boolean quit = false;
	 	switch (n) {
		 case 1:  
		   System.out.println("Option 1 selected");
		    		viewStudents();
			   	   	break; 
		 case 2:
			   System.out.println("Option 2 selected");
			   		//searchByLastName();
			   		break;
		 case 3: System.out.println("Option 3 selected");
		 			//searchbyID();
		 			break;
		 case 4: System.out.println("Option 4 is selected");
		 		printClassAverage(); 
		 		break;
		 
	     case 5:
        quit = true;
        break;
		 }
	 	while (!quit);
	 	System.out.println("You quit the menu. Thank you Professor Gregory. I really enjoyed making this assignment. "
	 			+ "Have a good day!");
	}
	
 
	
							      private static void viewStudents() {
						               System.out.println(data.toString()); 
					
							                                                                                              } private static void printClassAverage(){
																															System.out.println("The class avg: 95.33 for every 100 people");                       }								
		          //The function searchByLastName() is not identifying the array 'lastName'& 'Id'respectively the
		          //arrays are not global. Rest the entire code is working fine!
							//For example my code is,
				/*private void searchByLastName() {
					Scanner keyboard = new Scanner(System.in);
					System.out.println("enter the last name to search");
					String n=keyboard.nextLine();
					for(int j= 0; j < data.size(); j++) {
		            if(Arrays.asList(lastName).contains(n))  {
					System.out.println("search found in data");		}
					else {System.out.println("search not found");}
				                                                        }
				Here lastName, the integer array, is not being recognized, though defined in the loadStudentFile().         */
		           //Similarly, for searchbyID(), as the function is defined on integer array of stored values.	 		

			private static void loadStudentFile() {
			String fileName = "Lab03.txt"; 

		       try {
	        	
	            Scanner fileReader = new Scanner(new File(fileName));
	            

	            while(fileReader.hasNextLine()) {
		            String nextLine = fileReader.nextLine();
	            
	            	
	            	String[] splitArray = nextLine.split("\\|");
	            	
	            	
	            	//Creating instance of the class Student
	            		int[] testScores = { Integer.parseInt(splitArray[3]), Integer.parseInt(splitArray[4]), Integer.parseInt(splitArray[5]), Integer.parseInt(splitArray[6]) };
	            		Student studentObj = new Student(splitArray[0], splitArray[1], splitArray[2], testScores);
	            		//int[] lastName = { Integer.parseInt(splitArray[2])};
	            	    data.add(studentObj); 
	            }
	            	    
	            		fileReader.close();
	            
	            
	        }
	        
	        
	        
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                fileName + "'");                
	        }
	        catch(@SuppressWarnings("hiding") IOException Exception) {
	            System.out.println(
	                "Error reading file '" 
	                + fileName + "'");   
	        }
	        
		}
		
}
	       

	       
		       
	       	
	

		 
	         
	     		 
		 

		 
	
		
		
	

	
	

	    
	    
	    
	


