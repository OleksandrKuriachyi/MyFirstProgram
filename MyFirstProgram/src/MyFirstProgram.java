import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MyFirstProgram {

	public static void main(String[] args) throws FileNotFoundException {   
		
//		System.out.println("What is your name?");
		
//		Scanner in = new Scanner(System.in);
//		String name = in.nextLine();
//		
//		System.out.println("Hello " + name);
		
//		int x = 5; //primitive
//		Integer y = 5; //object (5 is autoboxed)
//		
//		double z = 5.5;
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
//		System.out.println("Enter your name: ");
//		
//		Scanner scanner = new Scanner(System.in);
//		String name = scanner.nextLine();
//		
//		if(name.equals("Oleksandr")) {
//			System.out.println("Hello Oleksandr!");
//		} else if(name.equals("Tatiana")) {
//			System.out.println("Hi there as well!");
//		} else {
//			System.out.println("You're not welcome here");
//		}
//		
//		scanner.close();
		
//		int i = 0; //initialization
//		while(i < 10) { //condition
//			System.out.println("i is: " + i);
//			i++; // update
//		}
		
//		for(int i = 0; i <= 10; i++) {
//			System.out.println(i);
//		}
		
//		int i = 0;
//		
//		do {
//			System.out.println("i is: " + i);
//			i++;
//		} while(i < 10);

//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("Give us a size");
//		
//		int size = in.nextInt();
//		
//		int[] grades = new int[size];
//		
//		System.out.println("Enter " + size + " number. Press enter after each");
//		
//		for(int i = 0; i < size; i++) {
//			grades[i] = in.nextInt();
//		}
//		
//		in.close();
//		
//		for(int i = 0; i < size; i++) {
//			System.out.println(grades[i]);
//		}
		
//		Scanner in = new Scanner(new File("students.txt"));
//		
//		List<String> students = new ArrayList<String>();
//		
//		while(in.hasNextLine()) {
//			students.add(in.nextLine());
//		}
//		
//		for(int i = 0; i < students.size(); i++) {
//			System.out.println("name: " + students.get(i));
//		}
//		
//		in.close();
		
		LinkedList<String> names = new LinkedList<String>();
		names.push("Caleb");
		names.push("Sue");
		names.push("Sally");
		
		System.out.println(names.removeFirst());
		System.out.println(names.removeFirst());
		System.out.println(names.removeFirst());
	}

}
