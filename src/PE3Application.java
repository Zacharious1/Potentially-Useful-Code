public class PE3Application {
	
	public static void main(String[] args) {
		PE3Cadet[] cadet = CadetFactory.createInitialCadets();
		PE3Application app = new PE3Application();
		
		displayCadetsByHometown("Lexington", cadet);
		System.out.println();
		app.displayCadetsByGPAandMajor(3.0, "CIS", cadet);
		System.out.println();
		app.displayCadetsInformation(cadet);
	}
	
	/*  Display all cadets whose hometown is 'location'. */
	public static void displayCadetsByHometown(String loc, PE3Cadet[] cadet) {
		for (int i = 0; i < cadet.length; i++)
			if (cadet[i].getHometown().equals(loc))
				System.out.println(cadet[i].getName() + " is from " + cadet[i].getHometown());
	}

	public void displayCadetsByGPAandMajor(double gpa, String major, PE3Cadet[] cadet) {
		for (int i = 0; i < cadet.length; i++)
			if (cadet[i].getGpa() > gpa && cadet[i].getMajor().equals(major))
				System.out.println(cadet[i].getName() + ", class of " + cadet[i].getClassOf() + ", from  " + cadet[i].getHometown() +  " is majoring in " + cadet[i].getMajor() + " and has a GPA of " + cadet[i].getGpa());
	}
	public void displayCadetsInformation(PE3Cadet[] cadet) {
		for (int i = 0; i < cadet.length; i++)
			System.out.println(cadet[i].toString());
	}
	 
	
}