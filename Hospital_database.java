import java.util.Scanner;

class Patient {
    Scanner sc = new Scanner(System.in);

    String name, history, medications, policy_name;
    int age, policy_number;
    char gender;

    class BasicDetails {
        String name;
        int age;
        char gender;
    }

    class MedicalHistory {
        String history;
        String medications;
    }

    class InsuranceProvider {
        String policy_name;
        int policy_number;
    }

    void readBasicDetails(Patient.BasicDetails b) {
        System.out.print("Enter name: ");
        name = b.name = sc.nextLine();
        System.out.print("Enter age: ");
        age = b.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter gender(M/F): ");
        gender = b.gender = sc.next().charAt(0);
    }
    
    void readMedicalHistory(Patient.MedicalHistory m) {
        System.out.print("Enter History: ");
        sc.nextLine(); 
        history = m.history = sc.nextLine();
        System.out.print("Enter Medication: ");
        medications = m.medications = sc.nextLine();
    }

    void readInsuranceProivder(Patient.InsuranceProvider i) {
        System.out.print("Enter Insurance Name: ");
        policy_name = i.policy_name = sc.nextLine();
        System.out.print("Enter Policy Number: ");
        policy_number = i.policy_number = sc.nextInt();
    }

    void admitPatient(Patient.BasicDetails b) {
        name = b.name;
        age = b.age;
        gender = b.gender;
    }

    void admitPatient(Patient.BasicDetails b, Patient.MedicalHistory m) {
        admitPatient(b);
        history = m.history;
        medications = m.medications;
    }

    void admitPatient(Patient.BasicDetails b, Patient.MedicalHistory m, Patient.InsuranceProvider i) {
        admitPatient(b, m);
        policy_name = i.policy_name;
        policy_number = i.policy_number;
    }

    void admitPatient(Patient.BasicDetails b, Patient.InsuranceProvider i) {
        admitPatient(b);
        policy_name = i.policy_name;
        policy_number = i.policy_number;
    }

    void displayPatients() {

    }
}

public class Hospital_database {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Hospital");
        System.out.println("Please Enter your Basic Details: ");
        Patient p1 = new Patient();
        Patient.BasicDetails b1 = p1.new BasicDetails();
        p1.readBasicDetails(b1);
        p1.admitPatient(b1);

        System.out.println("Do you have previous Medications? (y/n)");
        char choice_m = s.next().charAt(0);
        if (choice_m == 'y') {
            Patient.MedicalHistory m1 = p1.new MedicalHistory();
            p1.readMedicalHistory(m1);
            p1.admitPatient(b1, m1);

            System.out.println("Do you have an Insurance Policy? (y/n)");
            char choice_i = s.next().charAt(0);
            if (choice_i == 'y') {
                Patient.InsuranceProvider i1 = p1.new InsuranceProvider();
                p1.readInsuranceProivder(i1);
                p1.admitPatient(b1, m1, i1);
            }
        }

        s.close();
    }
}
