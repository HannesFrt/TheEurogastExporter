package at.eurogast.exporter;

import java.util.ArrayList;

import at.eurogast.app.Artikel;

public class JSONExporter implements Exporter {

	@Override
	public void exportieren(ArrayList<Artikel> artikel) {
		StringBuilder builder = new StringBuilder();
		builder.append("[\n");
		for (Artikel a : artikel) {
			builder.append("\t{\n");
			builder.append("\t\t \"Nummer\": " + a.getNummer() + ",\n");
			builder.append("\t\t \"Bezeichnung\": \" " + a.getBezeichnung() + "\",\n");
			builder.append("\t\t \"Einkaufspreis\": " + a.getEinkaufspreis() + ",\n");
			builder.append("\t\t \"Ablaufdatum\": \"" + a.getAblaufdatum().toZonedDateTime().toLocalDate() + "\",\n");
			builder.append("\t\t \"Kategorienummer\": " + a.getKategorienummer() + "\n");
			if (artikel.get(artikel.size() - 1) != a) {
				builder.append("\t},\n");
			}else{
				builder.append("\t}\n");
			}
		}
		builder.append("]");
		System.out.println(builder.toString());

	}

}
