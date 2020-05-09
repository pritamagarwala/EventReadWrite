import java.sql.Timestamp;

public class FloorAccessEvent {
    private long person_id;
    private String datetime;
    private int floor_level;
    private String buildind;

    public FloorAccessEvent(long person_id, String datetime, int floor_level, String buildind) {
        this.person_id = person_id;
        this.datetime = datetime;
        this.floor_level = floor_level;
        this.buildind = buildind;
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public int getFloor_level() {
        return floor_level;
    }

    public void setFloor_level(int floor_level) {
        this.floor_level = floor_level;
    }

    public String getBuildind() {
        return buildind;
    }

    public void setBuildind(String buildind) {
        this.buildind = buildind;
    }
}
