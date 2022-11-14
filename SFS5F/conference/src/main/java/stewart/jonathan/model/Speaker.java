package stewart.jonathan.model;

public class Speaker {

    private String firstName;
    private String lastName;
    private double seedNum;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSeedNum() {
        return seedNum;
    }

    public void setSeedNum(double seedNum) {
        this.seedNum = seedNum;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
