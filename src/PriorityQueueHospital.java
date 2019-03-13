import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueueHospital<PatientType extends Comparable<PatientType>>
{
	protected Queue<PatientType> priorityQueueHospital;
	
    PriorityQueueHospital()
    {
    	priorityQueueHospital = new LinkedList<PatientType>();
    }

    public void addPatient(PatientType patient)
    {
    	priorityQueueHospital.add(patient);
    }

    public PatientType nextPatient()
    {

    }

    public PatientType treatNextPatient()
    {

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

    }
}
