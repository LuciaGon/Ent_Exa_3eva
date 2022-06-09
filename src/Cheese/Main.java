/*
*	grupo  :	GDAM21
*	alumno :	Lucía González Carmona
*	n.exp. :	7253
*	fecha  :	09/06/2022
 */
package Cheese;

/**
 * Clase main del examen
 * @author ___
 */
public class Main {
	/**
	 * MÃ©todo main del examen
	 * @param args Argumentos para linea de comandos
	 * @author ___
	 */
     public static void main(String[] args) {
    
         System.out.println("1Âº Gdam: Entornos de desarrollo");
         Producto p1 = new Producto("123", "queso", 1, 50);
         Producto p2 = new Producto("1234", "leche", 2, 100);
         ListaProductos l = new ListaProductos("nueva lista");
         l.registraProducto(p1);
         l.registraProducto(p2);
         p1.imprime_etiqueta();
         p2.imprime_etiqueta();
     }
}
