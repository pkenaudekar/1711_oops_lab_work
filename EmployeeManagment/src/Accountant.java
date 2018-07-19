
public class Accountant extends NonTeachingStaff{
	private Integer noOfWorkDays;
	
	public Accountant() {
		super();
		noOfWorkDays = 3;
	}
	
	public Accountant(String name, Integer noOfWorkDays) {
		super();
		this.noOfWorkDays = noOfWorkDays;
	}
	
	@Override
	public void calculateWorkDays() {
		System.out.println("Working days: "+noOfWorkDays);
	}
}
