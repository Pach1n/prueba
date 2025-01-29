import java.util.Random;
import java.util.Scanner;

//comprobar cambios repositorio
//pull comprobar
public class EjadicionalM {

	
	static final int NUM_ASIGNATURAS = 7;
	static final int NUM_ALUMNOS = 20;
	
	
	public static void imprimirMatrizenteros(int[][] m1) {
		System.out.println("Contenido de la matriz : ");
		for (int[] num : m1) {
			for (int num2 : num) {
				System.out.print(num2 + " ");
			}
			System.out.println();
		}

	}
	
	public static void mostrarMenu() {
		System.out.println("1) Rellenar datos aleatoriamente");
		System.out.println("2) Mostrar todas las notas de un alumno");
		System.out.println("3) Mostrar todas las notas");
		System.out.println("4) Obtener la media global de un alumno");
		System.out.println("5) Obtener la media global de todos los alumnos");
		System.out.println("6) Cuántos alumnos han aprobado una asignatura");
		System.out.println("7) Cuántos asignaturas ha aprobado un alumno");
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		int media = 0;
		int sumaNotas = 0;
		int mediaTotal = 0;
		Random r = new Random();
	
		int notas[][] = new int[NUM_ASIGNATURAS][NUM_ALUMNOS];
		
		
		do {
			
			EjadicionalM.mostrarMenu();
			opc = sc.nextInt();
			switch (opc) {
			
			case 1:
				
				for (int i = 0; i < notas.length ; i++) {
					for (int j = 0; j < notas[i].length; j++) {
						notas[i][j] = r.nextInt(10);
						
					}
				}
				break;
			case 2:
				
				System.out.println("De que alumno quieres mostrar las notas");
				int numAlu = sc.nextInt();
				
				for (int i = 0; i < notas.length; i++) {
					System.out.println(notas[i][numAlu]);
				}
				break;
				
			case 3:
				
				EjadicionalM.imprimirMatrizenteros(notas);
				break;
				
			case 4:
				
			System.out.println("De que alumno quieres mostrar las notas");
			numAlu = sc.nextInt();
			for (int i = 0; i < notas.length; i++) {
				media+=notas[i][numAlu];
			}
			media = media/NUM_ASIGNATURAS;
			break;
			
			case 5:
			
				for (int i = 0; i < NUM_ALUMNOS; i++) {
					sumaNotas = 0;
					for(int j = 0; j < notas.length; j++) {
						sumaNotas+= notas[j][i];
						
						
						mediaTotal = sumaNotas / NUM_ASIGNATURAS;
						
					}
					
					System.out.println("La media del alumno "+ i + " es " + mediaTotal);
				}
			break;
			
			
			
				
			case 6:
				
				System.out.println("Elige una asignatura para ver el número de aprobados 0-6");
				int num_asig = sc.nextInt();
				int notasAlu = 0;
				int numaprobados = 0;
				
				for(int i = 0; i < notas[num_asig].length; i++) {
				
					if (notas[num_asig][i] > 5 ) {
						numaprobados++;
					}
					
				}
				System.out.println("Han aprobado "+ numaprobados);
				
				break;
				
			case 7:
				
				System.out.println("Elige un alumno para ver cuantas asignaturas ha aprobado 0-19");
				int num_alu = 0;
				num_alu = sc.nextInt();
				int numaprobadas = 0;
				
				for(int i = 0; i < notas[num_alu].length; i++) {
					
					if (notas[num_alu][i] > 5 ) {
						numaprobadas++;
					}
					
				}
				System.out.println("El alumno"+ num_alu + " ha aprobado "+ numaprobadas + "asignaturas");
				
				
				
				
				
			
			}
			
			
			
			
		} while (opc!=0);
		
		
		

	}

}
