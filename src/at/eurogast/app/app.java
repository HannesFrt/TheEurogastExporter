package at.eurogast.app;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import at.eurogast.exporter.CSVexporter;
import at.eurogast.exporter.Exporter;
import at.eurogast.exporter.JSONExporter;

public class app {

	public static void main(String[] args) {
		
		Exporter csvexp = new CSVexporter();
		Exporter jsonexp = new JSONExporter();
		
		ArrayList<Artikel> artikelListe = artikellisteAusDBDummy();
		ArrayList<Exporter> artikelExporter = new ArrayList<>();
		
		artikelExporter.add(csvexp);
		artikelExporter.add(jsonexp);
		
		switch (args[0].toString()) {
		case "CSV":
			System.out.println("CSV wird durchgeführt");
			Exporter e = artikelExporter.get(0);
			e.exportieren(artikelListe);
			break;
		case "JSON":
			System.out.println("JSON wird durchgeführt");			
			Exporter e1 = artikelExporter.get(1);
					e1.exportieren(artikelListe);
			break;

		default:
			System.out.println("Ungültige eingabe, CSV wird als Default durchgeführt");
			artikelExporter.get(0).exportieren(artikelListe);
			break;
		}
	}

	public static ArrayList<Artikel> artikellisteAusDBDummy() {
		ArrayList<Artikel> liste = new ArrayList<>();
		liste.add(new Artikel("1", "Sekt", 90.23, new GregorianCalendar(2019, 3, 4), 24));
		liste.add(new Artikel("2", "Fanta", 9.90, new GregorianCalendar(2019, 11, 1), 23));
		liste.add(new Artikel("3", "Cola", 9.90, new GregorianCalendar(2019, 1, 12), 23));
		liste.add(new Artikel("4", "Beinschinken", 12.23, new GregorianCalendar(2019, 11, 12), 45));
		liste.add(new Artikel("5", "Speck", 5.23, new GregorianCalendar(2018, 2, 3), 45));
		return liste;
	}

}
