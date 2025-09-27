
import java.util.*;
public class Patient {
    private int id;
    private String name;
    private int age;
    private String bloodGroup;
    private  String allergies;
    List<Medicalhistory> Medicalhistory;

    public Patient(int id, String name, int age, String allergies, String bloodGroup) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.allergies = allergies;
        this.bloodGroup = bloodGroup;
        this.Medicalhistory = new ArrayList<>();
    }
}
