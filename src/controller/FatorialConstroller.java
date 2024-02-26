package controller;

public class FatorialConstroller {
	public FatorialConstroller() {
		// TODO Auto-generated constructor stub
	}
	
	//Funcao para calcular o fatorial de "num" (limitado a 12)
	public long calcularFat(int num) {
		if(num>12 || num<1) {
			System.out.println("Numero deve estar entre: 1-12");
			return 0;
		}
		
		//Condicao de parada - quando chegamnos ao 1º termo conhecido da sequencia
		if(num==1) 
			return 1;
		
		//Como nao sabemos o resultado do fat atual, multiplicamos pelo resultado do fat anterior
		return num * calcularFat(--num);
	}
}
