package view;

import controller.FatorialConstroller;

public class Principal {

	public static void main(String[] args) {
		
		FatorialConstroller fController = new FatorialConstroller();
		int num = 12;
		
		System.out.println(fController.calcularFat(num));
	}

}
