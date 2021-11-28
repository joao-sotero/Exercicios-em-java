package ExericiosApplication;

public class Fatorial {

	public static void main(String[] args) {
		
		//numero que será usado no fatorial
		int fatorial = 5;
		//variavel auxiliar
		int resultado = 1;
		
		//calcula o fatorial
		if(!(fatorial == 0) || !(fatorial == 1)) {
			for(int i = 1; i<= fatorial; i++) {
				resultado *= i;
				}
		}
		//mostar no console o resultado
		System.out.println("O fatorial de "+ fatorial+"! é: "+ resultado);
	}

}
