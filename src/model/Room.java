package model;

public class Room{
	private final static boolean DISPONIBLE = true;
	private final static boolean OCUPADO = false;

	private Clinic rClinic;
	private Pet rPet;
	private boolean space;

	public  Room( Clinic rClinic, Pet rPet, boolean space){
		
		this.rClinic = null;
		this.rPet = null;
		this.space = DISPONIBLE;
	}

	//getters & setters
	public Clinic getRClient(){return rClinic;}
	public Pet getRPet(){return rPet;}
	public boolean getSpace(){return space;}

	public void setRClient(Clinic rClinic){this.rClinic = rClinic;}
	public void setRPet(Pet rPet){this.rPet = rPet;}
	public void setSpace(boolean space){this.space = space;}
}