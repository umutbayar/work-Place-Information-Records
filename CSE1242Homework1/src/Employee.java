
import java.util.Calendar;

public class Employee extends Person {
      private double salary;
      private Calendar hireDate;
      private Department department;
      public static int numberofEmployees;
	public Employee(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence, double salary, Calendar hireDate, Department department) throws Exception {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence);
		setSalary(salary);
		setHireDate(hireDate);
		setDepartment(department);
		numberofEmployees++;
	}
      public Employee(Person person, double salary, Calendar hireDate, Department department) throws Exception {
    	  super(person.getId(),person.getFirstName(),person.getLastName(),person.getGender(),person.getBirthDate(),person.getMaritalStatus(),person.getHasDriverLicence());
    	setSalary(salary);
    	setHireDate(hireDate);
    	setDepartment(department);  
    	numberofEmployees++;
      }
      public double raiseSalary(double percent) {
    	  if(1>=percent&&percent>=0) {
    		  salary=salary+salary*percent;
    	  }
    	  return salary;
      }
      public double raiseSalary(int amount) {
    	  salary+=amount;
    	  return salary;
      }
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Calendar getHireDate() {
		return hireDate;
	}
	public void setHireDate(Calendar hireDate) {
		this.hireDate = hireDate;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public static int getNumberofEmployees() {
		return numberofEmployees;
	}
	public static void setNumberofEmployees(int numberofEmployees) {
		Employee.numberofEmployees = numberofEmployees;
	}
	@Override
	public String toString() {
		return super.toString()+"\n\t\t\t\tEmployee Info [salary=" + salary + ", hireDate=" + hireDate.get(Calendar.DATE)+"/"+hireDate.get(Calendar.MONTH)+"/" +hireDate.get(Calendar.YEAR)  + "]";
	}
      
      
      }