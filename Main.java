import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        int ascensores;
        int pisos;
        int sotanos;
        int piso;
        int opcion = 0;
        int noAscensor = 1;
        
        System.out.println("Bienvenido al Sistema de Ascensores");
        System.out.print("Digite el Numero de Ascensores : ");
        ascensores = LeerConsola.nextInt();
        Ascensor[] ascensor=new Ascensor[ascensores];
        
        for(int i = 0 ; i < ascensores ; i++ ){
            System.out.print("Digite el numero de pisos del ascensor " + noAscensor+" : " );
            pisos = LeerConsola.nextInt();
            System.out.print("Digite el numero de sotanos del ascensor " + noAscensor + " : ");
            sotanos = LeerConsola.nextInt();
            ascensor[i] = new Ascensor(pisos,sotanos);
            noAscensor++;
        }
        
        do {
			System.out.println("[1]. Subir un piso");
			System.out.println("[2]. Bajar un piso");
			System.out.println("[3]. Numero de pisos que puede antender");
			System.out.println("[4]. Salir");
			
			System.out.print("Digite una opcion : ");
			opcion = LeerConsola.nextInt();
			
			switch(opcion) {
				case 1:
                                    int signt;
                                    System.out.print("Seleccione el ascensor : ");
                                    ascensores = LeerConsola.nextInt();
                                    ascensores--;
                                    pisos = ascensor[ascensores].getnoPisos();
                                    sotanos = ascensor[ascensores].getnoSotanos();
                                    ascensores++;
                                    System.out.println("El ascensor "+ ascensores + " tiene " + pisos + " pisos y " + sotanos +" sotanos");
                                    System.out.print("Seleccione el piso en el que actualmente esta el ascensor : ");
                                    piso = LeerConsola.nextInt();
                                    if(piso == 0){
                                        System.out.println("No existe el piso : " + piso);
                                    }else{
                                        if(piso<(sotanos*-1)){
                                            System.out.println("El ascensor "+ ascensores + " solo tiene " + sotanos + " sotanos");
                                        }else{
                                            signt = Ascensor.sgntPiso(pisos, sotanos, piso);
                                            if(signt == 0){
                                                System.out.println("No se puede subir un piso mas en el ascensor "+ ascensores + " ya que solo tiene " + pisos + " pisos");
                                            }else{
                                                System.out.println("El siguiente piso es : " + signt);
                                            }
                                        }
                                    }
                                    System.out.println("Presione cualquier tecla para continuar...");
                                    try {
                                        System.in.read();
                                    } catch (IOException e) {
                                        System.out.println("Error");
                                    }
                                    break;
				case 2:
                                    int ant;
                                    System.out.print("Seleccione el ascensor : ");
                                    ascensores = LeerConsola.nextInt();
                                    ascensores--;
                                    pisos = ascensor[ascensores].getnoPisos();
                                    sotanos = ascensor[ascensores].getnoSotanos();
                                    ascensores++;
                                    System.out.println("El ascensor "+ ascensores + " tiene " + pisos + " pisos y " + sotanos +" sotanos");
                                    System.out.print("Seleccione el piso en el que actualmente esta el ascensor : ");
                                    piso = LeerConsola.nextInt();
                                    if(piso == 0){
                                        System.out.println("No existe el piso : " + piso);
                                    }else{
                                        if(piso > pisos){
                                            System.out.println("El ascensor "+ ascensores + " solo tiene " + pisos + " pisos");
                                        }else{
                                            ant = Ascensor.antPiso(pisos, sotanos, piso);
                                            if(ant == 0){
                                                System.out.println("No se puede bajar un piso en el ascensor "+ ascensores + " ya que solo tiene " + sotanos + " sotanos");
                                            }else{
                                                System.out.println("El anterior piso es : " + ant);
                                            }
                                        }
                                    }
                                    System.out.println("Presione cualquier tecla para continuar...");
                                    try {
                                        System.in.read();
                                    } catch (IOException e) {
                                        System.out.println("Error");
                                    }
                                    break;
				case 3:
                                    int atencion;
                                    System.out.print("Seleccione el ascensor : ");
                                    ascensores = LeerConsola.nextInt();
                                    ascensores--;
                                    pisos = ascensor[ascensores].getnoPisos();
                                    sotanos = ascensor[ascensores].getnoSotanos();
                                    ascensores++;
                                    System.out.println("El ascensor "+ ascensores + " tiene " + pisos + " pisos y " + sotanos +" sotanos");
                                    atencion = Ascensor.Atencion(pisos, sotanos);
                                    System.out.println("El numero de pisos que puede atender el ascensor "+ ascensores + " son " + atencion + " pisos");
                                    System.out.println("Presione cualquier tecla para continuar...");
                                    try {
                                        System.in.read();
                                    } catch (IOException e) {
                                        System.out.println("Error");
                                    }
                                    break;
				case 4:
                                    System.out.println("Saliendo del Sistema de Ascensores");
                                    System.out.println("----------------");
                                    break;
				default:
					System.out.println("Selecciono una opcion invalida");
					break;
			}
		}while(opcion!=4);
    }
}