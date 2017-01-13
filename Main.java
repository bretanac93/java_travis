public class Main {
	public static void main(String[] args) {
		Person p = new Person("Cesar", 23);
		try {
			p.someWeirdMethod(0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}