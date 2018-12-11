/**
 * 
 */
package emsamablajecomputadoras;

import emsamablajecomputadoras.builder.AsusZenbookBuilder;
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
		
		// AsusZenbook
		Computadora zenbook;

		director = new ComputadoraDirector(new AsusZenbookBuilder());
		zenbook = director.build();
		System.out.print(zenbook.toString());

	}

}
