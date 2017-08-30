import java.util.HashMap;

public class Conference {

    String title;
    HashMap<String, Session> sessions;

    public Conference(String title, HashMap<String, Session> sessions) {
        this.title = title;
        this.sessions = sessions;
    }

    public String getTitle() {
        return title;
    }

    public HashMap<String, Session> getSessions() {
        return sessions;
    }

    public Session getSessionByName(String sessionName){
        return null;
    }

}
