
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(500,300);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb= new StringBuilder();
		
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<html>");
		sb.append("<table>");
		sb.append("<h1>");
		sb.append("Live the company");
		sb.append("<tr>");
		sb.append("<th>");
		sb.append("Evento");
		sb.append("</th>");
		sb.append("<th>");
		sb.append("Data");
		sb.append("</th>");
		sb.append("Vado?");
		sb.append("</th>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<th>");
		sb.append("Cocktail party");
		sb.append("</th>");
		sb.append("<th>");
		sb.append("7 dic");
		sb.append("</th>");
		sb.append("<th>");
		sb.append("si");
		sb.append("</tr>");
		sb.append("</th>");
		sb.append("<tr>");
		sb.append("<th>");
		sb.append("Clazione sociale");
		sb.append("</th>");
		sb.append("<th>");
		sb.append("12 dic");
		sb.append("</th>");
		sb.append("si");
		sb.append("</th>");
		sb.append("</tr>");
		sb.append("<th>");
		sb.append("<tr>");
		sb.append("Saluti di Natale");
		sb.append("</th>");
		sb.append("<th>");
		sb.append("23 dic");
		sb.append("</th>");
		sb.append("no");
		sb.append("</th>");
		sb.append("</tr>");
		sb.append("</table>");
		sb.append("<html>");
		
		
		
		
		
		// TODO Convertire lo StringBuilder in String
		 String text = sb.toString(); 
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(text));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

