package FED_Taller3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * date 22-11-2017
 * @author Cesar Barrero
 *
 */

public class Punto2 
{
		public static void loadMatrix(int [][] matrix, int minRandom, int maxRandom)
		{
			minRandom = 1;
			maxRandom = 9;
			for (int i = 0; i < matrix.length; i++) 
			{
				for (int j = 0; j < matrix[i].length; j++) 
				{
					matrix[i][j] = minRandom - ((int) Math.round((Math.random()) * (minRandom - maxRandom)));
			    }
			}
		}

		public static void printMatrix(int [][] matrix)
		{
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++){
					System.out.print("[" + matrix[i][j] + "]");
			    }
				System.out.println("");
			}
		}

		public static void spiralMatrix(int [][] matrix){
			
			int m = matrix.length;
			int inicio = 0;
			int limite = matrix.length - 1;
			int count = 1;
			int number1;
			
			while(count <= m * m){
				for (int i = inicio; i <= limite; i++) {
					number1 = matrix[inicio][i];
					System.out.print("["+number1+"]");
					count++;
				}

				for (int i = inicio+1; i <= limite; i++){
					
					number1 = matrix[i][limite];
					System.out.print("["+number1+"]");
					count++;
				}
					
				for (int i = limite-1; i >= inicio; i--){
					number1 = matrix[limite][i];
					System.out.print("["+number1+"]");
					count++;
				}
				
				for (int i = limite-1; i >= inicio+1; i--){
					number1 = matrix[i][inicio];
					System.out.print("["+number1+"]");
					count++;
				}
			inicio +=1;
			limite -=1;
			}
		}

		public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
					
			bw.write("Escriba el tama�o de la matriz: ");
			bw.flush();
					
			int m = Integer.parseInt(br.readLine());
					
			int [][] matrix = new int [m][m];
			loadMatrix(matrix, m, m);
			printMatrix(matrix);
			System.out.println("");
			spiralMatrix(matrix);
		}
}