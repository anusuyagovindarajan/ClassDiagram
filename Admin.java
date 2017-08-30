import java.util.HashMap;

public class Admin {

    String name;
    String mobileNumber;
    String emailID;
    Conference conference;

    public Admin(String organiserName, String organiserMobileNumber, String organiserEmailID, Conference conference) {
        this.name = organiserName;
        this.mobileNumber = organiserMobileNumber;
        this.emailID = organiserEmailID;
        this.conference = conference;
    }

    public String getOrganiserName() {
        return name;
    }

    public String getOrganiserMobileNumber() {
        return mobileNumber;
    }

    public String getOrganiserEmailID() {
        return emailID;
    }

    public Conference getConference() {
        return conference;
    }

    boolean checkAvailability(Session session){

        //get session by name
        //check session capacity > 0 allow registration,
        return true;
    }

    boolean checkRedundantRegistration(Session session, Registrant registrant){

        //check whether a participant is trying to register for the same session again
        return true;

    }

    public void registerParticipant(String sessionName,Registrant registrant){
        Session session = conference.getSessionByName(sessionName);

        boolean available = checkAvailability(session);
        boolean redundant = checkRedundantRegistration(session,registrant);

        if(available == false){
            return;
        }

        if (redundant == true){
            System.out.println("already registered!!");
            return;
        }

        if(available == true && redundant == false){
            //update registrant in Session, update capacity in Session
            //do not allow registratiion otherwise
        }

    }

    public void showSessions(){
        HashMap<String,Session> availableSessions = conference.getSessions();
        //show sessions with non zero capacity at that point of time
    }


}
