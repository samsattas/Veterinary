package model;

public class Client{

	private String name;
	private int id;
	private String adress;
	private long phone;
	private Pet cPet;


	//Constructor
	public Client(String name, int id, String adress, long phone, Pet cPet){
		this.name = name;
		this.id = id;
		this.adress = adress;
		this.phone = phone;
		this.cPet = cPet;
	}

	
//getters & setters
	public String getName(){return name;}
	public int getId(){return id;}
	public String getAdress(){return adress;}
	public long getPhone(){return phone;}
	public Pet getCPet(){return cPet;}

	public void setName(String name){this.name = name;}
	public void setId(int id){this.id = id;}
	public void setAdress(String adress){this.adress = adress;}
	public void setPhone(long phone){this.phone = phone;}
	public void setCPet(Pet cPet){this.cPet = cPet;}


	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: ");
        sb.append(name);
        sb.append("\nIdentificacion: ");
        sb.append(id);
        sb.append("\nDireccion: ");
        sb.append(adress);
        sb.append("\nTelefono: ");
        sb.append(phone); 
        sb.append("\nMascota");
        sb.append(cPet);
        return sb.toString();
    } 
}