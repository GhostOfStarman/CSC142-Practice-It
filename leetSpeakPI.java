
import java.util.*;
import java.io.*;

public class leetSpeakPI {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(new File("/Users/neptune/Desktop/leet.txt"));
		
		leetSpeak(input,output);
	}
//use out.print instead of Sys.out
	public static void leetSpeak(Scanner input,PrintStream output){
	    
	    Scanner fin = null;
	   
	    try{
	        fin = new Scanner(new FileInputStream("/Users/neptune/Desktop/leetSpeakTest.txt"));
	    }
	    catch (FileNotFoundException e){
	        System.exit(0);
	    }
	    
	    while (fin.hasNextLine()) {
	   	
		    String chess = fin.nextLine().toLowerCase();

		    	
		    Scanner fin2 = new Scanner(chess);
		    
		    while(fin2.hasNext()){
		    	
		    	String pawn = fin2.next();
		    	
		    	if (pawn.contains("e")) {
		    		pawn.replace("e", "3");
		    	}
		    	if (pawn.contains("a")) {
		    		pawn.replace("a", "4");
		    	}
		    	if (pawn.contains("0")) {
		    		pawn.replace("o", "0");
		    	}
		    	if (pawn.contains("l")) {
		    		pawn.replace("l", "1");
		    	}
		    	if (pawn.contains("t")) {
		    		pawn.replace("t", "7");
		    	}
		    	if (pawn.charAt(pawn.length()-1) == 's') {
		    		pawn = pawn.substring(0, pawn.length()-1) + "Z";
		    	}
		    	output.print("("+ pawn +")");
		    	
		    	}
	    	
	    }
	    
	    

	    }
	}

	    
	    	

	   
