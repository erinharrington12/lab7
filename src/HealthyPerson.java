
public class HealthyPerson extends Person
{

    private String reason;
    
    public HealthyPerson(String name, int age, String reason) {
        
        super(name, age);
        this.reason = reason;
    }
    
    protected int compareToImpl(Person p) {
        return 0;
        
    }
    
    public String toString() {
        return null;
        
    }
}
