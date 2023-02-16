
//Name=Umut 	Surname=Bayar 	Number=150120043 
import java.util.ArrayList;
import java.util.Calendar;

public class Manager extends Employee {
        ArrayList<RegularEmployee> regularEmployees=new ArrayList<>();
      private double bonusBudget;
	public Manager(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence, double salary, Calendar hireDate, Department department,
			ArrayList<RegularEmployee> regularEmployees, double bonusBudget) throws Exception {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate,
				department);
		setRegularEmployees(regularEmployees);
		setBonusBudget(bonusBudget);
	}
      public Manager(Employee employee,double bonusBudget) throws Exception {
    	  super(employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getGender(),employee.getBirthDate(),employee.getMaritalStatus(),employee.getHasDriverLicence(),employee.getSalary(),employee.getHireDate(),employee.getDepartment());   
      setBonusBudget(bonusBudget);
      }
      public void addEmployee(RegularEmployee e) {
    	  regularEmployees.add(e);
    	  
      }
      public void removeEmployee(RegularEmployee e) {
    	  regularEmployees.remove(e);
      }
      
      public void distributeBonusBudget() {

          double totalForUnit = 0;

          for (int i = 0 ; i < regularEmployees.size() ; i++) {
              totalForUnit += regularEmployees.get(i).getSalary() * regularEmployees.get(i).getPerformanceScore();
          }

          double unit = getBonusBudget()/totalForUnit;

          for (int i = 0 ; i < regularEmployees.size() ; i++) {
              regularEmployees.get(i).setBonus(Math.round(unit * regularEmployees.get(i).getSalary() * regularEmployees.get(i).getPerformanceScore()*100)/100.0);
              
          }
      }
	public ArrayList<RegularEmployee> getRegularEmployees() {
		return regularEmployees;
	}
	public void setRegularEmployees(ArrayList<RegularEmployee> regularEmployees) {
		this.regularEmployees = regularEmployees;
	}
	public double getBonusBudget() {
		return bonusBudget;
	}
	public void setBonusBudget(double bonusBudget) {
		this.bonusBudget = bonusBudget;
	}
	@Override
	public String toString() {
		return "\t "+"Manager [id:"+getId()+", "+getFirstName()+" "+getLastName()+"\n\t\t# of Employees: "+regularEmployees.size()+"]";
	}
    
      
}