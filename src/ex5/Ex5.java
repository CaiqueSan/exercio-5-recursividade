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
		// condi��o de parada: se n for menor que 2 seus antecessores sen�o 1, e a soma da sequ�ncia ser� ele mesmo, ent�o a fun��o retorna n
		if (n < 2) 
			return n;
		else 
		// a fun��o chama a si mesma duas vezes somando o retorno de ambar, e como parametro envia os dois antecessores do n atual, realizando
		// a soma da sequencia.
			return Ex5(n - 1) + Ex5(n - 2);
	}
}
