package prog2.tp2_2017a;

public class Palabras implements Alfabeto<Character>
{
	
	@Override
	public int tam() { return 27; }

	@Override
	public int indice(Character elem) 
	{
		if (elem >= 'a' && elem <= 'z')
			return elem - 'a';

		throw new RuntimeException("digito no v�lido: " + elem);
	}
	
	@Override
	public boolean equals(Object o)
	{
		Palabras d2 = (Palabras) o;
		
		if(d2.tam() != tam())
			return false;
		
		boolean ret = true;
		for(int i=0; i<tam(); ++i)
		{
			ret = ret && this.getCaracter(i).equals(d2.getCaracter(i));
		}
		
		return ret;
	}
	
	private Character getCaracter(int i)
	{
		if(i < 0 || i > tam())
			throw new IllegalArgumentException("Indice fuera de rango");
		
		return (char) (i + '0');
	}
}
