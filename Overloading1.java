package method;
//here we cretaed pacakage as method which that organizes a set of related classes and interfaces.
public class Overloading1 {
		//created class as Overloading1
	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
		Overloading name =new  Overloading(213);

	     Overloading name1 =new  Overloading(421);

	     Overloading name2=new  Overloading(12, 12000.00);

	     //displays the values

	            name.display();     
	            name1.display();
	            name2.display();
		}
	
	}


