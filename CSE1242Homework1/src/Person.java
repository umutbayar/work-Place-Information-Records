//Name=Umut 	Surname=Bayar 	Number=150120043 
	/* In this homework, we implement a basic company system with 11 class. All classes are created 
	 * to be interconnected and related to each other. We will keep the user information in the person 
	 * class, which is the superclass of customer and employee.We will keep the performance score and bonus
	 * amounts in the regular employee class, which is the superclass of SalesEmployee and developer.
	 *In the manager class, we will keep the employees and bonus budgets of the managers in their own department.
	 *In the product class, we will keep the name of the products, the date of sale and their prices.
	 *In the project class we will keep the name of the projects, the start date and what state they are in.
	 *We will keep the id and names of the departments in the department class and our last class, test class, was 
	 *created to test other classes 
	 */
import java.util.Calendar;

public class Person {
     private  int id;
     private String firstName;
     private String lastName;
     private byte gender;
     private Calendar birthDate;
     private byte maritalStatus;
     private boolean hasDriverLicence;
    public Person(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus, String hasDriverLicence) throws Exception {
    	setId(id);
    	setFirstName(firstName);
        setLastName(lastName);
    	setBirthDate(birthDate);
    	setHasDriverLicence(hasDriverLicence);
    	setGender(gender);
    	setMaritalStatus(maritalStatus);
    }
    public void  setGender(String gender) throws Exception {
    	if(gender.equals("Woman")) {
    		this.gender=1;
    	}
    	else if(gender.equals("Man")){
    		this.gender=2;
    	}
    	else
    		throw new Exception("Ýnvalid input");
    }
     public String getGender() {
    	 if(gender==2)
    	 return "Man" ;
    	 else
    		 return "Woman" ;
     }
     public void setMaritalStatus(String status) throws Exception {
    	 if(status.equals("Single")) {
    		 this.maritalStatus=1;
    	 }
    	 else if(status.equals("Married")) {
    		 this.maritalStatus=2;
    	 }
    	 else 
    		 throw new Exception("Ýnvalid input");
    	 
     }
     public String getMaritalStatus() {
    	 if(maritalStatus==1) {
    		 return "Single";
    	 }
    	 else  {
    		 return "Married";
    	 }
     }
     
     public void setHasDriverLicence(String info) throws Exception {
    	 if(info.equals("Yes")) {
    		 this.hasDriverLicence=true;
    	 }
    	 else if(info.equals("No")) {
    		 this.hasDriverLicence=false;
    	 }
    	 else 
    		 throw new Exception ("Ýnvalid input");
     }
     public String getHasDriverLicence() {
    	  if(hasDriverLicence==true) {
    		  return "Yes";
    	  }
    	  else  {
    		  return "No";
    	  }
     }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}
	public Calendar getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Calendar birthDate) {
		
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "\t\t\t\tPerson Info [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + getGender() + "]";
	}
	
}