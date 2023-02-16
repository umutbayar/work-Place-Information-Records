	//Name=Umut 	Surname=Bayar 	Number=150120043 

	import java.util.ArrayList;
import java.util.Calendar;

public class Developer extends RegularEmployee {
    private ArrayList<Project> projects=new ArrayList<>();
    public static int numberOfDevelopers;
	public Developer(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence, double salary, Calendar hireDate, Department department, double performanceScore,
			double bonus, ArrayList<Project> p) throws Exception {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate, department,
				performanceScore, bonus);
		this.projects = projects;
	}
    public Developer(RegularEmployee re,ArrayList<Project> p) throws Exception {
    	super(re.getId(),re.getFirstName(),re.getLastName(),re.getGender(),re.getBirthDate(),re.getMaritalStatus(),re.getHasDriverLicence(),
    			re.getSalary(),re.getHireDate(),re.getDepartment(),re.getPerformanceScore(),re.getBonus());
    	projects=p;
    }
    
    public boolean addProject(Project s) {
    	return projects.add(s);
    
    }
    public boolean removeProject(Product s) {
    	return projects.remove(s);
   
    }
	public ArrayList<Project> getProjects() {
		return projects;
	}
	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}
	public static int getNumberOfDevelopers() {
		return numberOfDevelopers;
	}
	public static void setNumberOfDevelopers(int numberOfDevelopers) {
		Developer.numberOfDevelopers = numberOfDevelopers;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
    
}