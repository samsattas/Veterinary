package ui;

import model.*;
import java.util.Scanner;
import java.util.ArrayList;
//import java.time.LocalDate;


public class Main{
	public static void main(String []args){
		ArrayList<String> seeClient = new ArrayList<String>();
		ArrayList<Client> regClient = new ArrayList<Client>();
		ArrayList<String> seePet = new ArrayList<String>();
		ArrayList<Pet> regPet = new ArrayList<Pet>();
		Scanner s=new Scanner(System.in);
		//LocalDate today = LocalDate.now();
		int i = 0;
		int select = 0;
		String tot = "	Clientes:\n";
		Pet auxPet;
		Client auxClient;

		
		//DATE
		System.out.print("ingrese el dia actual\n");
		int day=s.nextInt();
		s.nextLine();
		
		System.out.print("ingrese el mes actual\n");		
		int month=s.nextInt();
		s.nextLine();
		
		System.out.print("ingrese el anio actual\n");		
		int year=s.nextInt();
		s.nextLine();
		
		Date todayDate =new Date(day, month, year);


		while(i < 1){
			System.out.println("#############################################");
			System.out.println("#####	VETERINARIA MI PEQUE\u00d1A MASCOTA	#####");
			System.out.println("#############	  BIENVENIDO	#############");
			System.out.println("#############################################\n");

			//System.out.println("Fecha: " + today);
			System.out.println("Fecha: " + day + "/" + month + "/" + year + "\n");

			System.out.println("\n	Que desea hacer?");
			System.out.println("	1.Registrar usuario");
			System.out.println("	2.Ver usuarios");
			System.out.println("	3.Registrar mascota");//DONE RF#
			System.out.println("	4.Ver mascotas");
			System.out.println("	5.");
			System.out.println("	6.");

			System.out.println("	0.Salir");

			select = s.nextInt();

			if (select == 0){//SALIDA
				System.out.println("VUELVA PRONTO!");
				i++;

			}else if(select== 1){//REGISTRO CLIENTES
				s.nextLine();//CLEAR int>String
				

				if (!regPet.isEmpty()){
					System.out.println("Ingrese su nombre:");				
					String name = s.nextLine();
				
					System.out.println("Ingrese su ID:");
					int id = s.nextInt();

					s.nextLine();//CLEAR int>String

					System.out.println("Ingrese su direccion:");
					String adress = s.nextLine();
				
					System.out.println("Ingrese su telefono:");
					long phone = s.nextLong();

					System.out.println("Ingrese el numero de su Mascota:");
					for (int a = 0; a < regPet.size(); a++){
						System.out.println( a + ")----------" + regPet.get(a) + "\n------------\n");
					}
					int petSelect = s.nextInt();
					Pet cPet = regPet.get(petSelect);

					auxClient = new Client(name, id, adress, phone, cPet);
					regClient.add(auxClient);

					seeClient.add(name);
				}else{
					System.out.println("\n########################################");
					System.out.println("# NO HAY MASCOTAS, REGISTRO CANCELADO. #");
					System.out.println("########################################\n");
				}

				
				

				
   				
    			

			}else if (select == 2){//VER CLIENTES
				System.out.println("Clientes:\n" );
				for(int n = 0; n < regClient.size();n++){
					System.out.println(n + ")-----------------------------\n" + regClient.get(n) + "\n-------------------------------\n");
				}
				



			}else if (select == 3){//REGISTRO MASCOTA
				s.nextLine();//CLEAR int>String

				System.out.println("Ingrese el nombre:");
				String pName = s.nextLine();

				System.out.println("Ingrese la edad:");
				int age = s.nextInt();

				s.nextLine();//CLEAR int>String

				System.out.println("Ingrese el tipo de animal:");
				System.out.println("0.Perro");
				System.out.println("1.Gato");
				System.out.println("2.Ave");
				System.out.println("3.Otro");

				int typeSelect = s.nextInt();

				if(typeSelect == 0){
					String type = "Perro";
				}else if(typeSelect == 1){
					String type = "Gato";
				}else if(typeSelect == 2){
					String type = "Otro";
				}else{
					String type = "Otro";
				}

				System.out.println("Ingrese el peso:");
				double weight = s.nextDouble();

				auxPet = new Pet(pName, age, type, weight);

				regPet.add(auxPet);

				seePet.add(pName);

				System.out.println("Se ha registrado exitosamente!");




			}else if (select == 4){//VER MASCOTAS
				System.out.println("Mascotas:\n");
				for (int n = 0; n < regPet.size();n++){
					System.out.println( n + ")----------" + regPet.get(n) + "\n------------\n");
				}
			}
		}
	}
}