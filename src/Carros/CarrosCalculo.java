package Carros;

import javax.swing.JOptionPane; // method UI dialog-box JavaSwing InputDialog and showMessageDialog.

public class CarrosCalculo {

	public static void main(String[] args) {
		
		 // Valor do inputDialog value in String.
		
		String carros = JOptionPane.showInputDialog("Informa a quantidade de carros ?");
		
		String pessoas = JOptionPane.showInputDialog("Informa a quantidade de pessoas ?");
		
		// Converter String to Double.
		
		double carroNumero = Double.parseDouble(carros);
		
		double pessoaNumero = Double.parseDouble(pessoas);
		
		// Converter Double to Integer.
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		int resto = (int) (carroNumero % pessoaNumero);
		
		//  Print results in showMessageDialog.
		
		JOptionPane.showMessageDialog(null, "Os carros divididos pelo número de pessoas foi : " + divisao + " Carros para cada pessoa e soblou " + resto + " carro (s).");

	}

}
