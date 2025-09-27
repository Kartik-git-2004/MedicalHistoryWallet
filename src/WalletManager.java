import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WalletManager {
    private List<Patient> patient = new ArrayList<>();

    public void addPatient(Patient p){
        patient.add(p);
        System.out.println(" **** Patient added successfully! **** ");
    }

    public void viewPatients(){

        if(patient.isEmpty()){
            System.out.println("**** No Patient Found ****");
        }

        for(Patient p : patient){
            System.out.println(p);
            for(Medicalhistory mh : p.Medicalhistory){
                System.out.println(" "+mh);
            }
        }
    }

    public Patient searchPatient(int id ){
        for(Patient p : patient){
            if(p.getId() == id){
                return p;
            }
        }
        return null;

    }
    public void updatePatient(int id ){
    Patient p = searchPatient(id);
    if(p!=null){
        System.out.println("Updating patient .....");
        System.out.println("1.Upadate name \t2.Update Age\t3.Update Allergies\t4.Update BloodGroup\t5.Exit");
        System.out.println("Enter Choice : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1 -> {
                System.out.print("Enter new name: ");
                String newName = sc.nextLine();
                // You’ll need to add a setter in Patient class
                p.setName(newName);
                System.out.println("✅ Name updated!");
            }
            case 2 -> {
                System.out.print("Enter new age: ");
                int newAge = sc.nextInt();
                p.setAge(newAge);
                System.out.println("✅ Age updated!");
            }
            case 3 -> {
                System.out.print("Enter new blood group: ");
                String newBG = sc.nextLine();
                p.setBloodGroup(newBG);
                System.out.println("✅ Blood Group updated!");
            }
            case 4 -> {
                System.out.print("Enter new allergies: ");
                String newAll = sc.nextLine();
                p.setAllergies(newAll);
                System.out.println("✅ Allergies updated!");
            }
            case 5 -> System.out.println("❌ Update cancelled.");
            default -> System.out.println("⚠️ Invalid choice.");
        }
    } else {
        System.out.println("❌ Patient not found!");
    }

    }

    public void deletePatient(int id ){
        Patient p =  searchPatient(id);
        if(p!=null){
            patient.remove(p);
        }else{
            System.out.println(" No Patient found ");
        }
    }

    public void saveFile(){
        try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("Patient.dat"))){
            oos.writeObject(patient);
            System.out.println("Data Loded Successfully");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Some error!!! occur while saving ......");
        }
    }

    public void loadFile(){
        try(ObjectInputStream oic = new ObjectInputStream(new FileInputStream("Patient.dat"))){
            patient = (List<Patient>) oic.readObject();
            System.out.println("Load Successfully ");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Failed to load the data ");
        }
    }

}
