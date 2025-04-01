import java.util.Scanner;
class Person{
	String Name;
	String Gender;
	String Address;
	int Age;

	Person(String na, String ge, String add, int age) {
		this.Name=na;
		this.Gender=ge;
		this.Address=add;
		this.Age=age;
	}
}
class Employees extends Person {
	int Empid;
	String Com_name;
	String Qualification;
	double Salary;
	
	Employees(String na, String ge, String add, int age, int Empid, String Com_name, String Qualification, double Salary) {
		super(na,ge,add,age);
		this.Empid=Empid;
		this.Com_name=Com_name;
		this.Qualification=Qualification;
		this.Salary=Salary;
	}

}
class Teachers extends Employees {

	String subject;
	String department;
	int teacher_id;

	Teachers(String na, String ge, String add, int age, int Empid, String Com_name, String Qualification,double Salary, String subject, String department, int teacher_id) {
		  super(na, ge, add, age, Empid, Com_name, Qualification, Salary); 
       		  this.subject = subject;
        	  this.department = department;
        	  this.teacher_id = teacher_id;
	}

	void display() {
		System.out.println("Name of the Person:" + Name);
		System.out.println("Gender            :" + Gender);	
		System.out.println("Address           :" + Address);
		System.out.println("Age               :" + Age);
		System.out.println("Id of the Employee:" + Empid);
		System.out.println("Company           :" + Com_name);
		System.out.println("Qualifiction      :" + Qualification);
		System.out.println("Salary            :" + Salary);
		System.out.println("Id of the Teacher : " + teacher_id);
		System.out.println("Subject           : "+ subject);
		System.out.println("Department        : "+ department);
}
	public static void main(String args[]) {

		System.out.println("\nEnter the no of Teachers:");
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();
		Teachers[] arr = new Teachers[num];

		for (int i = 0; i < num; i++) {
   			Scanner sc = new Scanner(System.in);
 			System.out.println("\nEnter Name of the person      :");
    			String Name = sc.next();
   			System.out.println("\nEnter the gender              :");
   			String Gender = sc.next();
   			System.out.println("\nEnter the address             :");
  			String Address = sc.next();
 			System.out.println("\nEnter the Age                 :");
 			int Age = sc.nextInt();
 			System.out.println("\nEnter the Employee id         :");
  			int Empid = sc.nextInt();
  			System.out.println("\nCompany name                    :");
 			String Com_name = sc.next();
   			System.out.println("\nQualifiction                    :");
   			String Qualification = sc.next();
   			System.out.println("\nSalary                          :");
   			double Salary = sc.nextDouble();
   			System.out.println("\nId of the Teacher               :");
  			int teacher_id = sc.nextInt();
  			System.out.println("\nSubject that Teacher takes      : ");
  			String subject = sc.next(); 
   			System.out.println("\nDepartment of the teacher       : ");
   			String department = sc.next();  

 			arr[i] = new Teachers(Name, Gender, Address, Age, Empid, Com_name, Qualification, Salary,  subject, department ,teacher_id);


		}

			System.out.println("\n***** Information of all the persons *****");
				for (int i = 0; i < num; i++) {
    					arr[i].display();
		}
		sc1.close();
	}
}