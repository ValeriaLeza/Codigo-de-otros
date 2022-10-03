//El programa funciona para determinar el ganador del juego piedra papel o tijera, el usuerio ingresa dos
//entradas de tipo String las cuales son comparadas de acuerdo a las reglas del juego para obtener un ganador.
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
	
	System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");//Se pide al usuario que teclee su opcion antes de escanear el string
    Scanner s = new Scanner(System.in); //Se agrego System.in
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    Scanner s2 = new Scanner(System.in);
    String j2 = s2.nextLine();//Se cambio s por s2

   
    if (j1.equals(j2)) { //se cambio j1 == j2 por j1.equals(j2)
        System.out.println("Empate");
      } else {
        int g = 2;
        switch(j1) {
          case "piedra":
            if (j2.equals("tijeras")) {// Se cambio (j2 == "tijeras") por (j2.equals("tijeras"))
              g = 1;
            }//cierra if
          case "papel":
            if (j2.equals("piedra")) {
              g = 1;
            }//cierra if
          case "tijeras":
            if (j2.equals("papel")) {
              g = 1;
            }//cierra if
            break;
          default:
        }//cierra switch
        System.out.println("Gana el jugador " + g);
    
    s.close(); //Se cerraron los scanners
	s2.close();
    }//cierra else
	}//main
}//class Ejercicio4
	
