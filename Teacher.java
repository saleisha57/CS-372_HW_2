import java.util.Random;

public class Teacher extends Person
    implements Employee
{
    String name, phone_number;
    int age, id_num, grade_level;
    Random r = new Random();

    public enum TeacherCert
    {
	Math,
	English,
	History,
	Art
    }

    private TeacherCert cert;
    
    public Teacher(String n, int a, String p)
    {
	super(n, a, p);
	name = n;
	age = a;
	phone_number = p;
	grade_level = r.nextInt((12-1)+1) + 1;
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

    public int getGrade()
    {
	return grade_level;
    }


    public TeacherCert getCert() {return cert;}
    
    public void setCert(TeacherCert ct) 
    {
	System.out.println("Certification");
	cert = ct; 
    }


    public void ask_id_num()
    {
        id_num = r.nextInt()%99999+100000;
    }

    public int get_id()
    {
	return id_num;
    }

    
    public void give_money()
    {
	
    }
    
}
