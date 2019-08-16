package pl.learningJava_kdk;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserData {
	private String name;
	private int age;
	
	public int enterAge()
	{
		int age = 0;
		System.out.print("Enter age: ");
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
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd/HH:mm:ss");
		LocalDateTime localDate = LocalDateTime.now();
		//checkActualDate(localDate);
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
	
	/*public Boolean checkActualDate(LocalDateTime ldt)
	{
		String regex = "[0-9] {4}/([0-9] {1,2}/) {2}([0-9] {1,2}:) {3}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(String.valueOf(ldt));
		System.out.println(regex);
		System.out.println(matcher.matches());
		return matcher.matches();
	}*/
}