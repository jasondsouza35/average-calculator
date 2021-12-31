//question 1

package arrayProblemSet;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class StudentGrades {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> grades  = new ArrayList<>();
		// for loop for input
		System.out.print("Enter the total amount of grades being inputed: ");
		int amount =  in.nextInt();
		for(int i=0; i<amount; i++) {
			System.out.print("Grade "+(i+1)+": "); 
			int mark = in.nextInt();
			grades.add(mark);
		}
		System.out.println("");
		System.out.println("Grades listed are: ");  
		  
		for (int i=0; i<grades.size(); i++){  // for loop prints the elements in the array in order by starting at the first element and incrementing until reaching the total amount of elements in the array
		System.out.print(grades.get(i)+ " ");  
		}  
		  
		System.out.println("");
		System.out.println("");
		int total = 0;
		for(int grade: grades) { //enhanced for loop adds the elements in the array to a single total which is then divided by the total amount of elements to determine the grade average
			total += grade;
		}
		double average = (double)total/grades.size(); //averages the grades and prints it to two decimal places
		System.out.format("Your overall average is: %.2f", average); 
		System.out.println("%");
		Scanner inner = new Scanner(System.in);
		ArrayList<String> courses  = new ArrayList<>();
		System.out.println("");	
		System.out.println("");
		System.out.println("Enter your respective courses");  
		for(int i=0; i<amount; i++) { //for loop accepts course name and adds them to the courses array
			System.out.print("Course "+(i+1)+": "); 
			String a = inner.nextLine();
			courses.add(a);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Course grades are: ");  
		for (int i=0; i<courses.size(); i++){  //for loop prints course and matching grade
		System.out.print(courses.get(i)+ ": ");  
		System.out.println(grades.get(i) + " %");  
		}
	
	}
	
}