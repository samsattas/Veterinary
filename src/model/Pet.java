package model;

public class Pet{
	private final static String PERRO = "Perro";
	private final static String GATO = "Gato";
	private final static String AVE = "Ave";
	private final static String OTRO = "Otro";
	
	private String name;
	private int age;
	private String type;
	private double weight;
	//private Client cClient; 
	

	public Pet(String name, int age, String type, double weight  ){
		this.name = name;
		this.age = age;
		this.type = type;
		this.weight = weight;
		//this.cClient = cClient;
	}


	//getters & setters
	public String getName(){return name;}
	public int getAge(){return age;}
	public String getType(){return type;}
	public double getWeight(){return weight;}
	//public Client getCClient(){return cClient;}

	public void setName(String name){this.name = name;}
	public void setAge(int age){this.age = age;}
	public void setType(String type){this.type = type;}
	public void setWeight(double weight){this.weight = weight;}
	//public void setCClient(Client cClient){this.cClient = cClient;}

	 @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: ");
        sb.append(name);
        sb.append("\nEdad: ");
        sb.append(age);
        sb.append("\nTipo: ");
        sb.append(type);
        sb.append("\nPeso: ");
        sb.append(weight);    
        return sb.toString();
    }   

}