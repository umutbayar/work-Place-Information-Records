		//Name=Umut 	Surname=Bayar 	Number=150120043 
	public class Department {
    private int departmentId;
    private String departmentName;
	public Department(int departmentId, String departmentName) {
		setDepartmentName(departmentName);
	setDepartmentId(departmentId);
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
    


}