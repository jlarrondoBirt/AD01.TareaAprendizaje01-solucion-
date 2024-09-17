package ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ud1TareaAprendizaje2Ejercicio2 {

	  public static void main(String[] args) {

		    String nomFich = args[0];

		    try (BufferedReader fbr = new BufferedReader(new FileReader(nomFich))) {
		      int i = 1;
		      String linea = fbr.readLine();
		      while (linea != null) {
		        System.out.format("[%5d] %s", i++, linea);
		        System.out.println();
		        linea = fbr.readLine();
		      }
		    } catch (FileNotFoundException e) {
		      System.out.println("No existe fichero " + nomFich);
		    } catch (IOException e) {
		      System.out.println("Error de E/S: " + e.getMessage());
		    } catch (Exception e) {
		      e.printStackTrace();
		    }

		  }
}
