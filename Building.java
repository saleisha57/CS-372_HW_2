public abstract class Building
{
    String name, address;

    public Building(String n, String ad)
    {
	name = n;
	address = ad;
    }

    abstract void add_to_array(String nm);
    
    abstract void show_people();
    
    abstract String get_name();

    abstract String get_address();

}
