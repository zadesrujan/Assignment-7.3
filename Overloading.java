package method;
//here we cretaed pacakage as method which that organizes a set of related classes and interfaces.
public class Overloading {
	//created class as Overloading
	private int Employee;
	//private is used for same class
	    private double salary;

	    

	  public  Overloading(){
		  //default constructor
	//If we are having same class name and different parameter is called as overloading
		  Employee =0;

		  salary=0;

	  }

		public Overloading(int Employee){
	//parameterized constructor
			this.Employee=Employee;

		}	

		public Overloading(int Employee,double salary){
	//using this will refer to the current one or object
				this.Employee=Employee;

				this.salary=salary;

		}	

				

			public void display(){

				System.out.println("Employee:"+Employee);
				//system : is a class in java language pacakge.
				//out : static member of the system class.
				//println : to print what is output.

				System.out.println("salary:" +salary);
				//system : is a class in java language pacakge.
				//out : static member of the system class.
				//println : to print what is output.

				

			}

			

	}
