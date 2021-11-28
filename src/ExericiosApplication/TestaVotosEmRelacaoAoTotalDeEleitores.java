package ExericiosApplication;

import exercicioEntidades.VotoEmRelacaoAoTotalDeEleitores;

public class TestaVotosEmRelacaoAoTotalDeEleitores {

	public static void main(String[] args) {
	
		//criar o objeto com parametro para os calculos
		VotoEmRelacaoAoTotalDeEleitores vrt = new VotoEmRelacaoAoTotalDeEleitores(1000, 800, 150, 50);
		//calcula votos validos
		Integer validos = vrt.percentualDeVotosValidos();
		//calcula votos em branco
		Integer brancos = vrt.percentualDeVotosBrancos();
		//calcula votos nulos
		Integer nulos = vrt.percentualDeVotosNulos();
		
		//mostra no console o resultado
		System.out.println("A porcentagem de votos válidos é = " + validos + "%");
		System.out.println("A porcentagem de votos em branco é = " + brancos + "%");
		System.out.println("A porcentagem de votos nulos é = " + nulos + "%");
		
	}

}
