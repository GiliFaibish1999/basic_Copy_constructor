package il.ac.ono.gili;

// Test class
public class Test {
	public static void main(String[] args) {
		
		// First employee
		Employee e = new Employee("Stan", "Farmer", "Manager");
		
		// Copy of the first employee
		Employee d = new Employee(e);
		
		// Prints the copy 
		d.printEmployee();
	}
}