package phonebook;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneBook{
	BST tree = new BST();

	public PhoneBook(String fileName) {
		
		load(fileName);
	}

	
	private void load(String fileName) {
		try {
			File file = new File(fileName);
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				StringTokenizer tokenizer = new StringTokenizer(line, " ");
				String name = tokenizer.nextToken();
				name += " " + tokenizer.nextToken();
				int phone = Integer.parseInt(tokenizer.nextToken());
				
				tree.insert(name, phone);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}

	
	public void add(Contact contact) {
		tree.insert(contact.getName(), contact.getPhone());
	}
	
	public void remove(String name) {
		tree.remove(name);
	}
	
	public int search(String name) {
		return tree.search(name);
	}
	
	public void print() {
		tree.printInOrder();
		System.out.println("Size:" + tree.size());
	}

}
