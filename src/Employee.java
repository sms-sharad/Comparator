import java.util.ArrayList;
import java.util.Collections;

public class Employee {
  private int id;
  private String name;
  private String dept;
  private int salary;
  public Employee(int id, String name, String dept, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.salary = salary;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

  
	public static void main(String[] args) {
		 ArrayList<Employee> emp=new ArrayList<Employee>();
		 emp.add(new Employee(23, " Sharad", " IT ", 40000));
		 emp.add(new Employee(3, " Jalindar", " Management ", 50000));
		 emp.add(new Employee(79, " Shivaji", " Web ", 40000));
		 emp.add(new Employee(90, " Kiran", " BackOffice ", 30000));
		 emp.add(new Employee(13, " Ashitosh", " NET ", 70000));
		 
		 for(Employee e:emp){
			 System.out.println(e.getId() + e.getName()+e.dept+e.salary);
		 }
		 
		 System.out.println("After Sorting");
		 Collections.sort(emp, new IdCoparator());

		 for(Employee e:emp){
			 System.out.println(e.getId() + e.getName()+e.dept+e.salary);
		 }
		
	}

	
	}

