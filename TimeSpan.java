
import java.util.*;
import java.io.*;

public class TimeSpan {
	
	private int hours;
	private int minutes;
	
	public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input your hours: "); //prompts user for time inputs
		int inputHours = kb.nextInt();
	
		System.out.println("Input your minutes: ");
		int inputMins = kb.nextInt();
		
		TimeSpan span1 = new TimeSpan(inputHours, inputMins); //creates new timespan object
		
		System.out.println(span1.getHours() + " hours");
		System.out.println(span1.getMinutes() + " minutes");
		span1.add(17,23);
		System.out.println(span1.getTotalHours() + " total hours");
		System.out.println("Timespan: " + span1.toString());
		
	}
	
	public TimeSpan(int hours, int minutes) {
		
		this.hours = hours; //remember, this usually refers to the INSTANCE VARIABLE
		this.minutes = minutes;
		
	}
	
	
	public int getHours() {
		
		return hours;
	}

	public int getMinutes() {
		
		return minutes;
		
	}
	
	public void add(int hours, int minutes) {
		
		this.hours = getHours() + hours;
		
		if(this.minutes > 59 || (this.minutes + minutes > 59)) {
			this.minutes = (getMinutes() + minutes)%60;
			this.hours += ((getMinutes() + minutes)/60) + 1;
		}
		
		else {
			this.minutes = getMinutes() + minutes;
		}
		

	}
	
	public void add(TimeSpan newSpan) {

		int newMin = newSpan.getMinutes();
		int newHour = newSpan.getHours();
		
		this.add(newHour, newMin); //KEY: refers to the calling object that this method is applied to, constructor chaining
		

	}
	
	public double getTotalHours() {
		double totalHours = hours;
		double totalMin = minutes/60.0; //KEY: converting INT to DOUBLE for decimal division
		
		return totalHours + totalMin;
	}
	
	public String toString() {
		
		String timeString = hours + "h" + minutes + "m";
		
		return timeString;
		
	}
	
}
	

