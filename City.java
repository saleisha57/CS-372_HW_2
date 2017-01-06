public class City
{
    public static void main(String[] args)
    {
	System.out.println("Welcome to the city of Everton!\n");

	Police [] p = {new Police("Steve Ericson", 37, "124-9765"), new Police("Craig Mason", 42, "514-9875"), 
		       new Police("Heather James", 25, "831-6498"), new Police("Tyler Hen", 27, "456-8132")};
       	p[0].setRole(Police.PoliceRole.Patrol);
	p[1].setRole(Police.PoliceRole.Chief);
	p[2].setRole(Police.PoliceRole.Captain);
	p[3].setRole(Police.PoliceRole.Sargent);


	Teacher [] t = {new Teacher("Samantha Johnson", 28, "328-6475"), new Teacher("James Smith", 44, "657-6532")};
	t[0].setCert(Teacher.TeacherCert.Math);
	t[1].setCert(Teacher.TeacherCert.English);
       	

	Kid [] k = {new Kid("Faith Law", 10, "235-9876", "Candy Corn"), new Kid("Junie Lords", 11, "684-7956", "Gummy Worms"), 
		    new Kid("Ray Jones", 8, "254-6542", "Chocolate"), new Kid("John Smith", 10, "564-3185", "Chocolate")};

	City_Hall ch = new City_Hall("City Hall", "612 N Drive dr");
	School sc = new School("Everton Elementary", "254 W Arrow st");

	
	
	int i;

	for(i = 0; i < p.length; i++)
	    {
		System.out.println(p[i].getRole() + ": " + p[i].get_name() + " is " + p[i].get_age() + 
				   " years old and has a phone number of " + p[i].get_phone() + ". Employee ID number: " + p[i].get_id());
		ch.add_to_array(p[i].get_name());
	    }
	System.out.println("\nIn " + ch.get_name() + " at " + ch.get_address() + ":");
	ch.show_people();
	System.out.println("");


	for(i = 0; i < t.length; i++)
	    {
		System.out.println("Grade " + t[i].getGrade() + " " + t[i].getCert() + " teacher: " + t[i].get_name() + " is " 
				   + t[i].get_age() + " years old and has a phone number of " 
				   + t[i].get_phone() + ". Employee ID number: " + t[i].get_id());
		sc.add_to_array(t[i].get_name());
	    }
	    System.out.println("");


	for(i = 0; i < k.length; i++)
	    {
		System.out.println(k[i].get_name() + ": is " + k[i].get_age() + " years old and has a phone number of " 
				   + k[i].get_phone() + ". Favorite candy is: " + k[i].get_fav_candy());
		sc.add_to_array(k[i].get_name());
	    }	
	System.out.println("\nIn " + sc.get_name() + " at " + sc.get_address() + ":");
	sc.show_people();


    }
    
    
}
