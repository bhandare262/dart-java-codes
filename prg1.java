import java.util.Scanner;
public class shaniwarwadaInfo{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Shanivar Wada Museum Information System");
        System.out.println("Please select an option:");
        System.out.println("1. About Shanivar Wada");
        System.out.println("2. Explore Museum Exhibits");
        System.out.println("3. Explore Floors");
        System.out.println("4. Location");
        System.out.println("5. Visiting Information");
        System.out.println("6. Exit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                displayShanivarWadaInfo();
                break;
            case 2:
                exploreMuseum();
                break;
            case 3:
                exploreFloors();
                break;
            case 4:
                displayLocation();
                break;
            case 5:
                displayVisitingInformation();
                break;
            case 6:
                System.out.println("Thank you for using Shanivar Wada Museum Information System. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }

    public static void displayShanivarWadaInfo() {
        System.out.println("Shanivar Wada is a historical fortification located in Pune, India.");
        System.out.println("It was built in 1732 by the Peshwa Baji Rao I and served as the seat of the Peshwa rulers.");
        System.out.println("The fort was destroyed by fire in 1818 but remains a popular tourist attraction.");
        // Add more information as needed
    }

    public static void exploreMuseum() {
        System.out.println("Welcome to the Shanivar Wada Museum!");
        System.out.println("Here are some of the exhibits you can explore:");
        System.out.println("1. Weapons and Armor");
        System.out.println("2. Paintings and Manuscripts");
        System.out.println("3. Historical Artifacts");
        // Add more exhibit options as needed

        // Implement logic to explore different exhibits
    }

    public static void exploreFloors() {
        System.out.println("Shanivar Wada has several floors, each with its own significance.");
        System.out.println("1. Ground Floor: Known for its grand entrance and administrative offices.");
        System.out.println("2. Upper Floors: Contained living quarters, audience halls, and courtyards.");
        System.out.println("3. Basement: Not open to the public, believed to have contained secret passages and dungeons.");
        // Add more information about other floors as needed

        // Implement logic to explore different floors
    }

    public static void displayLocation() {
        System.out.println("Shanivar Wada is located in the heart of Pune city in the state of Maharashtra, India.");
        System.out.println("The address is: Shaniwar Peth, Pune, Maharashtra 411030.");
        // Add more information about how to reach the location, nearby landmarks, etc.
    }

    public static void displayVisitingInformation() {
        System.out.println("Shanivar Wada is open every day from 8:00 AM to 6:30 PM.");
        System.out.println("The entry ticket to the palace costs INR 5 per head for Indians and INR 125 for foreigners.");
        // Add more information about ticket booking, special tours, etc.
    }
}


