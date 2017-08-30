public class Registrant {

    String name;
    String mobileNumber;
    String emailID;

    public Registrant(String name, String mobileNumber, String emailID) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.emailID = emailID;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmailID() {
        return emailID;
    }
}
