
public class CadetFactory {
	public static final int MAX_CADET = 5;
	public static PE3Cadet[] createInitialCadets() {
		PE3Cadet[] cadets = new PE3Cadet[MAX_CADET];
		cadets[0] = new PE3Cadet("Alice", 2022, "CIS");
		cadets[1] = new PE3Cadet("James", 2021, "HI");
		cadets[2] = new PE3Cadet("Tom", 2020, "BCBU");
		cadets[3] = new PE3Cadet("Bob", 2020, "CIS");
		cadets[4] = new PE3Cadet("Smith", 2021, "HI");
		
		return cadets;
	}
}
