package main;

import java.util.Random;

import implement.ThreadImplementation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Random rn = new Random();
		
        int Quantidade = rn.nextInt(10) + 1;
        String caixa = "caixa 1";
        System.out.println("Quantidade de pessoas no "+ caixa + " : " + Quantidade);

        ThreadImplementation TI1 = new ThreadImplementation(Quantidade, caixa);
        Thread caixa1 = new Thread(TI1);
        caixa1.start();
        
        Quantidade = rn.nextInt(10) + 1;
        caixa = "caixa 2";
        System.out.println("Quantidade de pessoas no "+ caixa + " : " + Quantidade);
        ThreadImplementation TI2 = new ThreadImplementation(Quantidade, caixa);
        Thread caixa2 = new Thread(TI2);        
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        caixa2.start();
	
        
        Quantidade = rn.nextInt(10) + 1;
        caixa = "caixa 3";
        System.out.println("Quantidade de pessoas no "+ caixa + " : " + Quantidade);
        ThreadImplementation TI3 = new ThreadImplementation(Quantidade, caixa);
        Thread caixa3 = new Thread(TI3);        
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        caixa3.start();
	}
}
