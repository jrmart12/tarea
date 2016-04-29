
public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	{
		return x+y;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{
		return x-y;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
		return x*y;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y)
	{
		return x%y;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x)
	{
		int var = x%2;
		if (var == 0)
			return true;
		else
		return false;
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	{
		int var = x%3;
		if (var == 0)
			return true;
		else
		return false;
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
		if(edad>=18)
		{
			return true;
		}
		return false;
	}
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z){
		int res_x = x%2;
		int res_y = y%2;
		int res_z = z%2;
		int suma = res_x + res_y + res_z;
		if(suma==0)
		{
			return true;
		}
		return false;
	}
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
	{
		if(x>y && x>z)
		{
			return x;
		}
		if(y>x && y>z)
		{
			return y;
		}
		return z;
	}
		
}
