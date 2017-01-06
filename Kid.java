public class Kid extends Person
{
    String fav_candy, name, phone_number;
    int age;
    
    public Kid(String n, int a, String p, String candy)
    {
	super(n, a, p);
	name = n;
	age = a;
	phone_number = p;
	set_fav_candy(candy);
    }
    
    public void set_fav_candy(String c)
    {
	fav_candy = c;
    }

    public String get_fav_candy()
    {
	return fav_candy;
    }

    public String get_name()
    {
	return name;
    }

    public int get_age()
    {
	return age;
    }
    
    public String get_phone()
    {
	return phone_number;
    }
    
    
}
