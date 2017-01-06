import java.util.ArrayList;

public class School extends Building
{
   ArrayList<String> current_occ = new ArrayList<String>();
    String name;
    String address;
    

    public School(String n, String ad)
    {
	super(n, ad);
	name = n;
	address = ad;
    }

    public void add_to_array(String nm)
    {
	current_occ.add(nm);
    }

    public String get_name()
    {
	return name;
    }

    public String get_address()
    {
	return address;
    }


    public void show_people()
    {
	for(String holder : current_occ)
	    System.out.println(holder);
    }

}
