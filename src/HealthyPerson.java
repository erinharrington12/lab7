
public class HealthyPerson extends Person
{

    private String reason;
    
    public HealthyPerson(String name, int age, String reason) {
        
        super(name, age);
        this.reason = reason;
    }
    
    protected int compareToImpl(Person p) {
        
    	int result = 0;
    	int compare = this.getName().compareToIgnoreCase(p.getName());
    	 
    	if (!(p instanceof HealthyPerson)) {
    		result = 0;
    	} else if (compare < 0) {
    		result = -1;
    	} else if (compare == 0) {
    		result = 0;
    	} else if (compare > 0) {
    		result = 1;
    	}
    	
    	return compare;
        
    }
    
    public String toString() {
        
    	return String.format("%s In for %s", super.toString(), reason);
        
    }
}
