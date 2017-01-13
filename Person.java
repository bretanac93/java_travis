public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	} 

	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int someWeirdMethod(int age) throws Exception {
		if (age == 0) 
			throw new Exception("Age cannot be zero.");
		return age;
	}
}