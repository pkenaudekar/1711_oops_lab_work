
public class TeachingStaff extends Staff{
	private Integer noOfTeachingHours;
	
	public void teach() {
		System.out.println("Teaching Now");
	}
	
	public TeachingStaff() {
		super();
		noOfTeachingHours = 0;
	}
	public TeachingStaff(String name, Integer noOfTeachingHours) {
		super(name);
		this.noOfTeachingHours = noOfTeachingHours;
	}
	@Override
	public void calculateSalary() {
		System.out.println("Teaching Salary");
	}
}
