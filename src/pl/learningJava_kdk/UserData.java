package pl.learningJava_kdk;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserData {
	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime localDate = LocalDateTime.now();
	private String name;
	private int age;
	
	
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