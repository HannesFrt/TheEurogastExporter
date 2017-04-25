package at.eurogast.exporter;

import java.util.ArrayList;

import at.eurogast.app.Artikel;

public class CSVexporter implements Exporter{

	@Override
	public void exportieren(ArrayList<Artikel> artikel) {
		StringBuilder ausgabe = new StringBuilder();
		for(Artikel e : artikel){
			ausgabe.append(e.getBezeichnung()+",");
			ausgabe.append(e.getEinkaufspreis()+",");
			ausgabe.append(e.getKategorienummer()+",");
			ausgabe.append(e.getNummer()+",");
			ausgabe.append(e.getAblaufdatum().toZonedDateTime().toLocalDate()+"\n");
		}
		System.out.println(ausgabe.toString());
	}

}
