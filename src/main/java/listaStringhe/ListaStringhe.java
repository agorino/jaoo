package listaStringhe;

import java.util.List;
import java.util.TreeSet;

public class ListaStringhe {

	public static void main(String[] args) {
		List<String> amici = List.of("Luca", "Marco", "Ilaria", "Alessandro", "Alberto", "Maria","Maria");

		for (String l : amici) {
			System.out.println(l);
		}

		System.out.println("amici "+amici);

		TreeSet<String> amiciOrdinati = new TreeSet<String>(amici);

		System.out.println("amiciOrdinati "+amiciOrdinati);

		TreeSet<String> amici2 = new TreeSet<String>((x, y) -> {
			if (x.length()==y.length() && !x.equals(y)) {
				return -1;
			}

			return Integer.compare(x.length(), y.length());

		});
		amici2.addAll(amici);
		
		TreeSet<String> amici4 = new TreeSet<String>((x, y) -> {
			if (x.length()==y.length() && !x.equals(y)) {
				return 1;
			}

			return Integer.compare(y.length(), x.length());

		});
		amici4.addAll(amici);

		
		
		TreeSet<String> amici3 = new TreeSet<String>((x, y) -> Integer.compare(y.length(), x.length()));
		amici3.addAll(amici);

		System.out.println("amici2 "+amici2);
		System.out.println("amici3 "+amici3);
		System.out.println("amici4 "+amici4);

	}

}
