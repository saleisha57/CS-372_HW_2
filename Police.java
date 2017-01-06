import java.util.Random;

public class Police extends Person
    implements Employee
{
    String name, phone_number;
    int age, id_num;
    double money;

    
    public enum PoliceRole
    {
	Patrol,
	Srgent,
	Captain,
	Chief
    }

    private PoliceRole role;

    public Police(String n, int a, String p)
    {
	super(n, a, p);

	name = n;
	age = a;
	phone_number = p;
	ask_id_num();
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
    
    
    public PoliceRole getRole() {return role;}
    
    public void setRole(PoliceRole pr) 
    {
	System.out.println("Set role");
	role = pr; 
    }



    public void ask_id_num()
    {
	Random rand = new Random();	

        id_num = rand.nextInt()%99999+100000;
    }

    public int get_id()
    {
	return id_num;
    }

    
    public void give_money()
    {
	money = 15.5;
    }

    
}
