//Proyecto Luca Podest� 1bf 2019

package proyecto;

import java.util.Scanner;

public class proycetodef {
	static Scanner dato=new Scanner(System.in);
	static final int C=10;
	//vectores registro habitaci�n
	static int []identi=new int[C];  //identificador de la habitacion
	static String []Tipo=new String[C];  //Tipo deluxe economica o suit
	static int []cantcam=new int[C];  //camas por defecto
	
	static int []estados=new int[C];//0 libre 1 alquilado
	static int []habits=new int[C];
	
	//vectores registro clientes
	static String []Nom=new String[C];  //nombre cliente
	static String []Ape=new String[C];  //apellido cliente
	static int []CI=new int[C];  //Cedula del cliente
	static String []mail=new String[C];  //mail del cliente
	static String []numtel=new String[C];  //numero de telefono del cliente
	
	//vectores reserva
	static int []identiReservas=new int[C];  
	static int []ciReservas=new int[C];
	
	//Cantidades registradas
	static int canthabitareg=0;
	static int cantclienreg=0;
	static int cantcuentasreg=0;
	
	//variables operadoras
	static int id;
	
	/////////////////////////////////////////////////////////////////////////////////////
	public static void main(String []args) {   //men� inicial
	
		int op;
		do{
			System.out.println("RESERVA EN TU HOTEL");
			System.out.println("1-Habitaci�n");
			System.out.println("2-Cliente");
			System.out.println("3-Reserva");
			System.out.println("0-Salir");
			System.out.println("OPCI�N: ");
			op=dato.nextInt();
			
			switch (op) {
				case 1:
					menuhab();
					
					break;
				
				case 2:
					menucli();
					break;
					
				case 3:
					menures();
					break;
					
				case 0:
					System.out.println("Gracias por confiar en nosotros!");
					break;
					
				default:
					System.out.println("Opci�n incorrecta , por favor seleeccion una de las opciones mostradas en  el men�");
					}
			
		}while(op!=0);
	}
	/////////////////////////////////////////////////////////////////////////////////////
	public static void datosprecargadoshabitacion() {  //datos precargados habitaci�n
		identi[0]=1;Tipo[0]="Deluxe";cantcam[0]=3;estados[0]=0;
		canthabitareg = canthabitareg + 1;
		identi[1]=2;Tipo[1]="Econ�mica";cantcam[1]=1;estados[1]=0;
		canthabitareg = canthabitareg + 1;
	}
	/////////////////////////////////////////////////////////////////////////////////////
	public static void datosprecargadosclientes() {    //datos precargados cliente
		Nom[0]="Juan";Ape[0]="Fernandez";CI[0]=36784563;mail[0]="juanfer@gmail.com";numtel[0]="098752835";
		cantclienreg=cantclienreg+1;
		
	}
	/////////////////////////////////////////////////////////////////////////////////////
	public static void menuhab() { //men� habitaci�n
		
		//llamar datos precargados
		datosprecargadoshabitacion();
		int op2 = 0;
		int op = 0;
		
			System.out.println("--------------------------------------- ");
			
			do {
				System.out.println("Habitacion");
				System.out.println("1-Registrar");
				System.out.println("2-Modificar");
				System.out.println("3-Eliminar");
				System.out.println("4-Listar todo");
				System.out.println("5-Buscar");
				System.out.println("0-Volver");
				System.out.println("OPCI�N: ");
				op=dato.nextInt();
				
				switch(op) {
					case 1:
						System.out.println("Ingrese identificador(N�mero): ");
						identi[canthabitareg]=dato.nextInt();  //el identificador se guarda en la variable
						
						do{
							System.out.println("Ingrese tipo de habitaci�n ");
							System.out.println("1-Econ�mica");
							System.out.println("2-Deluxe");
							System.out.println("3-Suit");
							System.out.println("OPCI�N: ");
							op2=dato.nextInt();
	
							switch(op2) {
							case 1:
								Tipo[canthabitareg]="Econ�mica";
								break;
							
							case 2:
								Tipo[canthabitareg]="Deluxe";
								break;
								
							case 3:
								Tipo[canthabitareg]="Suit";
								break;
								
							
								
							default:
								System.out.println("Opci�n incorrecta , por favor seleeccion una de las opciones mostradas en  el men�");
						
								
							}
						}while(op2==0 || op2>3);
						
						
						System.out.println("Ingrese cantidad de camas: ");
						cantcam[canthabitareg]=dato.nextInt();
						estados[canthabitareg]=0;
						
						canthabitareg = canthabitareg + 1;
						System.out.println("La habitaci�n se registro correctamente ! ! !");
						System.out.println("-----------------------------------");
						System.out.println(" ");
						
						break;
					
					case 2:
						System.out.println("Ingrese el identificador de la habitaci�n que desea modificar: ");
						id=dato.nextInt();
						System.out.println(" ");
						for(int x=0;x<canthabitareg;x++) {
							if(identi[x]==id) {
					
								
							
								System.out.println("Datos actuales de la habitaci�n: \n Identificador: " + id +"   Tipo: "+ Tipo[x] +"   Cantidad de camas: "+ cantcam[x]);
								System.out.println(" ");
								System.out.println("Ingrese nuevo identificador: ");
								identi[x]=dato.nextInt();
								do{
											
									System.out.println("Ingrese nuevo tipo de habitaci�n ");
									System.out.println("1-Econ�mica");
									System.out.println("2-Deluxe");
									System.out.println("3-Suit");
									System.out.println("OPCI�N: ");
									op2=dato.nextInt();
	
									switch(op2) {
									case 1:
										Tipo[x]="Econ�mica";
										break;
									
									case 2:
										Tipo[x]="Deluxe";
										break;
										
									case 3:
										Tipo[x]="Suit";
										break;
										
									default:
										System.out.println("Opci�n incorrecta , por favor seleeccion una de las opciones mostradas en  el men�");
										break;
										
									}
								}while(op2==0 || op2>3);								
								
								System.out.println("Ingrese la nueva cantidad de camas: ");
								cantcam[x]=dato.nextInt();
								
								System.out.println("Los datos de la habitaci�n se actualizaron correctamente! ! !");
								System.out.println("---------------------------------------------------");
								System.out.println("");
							
								
							}
						}
							break;
					case 3:
						System.out.println("Ingrese identificador de la habitaci�n que desea eliminar: ");
						id=dato.nextInt();
						//vectores auxiliares de cantidad 10
						int []identiAuxiliar=new int[C];
						String []TipoAuxiliar=new String[C];
						int []cantcamAuxiliar=new int[C];
						int []estadosAuxiliar=new int[C];
						int j = 0;
						for(int x=0;x<canthabitareg;x++) {
							if(identi[x] != id) {
								//Si es diferente lo agrego al vector auxiliar
								identiAuxiliar[j] = identi[x];
								TipoAuxiliar[j] = Tipo[x];
								cantcamAuxiliar[j] = cantcam[x];
								estadosAuxiliar[j] = estados[x];
								j = j + 1;
							}
						}
						
						//Los vectores originales pasan a ser iguales a los vectores auxiliares
						identi = identiAuxiliar;
						Tipo = TipoAuxiliar;
						cantcam = cantcamAuxiliar;
						estados = estadosAuxiliar;
						
						//se resta 1 a la cantidad de habitaciones
						canthabitareg = canthabitareg -1;
						System.out.println("La habitaci�n se a eliminado correctamente! ! !");
						System.out.println("------------------------------------------------------");
						break;
						
					case 4:
						System.out.println("Id    Tipo     Camas");
						for(int x=0;x<canthabitareg;x++) {
							
							System.out.println(identi[x]+"     "+Tipo[x]+"   "+cantcam[x]+" ");
						}
						System.out.println("-------------------------------");
						break;
						
					case 5:
						System.out.println("Ingrese el identificador de la habitaci�n que desea buscar: ");
						id=dato.nextInt();
						int f=0;
						int z=0;
						for(int x=0;x<canthabitareg;x++) {
							
							if(identi[x]==id) {
								f=x;
								z=1;
								
							}
								
						}				
						if(z==1) {
			
							System.out.println("Datos actuales de la habitaci�n: \n Identificador: " + identi[f] +" Tipo: "+ Tipo[f] +" Cantidad de camas: "+ cantcam[f]);
							
						}else {
							System.out.println("habitacion no registrada");
						}
						System.out.println("----------------------------------------------------------------------------");
						
						break;
						
					case 0:
						break;
						
					default:
						System.out.println("Opci�n incorrecta , por favor seleeccion una de las opciones mostradas en  el men�");
						System.out.println(" ");
					
					
				}
				
			}while(op!=0);
			
			
	}
	/////////////////////////////////////////////////////////////////////////////////////
	public static void menucli() { //men� clientes
				//int n1;
				int op;
				datosprecargadosclientes();
				System.out.println("--------------------------------------- ");
				do {
					System.out.println("CLIENTE");
					System.out.println("1-Registrar");
					System.out.println("2-Modificar");
					System.out.println("3-Eliminar");
					System.out.println("4-Listar todo");
					System.out.println("5-Buscar");
					System.out.println("0-Volver");
					System.out.println("OPCION: ");
					op=dato.nextInt();
					
					switch(op) {
					case 1:	
						System.out.println("Ingrese nombre: ");
						Nom[cantclienreg]=dato.next();
						System.out.println("Ingrese apellido: ");
						Ape[cantclienreg]=dato.next();
						System.out.println("Ingrese correo electronico: ");
						mail[cantclienreg]=dato.next();
						System.out.println("Ingrese cedula de identidad: ");
						CI[cantclienreg]=dato.nextInt();
						System.out.println("Ingrese numero de telefono");
						numtel[cantclienreg]=dato.next();
						
						cantclienreg=cantclienreg +1;
						System.out.println("El usuario se a registrado correctamente! ! !");
						System.out.println("-----------------------------------");
						System.out.println(" ");
						
						break;
					
					case 2:  //modificar cliente
						System.out.println("Ingrese cedula del cliente que desea modificar: ");
						id=dato.nextInt();
						System.out.println(" ");
						
						for(int x=0;x<cantclienreg;x++) {

							if(CI[x]==id) {
								
								System.out.println("Datos actuales del cliente: \nombre: "+Nom[x]+"   Apellido: "+Ape[x]+"   CI: "+id+"   Mail: "+mail[x]+"   Numero: "+numtel[x]);
								System.out.println(" ");
								
								System.out.println("Ingrese nuevo nombre: ");
								Nom[cantclienreg]=dato.next();
								System.out.println("Ingrese nuevo apellido: ");
								Ape[cantclienreg]=dato.next();
								System.out.println("Ingrese nuevo correo electronico: ");
								mail[cantclienreg]=dato.next();
								System.out.println("Ingrese nueva cedula de identidad: ");
								CI[cantclienreg]=dato.nextInt();
								System.out.println("Ingrese nuevo numero de telefono");
								numtel[cantclienreg]=dato.next();
								
								System.out.println("Los datos se actualizaron correctamente! ! !");
								System.out.println(" --------------------------------------------------------------");
								System.out.println(" ");
							}
							
						}
						
						break;
						
					case 3:  //eliminar cliente
						System.out.println("Ingrese cedula del cliente que desea eliminar: ");
						id=dato.nextInt();
						//vectores auxiliares de cantidad 10
						int []identiCAuxiliar=new int[C];
						String []NomAuxiliar=new String[C];
						String []ApeAuxiliar=new String[C];
						int []CIAuxiliar=new int[C];
						String []MailAuxiliar=new String[C];
						String []NumTelAuxiliar=new String[C];
						
						int j = 0;
						for(int x=0;x<cantclienreg;x++) {
							if(CI[x] != id) {
								//Si es diferente lo agrego al vector auxiliar
								
								NomAuxiliar[j] = Nom[x];
								ApeAuxiliar[j] = Ape[x];
								CIAuxiliar[j] = CI[x];
								MailAuxiliar[j] = mail[x];
								NumTelAuxiliar[j] = numtel[x];
								j = j + 1;
							}
						}
						
						//Los vectores originales pasan a ser iguales a los vectores auxiliares
						
						Nom = NomAuxiliar;
						Ape = ApeAuxiliar;
						CI = CIAuxiliar;
						mail = MailAuxiliar;
						numtel = NumTelAuxiliar;
						
						//se resta 1 a la cantidad de clientes
						cantclienreg = cantclienreg -1;
						System.out.println("El cliente se a eliminado correctamente! ! !");
						System.out.println("------------------------------------------------------");
						break;
					case 4:  //Listado de clientes
						System.out.println("Nombre   Apellido   CI   Mail   Telefono");
						for(int x=0;x<cantclienreg;x++) {
							
							System.out.println(Nom[x]+"     "+Ape[x]+"   "+CI[x]+" "+mail[x]+" "+numtel[x]+" ");
						}
						System.out.println("-------------------------------");
						System.out.println(" ");
						break;						
					case 5:  //Buscador de clientes
						System.out.println("Ingrese cedula del cliente que desea buscar: ");
						id=dato.nextInt();
						int f=0;
						int z=0;
						for(int x=0;x<cantclienreg;x++) {
							if(CI[x]==id) {
								f=x;
								z=1;
							}
						}				
						if(z==1) {
			
							System.out.println("Datos actuales del cliente: \n Nombre: " + Nom[f] +" Apellido: "+ Ape[f]+ " CI:" + CI[f] +" Mail: "+ mail[f] + " Tel�fono:" + numtel[f]);
							
						}else {
							System.out.println("Cliente no registrado");
						}
						System.out.println("----------------------------------------------------------------------------");				
					
						System.out.println(" ");
						break;
						
					case 0:
						break;
						
					default:
						System.out.println("Opci�n incorrecta , por favor seleeccion una de las opciones mostradas en  el men�");
						System.out.println(" ");
				}
				
			}while(op!=0);
				
			}
	/////////////////////////////////////////////////////////////////////////////////////
	public static void menures() {  //menu reserva
				int op, x = 0;
				datosprecargadoshabitacion();
				datosprecargadosclientes();
				String opp;
				System.out.println("--------------------------------------- ");
				do {
					System.out.println("RESERVA");
					System.out.println("1-Reservar");
					System.out.println("2-Listar habitaciones y clientes");
					System.out.println("3-Consultar estado");
					System.out.println("0-Volver");
					System.out.println("OPCION: ");
					op=dato.nextInt();
					
					switch(op) {
					case 1:  //reserva
						System.out.println("Escriba identificador de la habitaci�n que desea registrar: ");
						opp=dato.next();
						
						if(x<canthabitareg){
							if(estados[x]==0){
							System.out.println("Usted ha alquilado la habitaci�n: ");
							System.out.println(identi[x]+"   " +Tipo[x]+"   " +cantcam[x]);
							estados[x]=1;
							}else{
								System.out.println("La habitaci�n :");
								System.out.println(identi[x]+"   " +Tipo[x]+"   " +cantcam[x]);
								System.out.println("Habitaci�n libre! ! !");
								
								estados[x]=0;
							}
								
						}else{
							System.out.println("No existe la habitaci�n que ingres� ");

							
								
						}
							
						
						
						System.out.println("-------------------------------------------------- ");
						System.out.println(" ");
						break;
					
					case 2:  //Listado de habitaciones y clientes
						////////////////////////////////////////////////////////////////////////////
						
						System.out.println("Nombre   Apellido   CI   Mail   Telefono");
						for(int z=0;z<cantclienreg;z++) {
							
							System.out.println(Nom[z]+"     "+Ape[z]+"   "+CI[z]+" "+mail[z]+" "+numtel[z]+" ");
						}
						System.out.println("-------------------------------");
						System.out.println(" ");
						/////////////////////////////////////////////////////////////////////////////
						System.out.println("Id    Tipo     Camas");
						for(int x1=0;x1<canthabitareg;x1++) {
						
							System.out.println(identi[x1]+"     "+Tipo[x1]+"   "+cantcam[x1]+" ");
						}
						
						System.out.println(" -------------------------------------------------------------");
						System.out.println(" ");
						break;
						 
					case 3:  //Estado de habitaciones
						System.out.println("Ingrese el identificador de la habitaci�n que desea buscar: ");
						id=dato.nextInt();
						int f=0;
						int z=0;
						for(int x1=0;x1<canthabitareg;x1++) {
							
							if(identi[x1]==id) {
								f=x1;
								z=1;
								
							}
								
						}				
						if(z==1) {
							if(estados[x]==1) {
								System.out.println("La habitacion esta alquilada");
							}else {
								System.out.println("La habitacion esta libre");
								
							}
							
						}else {
							System.out.println("Ingrese una habitacion valida");
								
						}
						System.out.println("---------------------------------------------------------------- ");
						System.out.println(" ");
						break;
						
					case 0:
						break;
						
					default:
						System.out.println("Opci�n incorrecta, por favor selecci�n una de las opciones mostradas en  el men�: ");
						System.out.println(" ");
					
					}
				}while(op!=0);
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////
			
				
			}
	