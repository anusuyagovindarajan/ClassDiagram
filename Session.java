import java.util.HashMap;

public class Session {

    String topic;
    String speaker;
    String date;
    String fromTime;
    String toTime;
    int capacity;
    HashMap <String, Registrant> registrants;

    public Session(String topic, String speaker, String date, String fromTime, String toTime, int capacity, HashMap<String, Registrant> registrants) {
        this.topic = topic;
        this.speaker = speaker;
        this.date = date;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.capacity = capacity;
        this.registrants = registrants;
    }

    public String getTopic() {
        return topic;
    }

    public String getSpeaker() {
        return speaker;
    }

    public String getDate() {
        return date;
    }

    public String getFromTime() {
        return fromTime;
    }

    public String getToTime() {
        return toTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public HashMap<String, Registrant> getRegistrants() {
        return registrants;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRegistrants(HashMap<String, Registrant> registrants) {
        this.registrants = registrants;
    }

    public void addRegistrant(Registrant registrant){

    }

    public void updateCapacity(){

    }


}
