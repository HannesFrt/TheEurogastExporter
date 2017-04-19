package at.eurogast.exporter;

import java.util.ArrayList;

import at.eurogast.app.Artikel;

public interface Exporter {
	
	public void exportieren(ArrayList<Artikel> artikel);

}
