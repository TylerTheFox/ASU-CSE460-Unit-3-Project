public class Person {
	private String last;
	private String first;
	private String middle;


	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;

	}
	
	public String getFirstName()
	{
		return first;
	}
	
	public String getMiddleName()
	{
		return middle;
	}
	
	public String getLastName()
	{
		return last;
	}
	
	public void printNameFML()
	{
		System.out.println(first + "  " + middle + "  " + last);
	}
	
	public void printNameLMF()
	{
		System.out.println(last + " ," + middle + " " + first);
	}
	
	public void printNameLFM()
	{
		System.out.println(last + " ," + first + " " + middle);
	}
}
