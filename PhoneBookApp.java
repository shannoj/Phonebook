package phonebook;
import java.util.Scanner;

public class PhoneBookApp {
	
	private PhoneBook phoneBook;
	
	public PhoneBookApp(String fileName) {
		phoneBook = new PhoneBook(fileName);
	}

	public void displayMenu() {
		
		System.out.println("***MY PHONEBOOK APPLICATION***");
		String userInput;
		do {
			System.out.println("Please choose an operation:");
			System.out.print("A (Add) | S (Search) | P (Print) |R (Remove) | Q (Quit):");
			
			Scanner sc = new Scanner(System.in);
			userInput = sc.next();
			
			if (userInput.equals("A")) {
				add();
			} else if (userInput.equals("S")) {
				search();
			} else if (userInput.equals("P")) {
				print();
			} else if (userInput.equals("R")) {
				remove();
			} 
			System.out.println();
		
		} while (!userInput.equals("Q"));
	
	}
	
	void add() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name:");
		String name = sc.nextLine();
		System.out.print("Enter phone number:");
		int phone = Integer.parseInt(sc.next());

		Contact newContact = new Contact(name, phone);
		
		phoneBook.add(newContact);
	}

	public void search() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name:");
		String name = sc.nextLine();

		int phone = phoneBook.search(name);
		
		if(phone != 0)
			System.out.println("Phone: " + phone);
		if(phone == 0)
			System.out.println("Not found!");
	}

	public void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name:");
		String name = sc.nextLine();

		phoneBook.remove(name);
	}
	
	public void print() {
		phoneBook.print();
	}


}
