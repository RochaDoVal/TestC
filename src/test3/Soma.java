package test3;

public class Soma {
	//Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
	public static void main(String[] args) {
		int INDICE = 12;
		int SOMA = 0;
		int K = 1 ;
		
		while(K < INDICE) {
			K = K + 1;
			SOMA = SOMA + K;
		}
		System.out.println(SOMA);
	}

}
