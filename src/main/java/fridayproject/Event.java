package fridayproject;

public class Event extends Tasks {
    private String start;
    private String end;

    public Event(String description, String start, String end) {
        super(description);
        this.start = start;
        this.end = end;
    }

    @Override
    public String getTypeIcon() {
        return "[E]";
    }

    @Override
    public String toString() {
        return super.toString() + " (from: " + start + " to: " + end + ")";
    }

    @Override 
    public String toFileString() {
        return "E | " + (this.isDone ? "1" : "0") + " | " + this.description 
        +  " | " + this.start + " | " + this.end;
    }
    
}
