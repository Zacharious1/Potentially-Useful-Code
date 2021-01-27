//Help Received: none
public class VMIMember {
    private String name;
    private int clas;
    private String major;
    private String advises;
    private String rank;
    private String advisor;
    private String position;
    private boolean male;
    private String department;
    private boolean faculty;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getClas() {
        return clas;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvises(String advises) {
        this.advises = advises;
    }

    public String getAdvises() {
        return advises;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }



    public void setFaculty(boolean faculty) {
        this.faculty = faculty;
    }

    public String getPosition() {
        return position;
    }

    public String getRank() {
        return rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public VMIMember(String name, int clas, String major, boolean male, String advisor) {
        this.name = name;
        this.clas = clas;
        this.major = major;
        this.male = male;
        faculty = false;
        this.advisor = advisor;
    }

    public VMIMember(String name, String rank, String department, String position, boolean male, String advises) {
        this.name = name;
        this.rank = rank;
        this.department = department;
        this.position = position;
        this.male = male;
        this.advises = advises;
        faculty = true;
    }

    @Override
    public String toString() {
        if (this.faculty && this.male) {
            return "The faculty name is \"" + this.getName()+ "\". He is a/an " + this.getPosition() +" in " + this.getDepartment() +
            ". He is the advisor of Cadet(s) " + this.getAdvises();
        }
        else if (this.faculty && !this.male) {
            return "The faculty name is \"" + this.getName()+ "\". She is a/an " + this.getPosition() +" in " + this.getDepartment() +
                    ". She is the advisor of Cadet(s) " + this.getAdvises();
        }
        else if (!this.faculty && male) {
            return "The cadet name is \"" + this.getName()+ "\" (class of " + this.getClas()+ ") and his major is "+this.getMajor()+ ". His advisor is " + this.getAdvisor();
        }
        else {
            return "The cadet name is \"" + this.getName()+ "\" (class of " + this.getClas()+ ") and her major is "+this.getMajor()+ ". Her advisor is " + this.getAdvisor();
        }
    }

    public static void main(String[] args) {
        VMIMember[] members = new VMIMember[5];
        members[0] = new VMIMember("Tom Brown", 2022, "CIS", true, "Jenifer Blue");
        members[1] = new VMIMember("Alice Yellow", 2022, "CIS", false, "Jenifer Blue");
        members[2] = new VMIMember("Brian Pink", 2022, "HI", true, "Smith Red");
        members[3] = new VMIMember("Jenifer Blue", "Major", "CIS", "Associate Professor", false, "Tom Brown, Alice Yellow");
        members[4] = new VMIMember("Smith Red", "Col.", "HI", "Professor", true, "Brian Pink");

        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i].toString());
        }

    }
}
