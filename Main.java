package lostfoundsystem;

import java.sql.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        LostFoundDAO dao = new LostFoundDAO();

        while (true) {
            System.out.println("\n===== LOST ITEM REPORTING SYSTEM =====");
            System.out.println("1. Report Lost Item");
            System.out.println("2. Report Found Item");
            System.out.println("3. View Lost Items");
            System.out.println("4. View Found Items");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Item name: ");
                    String name = sc.nextLine();
                    System.out.print("Location: ");
                    String loc = sc.nextLine();
                    System.out.print("Date (YYYY-MM-DD): ");
                    Date date = Date.valueOf(sc.next());
                    dao.reportLostItem(name, loc, date);
                }
                case 2 -> {
                    System.out.print("Item name: ");
                    String name = sc.nextLine();
                    System.out.print("Location: ");
                    String loc = sc.nextLine();
                    System.out.print("Date (YYYY-MM-DD): ");
                    Date date = Date.valueOf(sc.next());
                    dao.reportFoundItem(name, loc, date);
                }
                case 3 -> dao.viewLostItems();
                case 4 -> dao.viewFoundItems();
                case 5 -> {
                    System.out.println("Thank you for using the system!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

	}


