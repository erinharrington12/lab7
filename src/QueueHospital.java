import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital<PatientType>
{

	protected Queue<PatientType> queueHospital;
    QueueHospital()
    {
    	queueHospital = new LinkedList<PatientType>();
    }

    public void addPatient(PatientType patient)
    {
    	queueHospital.add(patient);
    }

    public PatientType nextPatient()
    {
    	return queueHospital.peek();
    }

    public PatientType treatNextPatient()
    {
    	return queueHospital.remove();
    }

    public int numPatients()
    {
    	return queueHospital.size();
    }

    public String hospitalType()
    {
    	return "QueueHospital";
    }

    public String allPatientInfo()
    {
    	  return ((LinkedList<PatientType>) queueHospital).listIterator(0).toString();
    }
}
