package at.eurogast.exporter;

import java.util.ArrayList;

import at.eurogast.app.Artikel;

public class JSONExporter implements Exporter{

	@Override
	public void exportieren(ArrayList<Artikel> artikel) {
		StringBuilder builder = new StringBuilder();
		for(Artikel a : artikel){
			builder.append("{\n");
			builder.append("\t \"Nummer\": " + a.getNummer() +",");
			builder.append("\t \"Bezeichnung\": \" " + a.getBezeichnung() +"\";" );
			builder.append("\t \"Einkaufspreis\": " + a.getEinkaufspreis()+",");
			builder.append("\t \"Ablaufdatum\": \"" + a.getAblaufdatum() +"\",");
			builder.append("\t \"Kategorienummer\": " + a.getKategorienummer());
			builder.append("}");
		}
		
	}


}
