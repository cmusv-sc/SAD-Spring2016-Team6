package models;

/**
 * Created by bowenyang on 4/25/16.
 */

public abstract class GeneralModel {

    public long id;

    public String content;

    public long timestamp;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getId() { return this.id; }

    public void setId(long id) {
        this.id = id;
    }
//    To be implemented by subclasses
    public abstract String toString();

}
