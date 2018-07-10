package pojo;

public class Stadium {
	private String place;
	private int capacity;
	private String name;
	
	public Stadium() {
		name="";
		place="";
		capacity=0;
		System.out.println("Stadium(s) created");
	}
	
	public Stadium(String name, String place, Integer capacity) {
		this.name=name;
		this.place=place;
		this.capacity=capacity;
		
	}
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void hostmatch()
	{
		System.out.println("Stadium name");
	}
	
}
