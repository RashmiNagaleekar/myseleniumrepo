
public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TownHospital new = new TownHospital(); Can not create TownHospital object as its incomplete
		CityHospital c = new CityHospital();
		c.billing();//came from townhosiptal 
		c.emergency();//came from townhosiptal 
		c.bodyScanTests();
		c.operate();
		
	}

}
