package pl.learningJava_kdk;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserData {
	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime localDate = LocalDateTime.now();
	private String name;
	private int age;
	
	public int enterAge()
	{
		int age = 0;
		Scanner scan = new Scanner(System.in);
		try
		{
			String ageString = scan.next();
			age = Integer.parseInt(ageString);
		} catch (NumberFormatException e)
		{
			System.out.println("Exception - Bad number format");
			System.out.print("Enter correct age: ");
		}
		scan.close();
		return age;
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return age;
	}
	public String getActualDate()
	{
		return dateFormat.format(localDate);
	}
	public void setName(String n)
	{
		this.name = n;
	}
	public void setAge(int a)
	{
		this.age = a;
	}
}