public class City
{
    public static void main(String[] args)
    {
	Police p = new Police("Steve Ericson", 37, "124-9765");
	p.setRole(Police.PoliceRole.Patrol);

	Teacher t = new Teacher("Samantha Johnson", 28, "328-6475");
	t.setCert(Teacher.TeacherCert.Math);
       	
	Kid k = new Kid("Faith Law", 10, "235-9876", "Candy Corn");
	System.out.println("Favorite candy: " + k.get_fav_candy());
	
	
	System.out.println(p.getRole() + ": " + p.get_name() + " at age " + p.get_age() + " and phone of " + p.get_phone() + 
			   ". Employee ID number " + p.get_id());
	System.out.println("Garde " + t.getGrade() + " " + t.getCert() + " teacher: " + t.get_name() + " at age " + t.get_age() + 
			   " and phone of " + t.get_phone() + ". Employee ID number " + t.get_id());
	System.out.println(k.get_name() + ": at age " + k.get_age() + " and phone of " + k.get_phone() + ". Favorite candy is: " 
			   + k.get_fav_candy());
	
    }
    
    
}
