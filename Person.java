public class Person
{
    String name, phone_number;
    int age;

    public Person(String n, int a, String p)
    {
	setName(n);
	setAge(a);
	setPhone(p);
    }
    
    private void setName(String _n)
    {
	name = _n;
    }
    private void setAge(int _a)
    {
	age = _a;
    }
    private void setPhone(String _p)
    {
	phone_number = _p;
    }

    public String getName()
    {
	return name;
    }
    public int getAge()
    {
	return age;
    }
    public String getPhone()
    {
	return phone_number;
    }
    
    
}
