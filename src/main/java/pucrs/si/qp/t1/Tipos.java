package pucrs.si.qp.t1;

public enum Tipos {
	EQUILATERO(1), ESCALENO(2), ISOSCELES(3), TRIANGULO_INVALIDO(4), ENTRADA_INVALIDA(5);
	private final int value;

	Tipos(int v) {
		this.value = v;
	}

	public int value() {
		return value;
	}
}