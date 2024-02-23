/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author User
 */
import java.util.Arrays;
import java.util.Scanner;

public class VacationList {
    private static Vacation[] vacations = new Vacation[5];
    private static int size = 0;


    public static void main(String[] args) {
        VacationList vacationList = new VacationList();
        Scanner scanner = new Scanner(System.in);

        OUTER:
        while (true) {
            System.out.println("1. Add vacation");
            System.out.println("2. Update vacation");
            System.out.println("3. Delete vacation");
            System.out.println("4. Search vacation");
            System.out.println("5. Display vacations");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    System.out.println("Enter the location that you want to search for: ");
                    String location = scanner.nextLine();
                    search(location);
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    break OUTER;
                default:
                    break;
            }
        }
    }

    
    // Adds a new vacation to the list
    public static void add() {
        Scanner scanner = new Scanner(System.in);
        // Check if the array is full and resize if necessary
        if (isFull())
                    System.out.println("Vacation List is full!");
                else {
            System.out.print("Enter location: ");
                String location = scanner.nextLine();
                System.out.print("Enter activities : ");
                String activities = scanner.nextLine();
                System.out.print("Enter facilities : ");
                String facilities = scanner.nextLine();
                System.out.print("Enter scenery: ");
                String scenery = scanner.nextLine();
                System.out.print("Enter environment: ");
                String environment = scanner.nextLine();
                System.out.print("Enter duration: ");
                int duration = scanner.nextInt();
                System.out.print("Enter budget: RM");
                int budget = scanner.nextInt();
                scanner.nextLine();
                vacations[size] = new Vacation(location, activities, facilities, scenery, environment, duration, budget);
                size++;
                display();
                

                
    }
    }

    // Updates an existing vacation in the list
    public static void update() {
                if (isEmpty())
                    System.out.println("Vacation List is empty!");
                else {
        
                display();
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter which of the above vacation to update: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter location: ");
                String location = scanner.nextLine();
                System.out.print("Enter activities : ");
                String activities = scanner.nextLine(); 
                System.out.print("Enter facilities : ");
                String facilities = scanner.nextLine();
                System.out.print("Enter scenery: ");
                String scenery = scanner.nextLine();
                System.out.print("Enter environment: ");
                String environment = scanner.nextLine();
                System.out.print("Enter duration: ");
                int duration = scanner.nextInt();
                System.out.print("Enter budget: RM");
                int budget = scanner.nextInt();
                scanner.nextLine();

                vacations[index-1] = new Vacation(location, activities, facilities, scenery, environment, duration, budget);
                System.out.println("Vacation number " + index + " is updated.");
                display();

    }
    }

    // Deletes a vacation from the list
    public static void delete() {
        Scanner scanner = new Scanner(System.in);

                
                if (isEmpty())
                    System.out.println("Vacation List is empty!");
                
                
                else {
                display();
                System.out.print("Enter which vacation to delete: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                index = index -1;
                if (index < 0 || index > size-1) {
                System.out.println("Error: Invalid index.");
                }
                else{
                for (int x = index; x<size-1 ; x++){
                    vacations[x] = vacations[x+1];
                }
                size--;
                display();
                }
                }
    }

    // Searches the list for a vacation with a specific location
    public static void search(String location) {
                if (isEmpty())
                    System.out.println("Vacation List is empty!\n");


                else {
        
                    boolean found = false;
                    for (int i = 0; i < size; i++) {
                    if (vacations[i].getLocation().equalsIgnoreCase(location)) {
                    found = true;
                    System.out.println("Location found!");
                    System.out.println("| Location | Activities | Facilities | Scenery   | Environment    | Duration | Budget(RM)|");
                    System.out.println("|----------|------------|------------|-----------|----------------|----------|-----------|");
                    Vacation vacation = vacations[i];
                    System.out.printf("| %-8s | %-10s | %-10s | %-10s | %-14s | %-8d | %-9d |%n",
                    vacation.getLocation(),
                    vacation.getActivities(),
                    vacation.getFacilities(),
                    vacation.getScenery(),
                    vacation.getEnvironment(),
                    vacation.getDuration(),
                    vacation.getBudget());
                        System.out.println("");
            }
        }
                        
        if (!found) {
            System.out.println("No vacations found with location: " + location);
            System.out.println("");
        }
    }
    }

    // Displays all vacations in the list
    public static void display() {
        if (isEmpty())
                    System.out.println("Vacation List is empty!");
                else {
        
        // Print table header
        System.out.println("| Location | Activities | Facilities | Scenery   | Environment    | Duration | Budget(RM)|");
        System.out.println("|----------|------------|------------|-----------|----------------|----------|-----------|");

        // Print details of each vacation
        for (int i = 0; i < size; i++) {
            Vacation vacation = vacations[i];
            System.out.printf("| %-8s | %-10s | %-10s | %-9s | %-14s | %-8d | %-9d |%n",
                vacation.getLocation(),
                vacation.getActivities(),
                vacation.getFacilities(),
                vacation.getScenery(),
                vacation.getEnvironment(),
                vacation.getDuration(),
                vacation.getBudget());
        }
            System.out.println("");
    }
    }
    
    public static boolean isEmpty( ) {
    	if(size == 0)
        	return true;
       else
       	return false;
}
    
public static boolean isFull( ) 
{
   if(size == vacations.length)
        return true;
   else
        return false;
}
  
}
