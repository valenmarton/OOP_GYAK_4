
public class Main {

	public static void main(String[] args) {
//		Employee employee = new Employee();
//	//	employee.salary = 150000;
//	//	employee.employeeName = ("Kiss László");
//		
//		employee.setEmployeeName("Kiss László");
//		employee.setSalary(1000);
//		
//	//	employee.salary = employee.increaseSalary(5000, employee.salary);
//	//	employee.displayInfo(employee.salary, employee.employeeName);
//	//	System.out.println(employee.displayInfo(employee.salary, employee.employeeName));
//		Employee employee2 = new Employee();
//		
//		employee2.setEmployeeName("Pista");
//		employee2.setSalary(2000);
//		System.out.println(employee.displayInfo() +"\n" + employee2.displayInfo());
//		
//	//	System.out.println(employee.isInSalaryRange(500, 3000)+ "\n"+ employee.getTax() +"\n"+ employee.hasHigherSalary(employee2) );
		
		Employee[] employeeArray = new Employee[10];
		for(int i = 0; i < employeeArray.length; i++) {
			employeeArray[i]=new Employee();
			employeeArray[i].setSalary(i*1000+i*200);
			employeeArray[i].setEmployeeName("Papp István"+i);
		}
		
		int maxIndex = 0;
		for(int i = 1; i < employeeArray.length; i++) {
				if(employeeArray[i].hasHigherSalary(employeeArray[maxIndex])) {
					maxIndex = i;
				}
			}
		
		int inInterval = 0;
		for(int i = 0; i < employeeArray.length; i++) {
			if(employeeArray[i].isInSalaryRange(200, 5000)) {
				inInterval++;
			}
		}
		
//		for(Employee employee : employeeArray) {
//			if(employee.isInSalaryRange(200, 5000)) {
//				inInterval++;
//			}
//		}
		
		long avg = 0;
		for(Employee employee : employeeArray) {
			avg+=employee.getSalary();
		}
		avg/=employeeArray.length;
	
		long tax = 0;
		for(Employee employee : employeeArray) {
			tax+=employee.getTax();
		}
		System.out.println(avg+ " " +tax + " " +inInterval);
	}
		
}
