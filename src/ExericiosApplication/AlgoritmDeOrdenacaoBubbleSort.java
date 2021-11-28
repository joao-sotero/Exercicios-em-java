package ExericiosApplication;

public class AlgoritmDeOrdenacaoBubbleSort {
	
	public static void main(String args[]){
		
		//vetor que será ordenado pela aplicação
		int[] vet = {5,3,2,4,7,1,0,6};
		
		//variavel auxiliar
		int aux = 0;
		
		//exibe no console o vetor desordenado 
		System.out.println("Vetor desordenado: ");
		
		for(int vetor : vet) {
			System.out.print(" "+vetor);
		}
		
		System.out.println();

		//Ordena o vetor 
		for(int i = 0; i<vet.length; i++){
			for(int j = 0; j<7; j++){
				if(vet[j] > vet[j + 1]){
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		//mostra no console o vetor ordenado
		System.out.println("Vetor organizado:");
		for(int vetor : vet) {
			System.out.print(" "+vetor);
		}
	}
	
}
