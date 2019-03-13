import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 
 * @author Erin Harrington
 *
 * @param <PatientType>
 */
public class StackHospital<PatientType> extends Hospital<PatientType>
{

	
	protected Stack<PatientType> stackHospital;
	
    StackHospital() {
        stackHospital = new Stack<PatientType>();
    }
    
    public void addPatient(PatientType patient) {
        stackHospital.push(patient);
    }
    
    public PatientType nextPatient() {
       return stackHospital.peek();
    }
    
    public PatientType treatNextPatient() {
        return stackHospital.pop();
    }
    
    public int numPatients() {
        return stackHospital.size();
    }
    
    public String hospitalType() {
        return "StackHospital";
    }
    
    public String allPatientInfo() {
        Iterator<PatientType> iter = stackHospital.iterator();
        return (String) iter.next();     
    	
    }
}
