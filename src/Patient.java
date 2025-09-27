
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

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setMedicalhistory(Medicalhistory record) {
        Medicalhistory.add(record);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", allergies='" + allergies + '\'' +
                ", Medicalhistory=" + Medicalhistory +
                '}';
    }
}
