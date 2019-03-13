
public class SickPerson extends Person
{

    private int severity;
    
    public SickPerson(String name, int age, int severity) 
    {
        super(name, age);
        this.severity = severity;
        
    }
    
 
    protected int compareToImpl(Person p) {
        int result = 0;
		if (this.severity < p.getSeverity()) {
    		
			result = -1;
		
    	} else if (this.severity > p.getSeverity()) {
    		result = 1;
    	} else if (this.severity == p.getSeverity()) {
    		result = 0;
    	}
		return result;
    	
        
    
    }
    
    public String toString()
    {
        return String.format("%s Severity level %d", super.toString(), severity);
        
    }
}
