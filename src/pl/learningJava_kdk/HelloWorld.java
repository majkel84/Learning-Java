package pl.learningJava_kdk;

import pl.learningJava_kdk.UserData;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		UserData user = new UserData();
		user.setName("majkel");
		user.setAge(36);
		System.out.println(user.getName());
		System.out.println(user.getAge());
		System.out.println(user.getActualDate());

	}

}