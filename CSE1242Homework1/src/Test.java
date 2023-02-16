	//Name=Umut 	Surname=Bayar 	Number=150120043 
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws Exception {
		ArrayList<Object>a=new ArrayList<>();
		ArrayList<Integer>onlyPerson=new ArrayList<>();
		 
		 File files = new File("input.txt");
			Scanner input = new Scanner(files);
			
	
		while(input.hasNext()) {
			String object =input.next();
			
			if(object.equals("Department")) {
				int id=input.nextInt();
				String departmentName=input.next();
				try {
				a.add(new Department(id,departmentName));
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			else if(object.equals("Project")) {
				String projectName=input.next();
				String[] date = input.next().split("/");
				Calendar startDate=Calendar.getInstance();
				startDate.set(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
				String state=input.next();
				
				a.add(new Project(projectName, startDate, state));
				
			}
			
			else if(object.equals("Product")) {
				String sName=input.next();
				String[] date = input.next().split("/");
				Calendar saleDate=Calendar.getInstance();
				saleDate.set(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
				double price=input.nextDouble();
				try {
					
				a.add(new Product(sName, saleDate, price));
				
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
			else if(object.equals("Person")) {
				String firsName=input.next();
				String lastName=input.next();
				int id=input.nextInt();
				String gender=input.next();
				String[] date = input.next().split("/");
				 Calendar birthDate = Calendar.getInstance();
				 birthDate.set(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
				String marialStatus=input.next();
				String hasDriverLicence=input.next();
				try {
					a.add(new Person(id,firsName,lastName,gender,birthDate,marialStatus,hasDriverLicence));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if (object.equals("Customer")) {
				int id=input.nextInt();
				onlyPerson.add(id);
				Person person=null;
				for(int i=0;i<a.size();i++) {
					if(a.get(i) instanceof Person) {
						if(((Person)a.get(i)).getId()==id)
						person=(Person)a.get(i);
					}
				}
					ArrayList<Product> products=new ArrayList<>();
					String[] cProduct=input.nextLine().trim().split(" ");
					for(int i=0;i<cProduct.length;i++) {
						for(int j=0;j<a.size();j++) {
							 if (a.get(j) instanceof Product) {
							if(((Product)a.get(j)).getProductName().equals((cProduct[i]))) {
								products.add((Product)a.get(j));
							}
						}
						}
					}
					
					
					try {
						a.add(new Customer(person,products));
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			    else if(object.equals("Employee")) {
			    	int id=input.nextInt();
			    	onlyPerson.add(id);
			    	double salary=input.nextDouble();
			    	String[] date = input.next().split("/");
					 Calendar hireDate = Calendar.getInstance();
					 hireDate.set(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
					 String departmentName=input.next();
					Person person=null;
					for(int i=0;i<a.size();i++) {
						 if (a.get(i) instanceof Person) {
						if(((Person)a.get(i)).getId()==id) {
							person =(Person)a.get(i);
						}
						 }
					}
						Department department =null;
						for(int i=0;i<a.size();i++) {
							 if (a.get(i) instanceof Department) {
							if(((Department)a.get(i)).getDepartmentName().equals(departmentName)) {
								department=(Department)a.get(i);
							}
						}
						}
						a.add(new Employee(person, salary, hireDate, department));
			    	
			    }
			    else if(object.equals("Manager")) {
			    	int id=input.nextInt();
			    	double bonusBudget=input.nextDouble();
			    	Employee employee=null;
			    	for(int i=0;i<a.size();i++) {
			    		 if (a.get(i) instanceof Employee) {
			    		if(((Employee)a.get(i)).getId()==id) {
			    			employee=(Employee)a.get(i);
			    		}
			    		 }
			    	}
			    a.add(new Manager(employee, bonusBudget));	
			}
			    else if (object.equals("RegularEmployee")) {
			         int id=input.nextInt();
			         double performanceScore=input.nextDouble();
			         Employee employee=null;
			    	for(int i=0;i<a.size();i++) {
			    		 if (a.get(i) instanceof Employee) {
			    		if(((Employee)a.get(i)).getId()==id) {
			    			employee=(Employee)a.get(i);
			    		}
			    	}
			    	}
			    	a.add(new RegularEmployee(employee, performanceScore));
			    	
			    }
			    else if(object.equals("SalesEmployee")) {
			    	int id=input.nextInt();
			    	RegularEmployee regularEmployee=null;
			    	for(int i=0;i<a.size();i++) {
			    		if (a.get(i) instanceof RegularEmployee) {
			    		if(((RegularEmployee)a.get(i)).getId()==id) {
			    			regularEmployee=(RegularEmployee)a.get(i);
			    		}
			    		}
			    	}
			    	ArrayList<Product> products=new ArrayList<>();
					String[] cProduct=input.nextLine().trim().split(" ");
					for(int i=0;i<cProduct.length;i++) {
						for(int k=0;k<a.size();k++) {
							if (a.get(k) instanceof Product) {
							if(((Product)a.get(k)).getProductName().equals((cProduct[i]))) {
								products.add((Product)a.get(k));
							}
						}
						}
						
					}
			    	a.add(new SalesEmployee(regularEmployee, products));
			    	
			    }
			
			    else if(object.equals("Developer")) {
			    	int id=input.nextInt();
			    	ArrayList<Project> projects=new ArrayList<>();
					String[] cProject=input.nextLine().trim().split(" ");
					for(int i=0;i<cProject.length;i++) {	
						for(int j=0;j<a.size();j++) {
							if (a.get(j) instanceof Project) {
							if(((Project)a.get(j)).getProjectName().equals(cProject[i])) {
								projects.add((Project)a.get(j));
							}
						}
						}
					}
			    	RegularEmployee regularEmployee=null;
			    	for(int i=0;i<a.size();i++) {
			    		if (a.get(i) instanceof RegularEmployee) {
			    		if(((RegularEmployee)a.get(i)).getId()==id) {
			    			regularEmployee=(RegularEmployee)a.get(i);
			    		}
			    	}
			    	}
			    	
			    	a.add(new Developer(regularEmployee, projects));
			    }
			
		}
		
		for(int i=0;i<a.size();i++) {
			if (a.get(i) instanceof Manager) {
			for(int k=0;k<a.size();k++) {
				 if (a.get(k) instanceof RegularEmployee && !(a.get(k) instanceof SalesEmployee) && !(a.get(k) instanceof Developer)) {
					 if (((Manager)a.get(i)).getDepartment().getDepartmentName().equals(((RegularEmployee)a.get(k)).getDepartment().getDepartmentName())) {
					((Manager)a.get(i)).addEmployee(((RegularEmployee)a.get(k)));
				}
			}
			}
		}
		}
		for(int i=0;i<a.size();i++) {
			if(a.get(i) instanceof Manager)
			((Manager)a.get(i)).distributeBonusBudget();
		}
		
		double mValue = 0;
		int indexMaxSales = 0;
		for(int i=0;i<a.size();i++) {
			if(a.get(i) instanceof Manager) {
				((Manager)a.get(i)).raiseSalary(0.2);
				
			}
			else if (a.get(i) instanceof SalesEmployee) {
				double tValue = 0;
				((SalesEmployee)a.get(i)).raiseSalary(0.18);
				for (int j = 0 ; j < ((SalesEmployee)a.get(i)).getSales().size() ; j++) {
					tValue += ((SalesEmployee)a.get(i)).getSales().get(j).getPrice();
				}
				if (tValue > mValue) {
					mValue = tValue;
					indexMaxSales = i;
			}
			}
			else if(a.get(i) instanceof Developer) {
				((Developer)a.get(i)).raiseSalary(0.23);
				
			}	
			
			else if((a.get(i) instanceof RegularEmployee)&&!(a.get(i) instanceof SalesEmployee) && !(a.get(i) instanceof Developer) ) {
				((RegularEmployee)a.get(i)).raiseSalary(0.3);
			}
			
	}	 
	    ((SalesEmployee)a.get(indexMaxSales)).raiseSalary(1000);
	    
	  
	    
		
	for(int i=0;i<a.size();i++) {
		if(a.get(i) instanceof Department) {
		System.out.println("****************");
		System.out.println(((Department)a.get(i)).toString());
		
		for(int k=0;k<a.size();k++) {
			if(a.get(k) instanceof Manager) {
				if(((Manager)a.get(k)).getDepartment().getDepartmentName().equals(((Department)a.get(i)).getDepartmentName())) {
         System.out.println(((Manager)a.get(k)).toString());
        
         int number=1;
         
         
             for(int l=0;l<((Manager)a.get(k)).getRegularEmployees().size();l++) {
            	 for(int m=0;m<a.size();m++) {
            	 if(a.get(m) instanceof Developer) {
            		 if (((Developer)a.get(m)).getId() == ((Manager)a.get(k)).getRegularEmployees().get(l).getId()) {
            			 System.out.println("\t\t\t" +number+ ". Developer");
            		 System.out.print(((Developer)a.get(m)).toString());
            		 System.out.println(", bonus="+((Manager)a.get(k)).getRegularEmployees().get(l).getBonus()+"]");
            		 System.out.println("\t\t\t\t"+((Developer)a.get(m)).getProjects());
            		 ((Manager)a.get(k)).getRegularEmployees().remove(l);
            		 l=0;
            		 number++;
            		 }
            	 }          	 
            	 }       
             }
             for(int l=0;l<((Manager)a.get(k)).getRegularEmployees().size();l++) {
            	 
                for(int m=0;m<a.size();m++) {
                	if(a.get(m) instanceof SalesEmployee) {
                		if (((SalesEmployee)a.get(m)).getId() == ((Manager)a.get(k)).getRegularEmployees().get(l).getId()) {
                			System.out.println("\t\t\t"+number+" SalesEmployee");
                			
                			System.out.print(((SalesEmployee)a.get(m)).toString());
                    		 System.out.println(", bonus="+((Manager)a.get(k)).getRegularEmployees().get(l).getBonus()+"]");
                    		 System.out.println("\t\t\t\t"+((SalesEmployee)a.get(m)).getSales());
                			((Manager)a.get(k)).getRegularEmployees().remove(l);
                			l=0;
                			number++;
                		}
                	}
                	
                }

             }
         
             for(int l=0;l<((Manager)a.get(k)).getRegularEmployees().size();l++) {
            	 System.out.println("\t\t\t"+number+" RegularEmployee");
            	 
            	System.out.print(((Manager)a.get(k)).getRegularEmployees().get(l).toString());
            	 System.out.println(", bonus="+((Manager)a.get(k)).getRegularEmployees().get(l).getBonus()+"]");
             }
             
          
				}
			}		
		}	
		}
		
		
		
			
	}
	System.out.println("\n\n");
	    System.out.println("*******CUSTOMERS*********");
	   for(int i=0;i<a.size();i++) {
		   if(a.get(i) instanceof Customer) {
			   System.out.println(((Customer)a.get(i)).toString());
		   }   
	   }
	System.out.println("\n\n");
	System.out.println("*******PEOPLE*********");
     for(int i=0;i<a.size();i++) {
    	 if(a.get(i) instanceof Person &&!(a.get(i) instanceof Customer)&&!(a.get(i) instanceof Employee) ) {
    		if(!(onlyPerson.contains(((Person)a.get(i)).getId()))){
    		System.out.println(""+((Person)a.get(i)).toString().trim()+", birthDate="+((Person)a.get(i)).getBirthDate().get(Calendar.DATE)+"/"+((Person)a.get(i)).getBirthDate().get(Calendar.MONTH)+"/"+((Person)a.get(i)).getBirthDate().get(Calendar.YEAR)+", maritalStatus="+((Person)a.get(i)).getMaritalStatus()+", hasDriverLicence="+((Person)a.get(i)).getHasDriverLicence()+"]");
    	 }
    	 }
     }
	}
	}