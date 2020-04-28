package pucrs.si.qp.t1;

public class App {

	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int identificaTriangulo(int a, int b, int c) {
		if (a == 0 && b == 0 && c == 0) {
			return Tipos.TRIANGULO_INVALIDO.value();
		}
		if (a <= 0 || b <= 0 || c <= 0) {
			return Tipos.ENTRADA_INVALIDA.value();
		}
		if ((a < b + c) && (b < a + c) && (c < b + a)) {
			if ((a == b) && (b == c))
				return Tipos.EQUILATERO.value();
			else if ((a != b) && (a != c) && (b != c))
				return Tipos.ESCALENO.value();
			else
				return Tipos.ISOSCELES.value();
		}
		return Tipos.TRIANGULO_INVALIDO.value();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Triângulos!");
		System.out.println(identificaTriangulo(2, 3, -4));
	}
}