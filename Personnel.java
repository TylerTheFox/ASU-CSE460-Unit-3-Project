import java.util.*;
public class Personnel {

	public ArrayList<Person> personList;

	public Personnel() {
	   personList = new ArrayList<Person>();
	}

	public void addPersonnel(Person p)
	{
		personList.add(p);
	}

	public int getSize()
	{
		return personList.size();
	}
	
	public Person get(int i)
	{
		return personList.get(i);
	}

}