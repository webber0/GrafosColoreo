package coloreo;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
	public static Graph readFile(String path) {
		try {
			Scanner archivo = new Scanner(new File(path));
			int nodos = archivo.nextInt();
			Integer[][] matrixGraph = new Integer[nodos][nodos];
			archivo.nextInt(); // Para omitir las aristas
			while (archivo.hasNext()) {
				int nodoOrigen = archivo.nextInt();
				int nodoDestino = archivo.nextInt();
				// Esta parte adaptarla para el caso
				matrixGraph[nodoOrigen][nodoDestino] = 1;
				matrixGraph[nodoDestino][nodoOrigen] = 1;
			}
			archivo.close();
			return new Graph(matrixGraph);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}