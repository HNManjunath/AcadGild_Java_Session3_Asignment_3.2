/**
 * 
 */
package assignment3_2;

/**
 * @author MANJUNATH, This class is to display the use of super and this keyword
 *         with a constructor, methods, variables
 *
 */
public class Assignment3_2 extends SuperClass {

	int rollnumber;		//declaring the instance variables.
	String name;
	double salary;

	//use of "constructor" for the class Assignment3_2
	public Assignment3_2(int rollnumber, String name) {
		// Use of "this" keyword where setting of parameter value to class instance variable
		this.rollnumber = rollnumber;
		this.name = name;
		
	}

	public Assignment3_2(int rollnumber, String name, double salary) {
		// calling the constructor within the class using "this" keyword.
		this(rollnumber, name);
		this.salary = salary;

	}

	public void display() {		//method to print the constructor value.
		System.out.println("Rollnumber: " + rollnumber + "\nName: " + name+"\nSalary: "+salary);
		super.display();	//using the "super" keyword to call the display method from the class "SuperClass"
	}

	public static void main(String[] args) {
		// Main method begins
		Assignment3_2 thiskeyword = new Assignment3_2(12, "manjunath", 25000); //creating the object for the Assignment3_2 and passing the value.
		thiskeyword.display();	//calling the display method from the class Assignment3_2.
		
	}

}
