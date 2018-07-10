package pojo;

public class Stadium {
	private char place;
	public char getPlace() {
		return place;
	}
	public void setPlace(char place) {
		this.place = place;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	private int capacity;
	private char name;
	
	public void hostmatch()
	{
		System.out.println("Stadium name");
	}
	
}
