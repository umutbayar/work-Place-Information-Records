
//Name=Umut 	Surname=Bayar 	Number=150120043 
import java.util.Calendar;
public class RegularEmployee extends Employee{
        private double performanceScore;
        private double bonus;
		public RegularEmployee(int id, String firstName, String lastName, String gender, Calendar birthDate,
				String maritalStatus, String hasDriverLicence, double salary, Calendar hireDate, Department department,
				double performanceScore, double bonus) throws Exception {
			super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate,
					department);
			setPerformanceScore(performanceScore);
			setBonus(bonus);
		}
        public RegularEmployee(Employee employee,double perfScore) throws Exception {
        	super(employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getGender(),employee.getBirthDate(),employee.getMaritalStatus(),employee.getHasDriverLicence(),employee.getSalary(),employee.getHireDate(),employee.getDepartment());
        	setPerformanceScore(perfScore);
        }
		public double getPerformanceScore() {
			return performanceScore;
		}
		public void setPerformanceScore(double performanceScore) {
			this.performanceScore = performanceScore;
		}
		
		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
		public double getBonus() {
			return bonus;
		}
		@Override
		public String toString() {
			return super.toString()+"\n\t\t\t\tRegularEmployee Info [performanceScore=" + performanceScore ;
		}
		
}