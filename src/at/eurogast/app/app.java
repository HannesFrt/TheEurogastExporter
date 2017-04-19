package at.eurogast.app;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import at.eurogast.exporter.CSVexporter;
import at.eurogast.exporter.Exporter;
import at.eurogast.exporter.JSONExporter;

public class app {

	public static void main(String[] args) {
		ArrayList<Artikel> artikelListe = artikellisteAusDBDummy();
		Exporter csvExport = new CSVexporter();
		Exporter jsonExporter = new JSONExporter();
		switch (args[0].toString()) {
		case "CSV":
			System.out.println("CSV wird durchgeführt");
			csvExport.exportieren(artikelListe);
			break;
		case "JSON":
			System.out.println("JSON wird durchgeführt");
			jsonExporter.exportieren(artikelListe);
			break;

		default:
			System.out.println("Ungültige eingabe, CSV wird durchgeführt");
			csvExport.exportieren(artikelListe);
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
