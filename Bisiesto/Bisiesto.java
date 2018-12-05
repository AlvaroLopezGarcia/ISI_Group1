public class Bisiesto
{

	public boolean EsBisiesto(int anyo){
        if (anyo < 0) throw new IllegalArgumentException();
		if((anyo %4 == 0) && ((anyo %100 != 0) || (anyo %400 == 0))){
			return true;
		}else{
			return false;
		}
	}
}
