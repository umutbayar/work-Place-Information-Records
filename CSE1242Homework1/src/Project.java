	//Name=Umut 	Surname=Bayar 	Number=150120043 
	import java.util.Calendar;

public class Project {
    private String projectName;
    private Calendar startDate;
    private boolean state;
	public Project(String projectName, Calendar startDate, String state) {
		super();
		setProjectName(projectName);
		setStartDate(startDate);
		setState(state);
	}
    
	public void setState(String state) {
		if(state.equals("Open")) {
			this.state=true;
		}
		else 
			this.state=false;
		
	}
	public String getState() {
		if(state==true) {
			return "Open";
		}
		else
			return "Close";
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", startDate=" + startDate.get(Calendar.DATE)+"/"+startDate.get(Calendar.MONTH)+"/"+startDate.get(Calendar.YEAR) + ", state=" + getState() + "]]";
	}
    
    
}