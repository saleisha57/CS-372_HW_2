public class Police extends Person
    implements Employee
{
    public enum PoliceRole
    {
	Patrol,
	Srgent,
	Captain,
	Chief
    }

    private PoliceRole role;

    public Police(String name, int age, String phone_number)
    {
	super(name, age, phone_number);
    }



    public PoliceRole getRole() {return role;}
    
    public void setRole(PoliceRole pr) 
    {
	System.out.println("Set role");
	role = pr; 
    }



    public void ask_id_num()
    {
	System.out.println("What is your number.");
    }
    
    public void give_money()
    {
	System.out.println("Here");
    }

    
}
