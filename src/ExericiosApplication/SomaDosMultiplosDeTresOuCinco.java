package ExericiosApplication;

public class SomaDosMultiplosDeTresOuCinco {

	public static void main(String[] args) {
	
		//numero que será feito a contagem multiplo abaixo dele
		int x = 10;
		//variavel auxiliar
		int somatorio = 0;
		
		//calcula multiplo de 3
		for(int i =1; i < x; i++) {
			if(i%3 == 0) {
				somatorio += i;
			}
			//calcula multiplo de 5
			if(i % 5 == 0) {
				somatorio += i;
			}
		}	
		//mostra no console o resultado
		System.out.println(somatorio);
	}

}
