/**
 * 
 */
package emsamablajecomputadoras;

import emsamablajecomputadoras.builder.*;
import emsamablajecomputadoras.builder.Computadora;
import emsamablajecomputadoras.builder.ComputadoraDirector;

/**
 * @author djurado
 *
 */
public class PrincipalComputadoras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Necesito ensamblar 2 computadoras
		// AsusROGE

		ComputadoraDirector director;
		Computadora roge;
		director = new ComputadoraDirector(new AsusROGEBuilder());
		roge = director.build();
		
		System.out.print(roge.toString());
		
		// AsusZenbook
		Computadora zenbook;

		director = new ComputadoraDirector(new AsusZenbookBuilder());
		zenbook = director.build();
		
		System.out.print(zenbook.toString());

	}

}
