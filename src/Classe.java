

import java.util.Scanner;
import java.util.Arrays;

public class Classe {
	public int [] Pilha =new int [10];
	public int Num =0 ;
	public Scanner Leitura = new Scanner(System.in);
	
	
	
	
	public void colocandoNumero() {
		
				while(Num <10) {
					
					try {
						
						System.out.println("Digite o número:");
						Pilha[Num] = Leitura.nextInt();
						Num++;
					}
					
					catch (java.util.InputMismatchException e){
						System.out.println("Aceitamos somente números!!");
						Leitura.nextLine();	
					}
					}
	}
				public void colocandoOrdem() {
					
					Arrays.sort(Pilha);
				}
					
				public void mostrandoResultado() {
					
					System.out.println(Arrays.toString(Pilha));
					
				}
		
		
		
	}

