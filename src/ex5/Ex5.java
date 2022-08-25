package ex5;

import javax.swing.JOptionPane;

public class Ex5 {
	
	public static void main(String args[]) {
		int a;
		a = Integer.parseInt((JOptionPane.showInputDialog("Digite um numero")));
		System.out.println(Ex5(a));
	}
	
	public static int Ex5(int n) {
		if (n > 20) {
			System.out.println("Entrada limitada a 20");
			return 0;
			}
		// condição de parada: se n for menor que 2 seus antecessores senão 1, e a soma da sequência será ele mesmo, então a função retorna n
		if (n < 2) 
			return n;
		else 
		// a função chama a si mesma duas vezes somando o retorno de ambar, e como parametro envia os dois antecessores do n atual, realizando
		// a soma da sequencia.
			return Ex5(n - 1) + Ex5(n - 2);
	}
}
