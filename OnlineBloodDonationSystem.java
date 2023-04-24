import java.util.*;

class User {
    String name;
    int age;
    String bloodGroup;
    String contactInfo;
    String location;

    public User(String name, int age, String bloodGroup, String contactInfo, String location) {
        this.name = name;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.contactInfo = contactInfo;
        this.location = location;
    }
}

class Donor extends User {
    public Donor(String name, int age, String bloodGroup, String contactInfo, String location) {
        super(name, age, bloodGroup, contactInfo, location);
    }

    public void donateBlood() {
        //code to donate blood
    }
}

class Recipient extends User {
    public Recipient(String name, int age, String bloodGroup, String contactInfo, String location) {
        super(name, age, bloodGroup, contactInfo, location);
    }

    public void requestBlood() {
        //code to request blood
    }
}

class BloodBank {
    Map<String, Integer> bloodStock = new HashMap<>();

    public void addBlood(String bloodGroup, int quantity) {
        if (bloodStock.containsKey(bloodGroup)) {
            bloodStock.put(bloodGroup, bloodStock.get(bloodGroup) + quantity);
        } else {
            bloodStock.put(bloodGroup, quantity);
        }
    }

    public void removeBlood(String bloodGroup, int quantity) {
        if (bloodStock.containsKey(bloodGroup)) {
            int currentStock = bloodStock.get(bloodGroup);
            if (currentStock - quantity >= 0) {
                bloodStock.put(bloodGroup, currentStock - quantity);
            } else {
                System.out.println("Not enough blood stock available!");
            }
        } else {
            System.out.println("Blood group not found!");
        }
    }

    public void viewStock() {
        System.out.println(bloodStock);
    }
}

class OnlineBloodDonationSystem {
    public static void main(String[] args) {
        BloodBank bank = new BloodBank();

        Donor donor = new Donor("John Doe", 25, "A+", "john.doe@example.com", "New York");
        bank.addBlood(donor.bloodGroup, 1);
        donor.donateBlood();

        Recipient recipient = new Recipient("Jane Smith", 30, "AB+", "jane.smith@example.com", "Los Angeles");
        recipient.requestBlood();

        bank.viewStock();
    }
}
