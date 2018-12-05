public class Embotelladora
{
	public int calcBotellasPequenyas(int pequenyas,int grandes,int total)
	{
		int max_grandes;
		int max_pequenyas;

		if (pequenyas < 0 || grandes < 0 || total < 0){
			throw new ClassCastException("Embotelladora.calcBotellasPequenyas");
		}
		if(pequenyas == 0 || total == 0){
			return 0;
		}
		max_grandes = total/5;
		if((grandes-max_grandes) < 0){
			max_grandes = grandes;
		}
		max_pequenyas = total - 5*max_grandes;
		if((pequenyas-max_pequenyas) < 0){
			max_pequenyas = pequenyas;
		}
		return max_pequenyas;
	}
}
