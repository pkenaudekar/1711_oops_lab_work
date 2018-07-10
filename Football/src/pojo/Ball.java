package pojo;

public class Ball {
	private int size;
	private String colour;
	private String make;
	
	public Ball() {
		size=0;
		colour="";
		make="";
		System.out.println("Ball(s) created");
	}
	public Ball(String colour, Integer size, String make) {
		this.colour = colour;
		this.size=size;
		this.make=make;
		System.out.println("Ball created");
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	
}
