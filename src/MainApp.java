import java.sql.SQLOutput;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        WalletManager manager = new WalletManager();
        manager.loadFile();

        while(true){
            System.out.println("\t\n***** Welcome to Medical History Wallet ******\t\n");
            System.out.println("1.Add Patient\t2. View All Patient\t3. Remove Patient\t4. Search patient\t5. Update Patient" +
                    "\t6.Save And Exit ");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1->{
                    System.out.println("Enter ID :");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Your Good Full Name : ");
                    String name = sc.nextLine();
                    System.out.println("Enter age ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter your Allergies ");
                    String allergy = sc.nextLine();
                    System.out.println("Enter your BloodGroup ");
                    String bg = sc.nextLine();
                    Patient p = new Patient(id,name,age,allergy,bg);
                    manager.addPatient(p);

                }
                case 2->{
                    manager.viewPatients();
                }
                case 3->{
                    System.out.println(" Removing patient.... Enter Patient id ");
                    int id = sc.nextInt();
                    manager.deletePatient(id);
                    System.out.println("Deleted Sucessfully ");

                }
                case 4->{
                    System.out.println("Enter id to Search Patient ");
                    int id = sc.nextInt();
                    Patient p = manager.searchPatient(id);
                    if(p==null){
                        System.out.println("No patient found ");
                    }else{
                        System.out.println(p);
                    }
                }
                case 5->{
                    System.out.println("Updating Patient......\tEnter Patient ID ");
                    int id = sc.nextInt();
                    manager.updatePatient(id);
                }
                case 6->{
                    manager.saveFile();
                    System.out.println("Exiting .....");
                    return;
                }

                default -> {
                    System.out.println("INVALID CHOICE ");
                }


            }
        }
    }
}
