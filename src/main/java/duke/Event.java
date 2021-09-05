package duke;

public class Event extends Task{
    protected String by;

    public Event(String description, String by) {
        super(description);
        this.label = "E";
        this.by = by;
    }
    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + by + ")";
    }
}
