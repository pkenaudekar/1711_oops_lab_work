package pojo;

public class Player {
	private Integer age;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	public void kick()
	{
		
		System.out.println("kick");
	}
}

