package hb.fxjardin.model;

public class Tomate extends Vegetal {

	public Tomate() {
		super();
		dessin[3] = 't';
		dessin[4] = 'T';
	}

	@Override
	public String name() {
		return "Tomate";
	}

}