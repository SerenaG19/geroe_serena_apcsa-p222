//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

public class Dog //LOOK FOR THIS IN THE MIDTERM
{
    private int age;
    private String name;
    
    public Dog(int a, String n) 
    {
    	age = a;
    	name = n;
    } 
    	 
    public String getName()
    {
    	return name;
    }
    
    public int getAge()
    {
    	return age;
    }
    	    	
    public String toString()
    {
    	return "" + age + " " + name;
    }  
}