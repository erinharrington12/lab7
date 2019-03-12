
public class SickPerson extends Person
{

    private int severity;
    
    public SickPerson(String name, int age, int severity) 
    {
        super(name, age);
        this.severity = severity;
        
    }
    
    protected int compareToImpl(Person p) {
        return 0;
        
    
    }
    
    public String toString()
    {
        return null;
        
    }
}
