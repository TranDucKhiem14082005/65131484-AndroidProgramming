package khiem.it.vieccanlam;

import java.util.HashMap;

public class TASKS {
    String name;
    String meassgase;
    String date;
    String priority;

    public TASKS(String name, String meassgase, String date, String priority) {
        this.name = name;
        this.meassgase = meassgase;
        this.date = date;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeassgase() {
        return meassgase;
    }

    public void setMeassgase(String meassgase) {
        this.meassgase = meassgase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    public HashMap<String,String> toFirebaseObject() {
        HashMap<String,String> taskObject = new HashMap<String
                ,String>();
        taskObject.put("name",name);
        taskObject.put("date",date);
        taskObject.put("massage",meassgase);
        taskObject.put("priotity",priority);
        return taskObject;
    }
}
