package listaStringhe;

import java.util.List;
import java.util.TreeSet;

public class ListaStringhe {

	public static void main(String[] args) {
		List<String> amici = List.of("Luca","Marco","Ilaria","Alessandro","Alberto");

		for(String l: amici) {
			System.out.println(l);
		}
		
		System.out.println(amici);
		
		TreeSet<String> amiciOrdinati=new TreeSet<String>(amici);
		
		System.out.println(amiciOrdinati);
		
	
	}
	

}
