package prog2.tp2_2017a;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrieCharTest 
{
	@Test
	public void agregarTest()
	{
		Digitos digitos = new Digitos();
		TrieChar diccionario = new TrieChar(digitos);
		diccionario.agregar("1", "Harry Potter");
		assertEquals(diccionario.getRaiz().hijo(1).val, "Harry Potter");
	}

}