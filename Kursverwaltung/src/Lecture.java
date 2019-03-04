import java.util.ArrayList;

public class Lecture {

    // Attribute
    private String name;
    private String teacher;
    private ArrayList<Participant> participants = new ArrayList<Participant>();

    // Konstruktor
    public Lecture(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }
}
