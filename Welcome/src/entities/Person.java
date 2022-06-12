package entities;

public class Person {
	private String name;
	private Integer age;
	private Double height;
	private String genre;
	
	public Person() {
		
	}
	
	public Person(String name, Integer age, Double height, String genre) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	
}
