public class PE3Cadet {

	private String name;
	private int classOf;
	private String major;
	private String hometown;
	private double gpa;

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	public String getHometown() {
		return hometown;
	}

	public int getClassOf() {
		return classOf;
	}

	public String getMajor() {
		return major;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public void setClassOf(int classOf) {
		this.classOf = classOf;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}


	public PE3Cadet(String name, int classOf, String major) {

	}
	public String toString() {
		return (name + ", class of " + classOf + ", from  " + hometown +  " is majoring in " + major + " and has a GPA of " + gpa);
	}
}
