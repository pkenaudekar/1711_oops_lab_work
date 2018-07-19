
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff staff1 = new TeachingStaff();
		TeachingStaff staff2 = new TeachingStaff();
		Staff staff3 = new  TeachingStaff();
		Staff staff4 = new NonTeachingStaff();
		
		staff3.calculateSalary();
		staff4.calculateSalary();
		
		staff2.teach();
		Staff staff5 = new Accountant();
		staff5.calculateWorkDays();
		staff5.calculateSalary();
	}

}
