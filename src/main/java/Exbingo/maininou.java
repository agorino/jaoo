package Exbingo;

public class maininou {
	public static void main(String[] args) {

		int[] outer = { 1, 2, 4, 6 };
		int[] inner = { 2,3, 4 };
		boolean result = true;

		int i = 0;
		int j = 0;
		int comune = 0;
		while (i < outer.length && j < inner.length) {
			if (outer[i] == inner[j]) {
				comune++;
				i++;
				j++;
			} else
				i++;
		}
		System.out.println(comune == inner.length);

		i=0;j=0;
		while (i < inner.length && j < outer.length) {
			if (inner[i] > outer[j]) {
				j++;
			} else if (inner[i] == outer[j]) {
				i++;
				j++;

			} else {
				result = false;
				break;
			}
		}

		System.out.println(result);

	}

}
