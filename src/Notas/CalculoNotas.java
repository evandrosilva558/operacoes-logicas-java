package Notas;

import javax.swing.JOptionPane;

public class CalculoNotas {

	public static void main(String[] args) {
		
		// input notas
		
		String nota = JOptionPane.showInputDialog("Digite a nota 1 de 0 á 10.");
		String nota2 = JOptionPane.showInputDialog("Digite a nota 2 de 0 á 10.");
		String nota3 = JOptionPane.showInputDialog("Digite a nota 3 de 0 á 10.");
		String nota4 = JOptionPane.showInputDialog("Digite a nota 4 de 0 á 10.");
		
		// converte Strings to Double.
		
		double notaA = Double.parseDouble(nota);
		double notaB = Double.parseDouble(nota2);
		double notaC = Double.parseDouble(nota3);
		double notaD = Double.parseDouble(nota4);
		
		double media = ((notaA + notaB + notaC + notaD) / 4);
		
		// Grade status
		
		if (media == 6) {
			JOptionPane.showMessageDialog(null, "A media é " + media + " aluno em reculperação.");
		}else if (media >= 7) {
			JOptionPane.showMessageDialog(null, "A media é " + media + " aluno está aprovado.");
		}else{
			JOptionPane.showMessageDialog(null, "A media é " + media + " aluno está reprovado.");
		}
		
	}
}
