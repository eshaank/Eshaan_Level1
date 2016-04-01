// Copyright Wintriss Technical Schools 2013
public class TeaMaker {
	public static void main(String[] args) {
		Kettle hi = new Kettle();
		Cup lolz = new Cup();
		TeaBag haha = new TeaBag("Mint");

		hi.getWater();
		Kettle.Water w = hi.getWater();
		hi.boil();
		haha.getFlavor();
		lolz.makeTea(haha, w);

	}

}

class TeaBag {

	public final static String GREEN = "Green";
	public final static String MINT = "Mint";
	public final static String CHAMOMILE = "Chamomile";
	public final static String PASSION_FRUIT = "Passion Fruit";

	private String flavor;

	TeaBag(String flavor) {
		this.flavor = flavor;
	}

	String getFlavor() {
		return flavor;
	}

}

class Kettle {

	private Water water = new Water();

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}

	class Water {

		private boolean isHot = false;

		public boolean isHot() {
			return this.isHot;
		}
	}

}

class Cup {

	private TeaBag teabag;

	void makeTea(TeaBag teabag, Kettle.Water hotWater) {
		this.teabag = teabag;
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.");
		else
			System.out.println("Can't make tea with cold water! ");
	}

	public void makeTea(boolean b) {
		// TODO Auto-generated method stub

	}

}
