import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType>
{
	protected Queue<PatientType> priorityQueueHospital;
	
    public PriorityQueueHospital()
    {
    	priorityQueueHospital = new LinkedList<PatientType>();
    }

    public void addPatient(PatientType patient)
    {
    	priorityQueueHospital.add(patient);
    }

    public PatientType nextPatient()
    {
    	return priorityQueueHospital.peek();

    }

    public PatientType treatNextPatient()
    {
    	return priorityQueueHospital.remove();
    }

    public int numPatients()
    {
    	return priorityQueueHospital.size();
    }

    public String hospitalType()
    {
    	return "PriorityQueueHospital";
    }

    public String allPatientInfo()
    {
    	String patients = "";
    	for (PatientType p: priorityQueueHospital) {
    		patients += p.toString();
    	}
    	return patients;
    }
}
