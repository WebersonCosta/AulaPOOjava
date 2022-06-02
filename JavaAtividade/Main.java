package JavaAtividade;

import java.util.Scanner;

public class Main {
	static Scanner scr = new Scanner(System.in);
	public static void main(String[] args) {
		Novo nv = new Novo("Rua 25",200.000, "Imovel Novo");
		Velho vl = new Velho("Rua 5", 200.000, "Imovel Velho");
		
		int choice;
		
		do {
			System.out.println("Choose a property:: [ 1 ] New \t[ 2 ] Old");
			choice = scr.nextInt();
			if(choice == 1) {
				System.out.println("First");
				System.out.println(nv.nome);
				System.out.println(nv.consultar());
			}else if(choice ==2){
				System.out.println("Second");
				System.out.println(vl.nome);
				System.out.println(vl.consultar());
			}
		}while(choice > 0 && choice < 3);
		System.out.println("See you later");
	}
}
