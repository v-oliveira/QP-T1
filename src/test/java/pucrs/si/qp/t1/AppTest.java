package pucrs.si.qp.t1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
	//Escaleno
	@Test
    public void testEscaleno()
    {
        int actual = App.identificaTriangulo(2, 3, 4);
        int expected = Tipos.ESCALENO.value();
        assertEquals(expected, actual);
    }
	
	//Equilatero
	@Test
    public void testEquilatero()
    {
        int actual = App.identificaTriangulo(5, 5, 5);
        int expected = Tipos.EQUILATERO.value();
        assertEquals(expected, actual);
    }
	
	//Isosceles
	@Test
    public void testIsosceles()
    {
        int actual = App.identificaTriangulo(6, 6, 7);
        int expected = Tipos.ISOSCELES.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testVarianteDeTres()
    {
        int actual = App.identificaTriangulo(6, 7, 6);
        int expected = Tipos.ISOSCELES.value();
        assertEquals(expected, actual);
    }
	@Test
	   public void testIsosceles2()
	{
	    int actual = App.identificaTriangulo(7, 6, 6);
	    int expected = Tipos.ISOSCELES.value();
	    assertEquals(expected, actual);
	}
	
	//Entradas Invalidas
	@Test
    public void testValorZero()
    {
        int actual = App.identificaTriangulo(8, 0, 9);
        int expected = Tipos.ENTRADA_INVALIDA.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testValorNegativo()
    {
        int actual = App.identificaTriangulo(2, 3, -4);
        int expected = Tipos.ENTRADA_INVALIDA.value();
        assertEquals(expected, actual);
    }
	
	//Triangulos Invalidos
	@Test
    public void testLinha()
    {
        int actual = App.identificaTriangulo(1, 2, 3);
        int expected = Tipos.TRIANGULO_INVALIDO.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testVarianteDeSete()
    {
        int actual = App.identificaTriangulo(1, 3, 2);
        int expected = Tipos.TRIANGULO_INVALIDO.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testTrianguloInvalido()
    {
        int actual = App.identificaTriangulo(3, 1, 2);
        int expected = Tipos.TRIANGULO_INVALIDO.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testLinhaLonga()
    {
        int actual = App.identificaTriangulo(1, 2, 8);
        int expected = Tipos.TRIANGULO_INVALIDO.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testVariantesDeNove()
    {
        int actual = App.identificaTriangulo(8, 1, 2);
        int expected = Tipos.TRIANGULO_INVALIDO.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testTodosZero()
    {
        int actual = App.identificaTriangulo(0, 0, 0);
        int expected = Tipos.TRIANGULO_INVALIDO.value();
        assertEquals(expected, actual);
    }

}
