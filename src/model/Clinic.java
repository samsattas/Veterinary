package model;

public class Clinic{
	private final static boolean ABIERTO = true;
	private final static boolean CERRADO = false;

	private boolean status;
	private Client cClient;
	private Date inDate;
	private String symptom;
	private String diagnostic;

	public Clinic(boolean status, Client cClient, Date inDate, String symptom, String diagnostic){
		this.status = status;
		this.cClient = cClient;
		this.inDate = inDate;
		this.symptom = symptom;
		this.diagnostic = diagnostic;
		
	}


	//getters & setters
	public boolean getStatus(){return status;}
	public Client getCClient(){return cClient;}
	public Date getInDate(){return inDate;}
	public String getSymptom(){return symptom;}
	public String getDiagnostic(){return diagnostic;}

	public void setStatus(boolean status){this.status = status;}
	public void setCClient(Client cClient){this.cClient = cClient;}
	public void setInDate(Date inDate){this.inDate = inDate;}
	public void setSymptom(String symptom){this.symptom = symptom;}
	public void setDiagnostic(String diagnostic){this.diagnostic = diagnostic;}


}