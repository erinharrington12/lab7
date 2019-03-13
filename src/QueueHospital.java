import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital<PatientType>
{

	protected Queue<PatientType> queueHospital;
    
	public QueueHospital()
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
    	String patients = "";
    	for (PatientType p: queueHospital) {
    		patients += p.toString();
    	}
    	return patients;
    }
}
