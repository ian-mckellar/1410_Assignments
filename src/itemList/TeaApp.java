package itemList;
/**
 * @author Ian and Garret Wasden
 */

import java.util.ArrayList;
import java.util.Scanner;

public class TeaApp {
    private static ArrayList<Tea> teaArrayList = new ArrayList<>();
    private static int nextTeaIdNumber;

    /**
     * Used to create object with a teaIdNumber and a teaArrayList
     *
     * @param teaArrayList
     */
    public TeaApp(ArrayList<Tea> teaArrayList) {
        TeaApp.teaArrayList = teaArrayList;
    }

    /**
     * Generates a number for each tea in increments of one
     * @return
     */
    public static int getNextTeaIdNumber() {
        int newId = nextTeaIdNumber;
        nextTeaIdNumber++;
        return newId;
    }

    /**
     * Allows user to view entries and gives an ID number to every entry The ID
     * changes as items are added or removed.
     */
    private static void viewTeaInformationEntered() {
        System.out.println("============================================================================");
        for (int i = 0; i <= teaArrayList.size() - 1; i++) {
            System.out.printf("%nTea information: %s", teaArrayList.get(i).toString());
        }
        System.out.println("============================================================================");
    }

    /**
     * A method that collects information from the user about the tea they are
     * entering in
     *
     * @param input
     */
    private static void addANewTea(Scanner input) {
        System.out.println("============================================================================");
        System.out.print("Enter in a brand of tea:  ");
        String brand = input.next();

        System.out.print("Enter in a type of tea:  ");
        String typeOfTea = input.next();

        System.out.print("Enter in a steep time in minutes: ");
        int steepTime = input.nextInt();

        System.out.print("Enter in a steep temperature in fahrenheit:  ");
        int steepTemperature = input.nextInt();

        Tea teaToEnter = new Tea(brand, typeOfTea, steepTime, steepTemperature, getNextTeaIdNumber());
        teaArrayList.add(teaToEnter);
        System.out.println("============================================================================");
    }

    /**
     * will scan the array and see if it have the number of array asked for.
     * @param teaIdToFind
     */
    private static int finder(int teaIdToFind) {
        int numberAskedFor = teaIdToFind;
        for (int i = 0; i < teaArrayList.size(); i++) {
            Tea temp = teaArrayList.get(i);
            if (temp.getTeaId() == numberAskedFor) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds the users input in the array list to and prints out user information.
     * @param input
     */
    private static void findItem(Scanner input) {
        System.out.print("Please enter the number you are wanting to find: ");
        int number = input.nextInt();
        int i = finder(number);

        if (i >= 0) {
            System.out.printf("Found%n%s", teaArrayList.get(i).toString());
        }
        if (i < 0) {
            System.out.printf("Sorry we did not find %d in our list%n", number);
        }
    }

    /**
     * Removes an entry corresponding to the ID number and what the user enters
     *
     * @param input
     */
    private static void removeTea(Scanner input) {
        System.out.println("============================================================================");
        System.out.println("Enter in the position of the tea ID would like to remove");
        System.out.println("============================================================================");

        int i = finder(input.nextInt());
        if (i >= 0) {
            System.out.printf("%nwas removed%n%n");
            teaArrayList.remove(i);
        }
        if (i < 0) {
            System.out.printf("Sorry we did not find %d in our list to remove, please check you have the right number.%n", i);
        }

    }

    /**
     * Take the current size of the array and prints a user message.
     */
    private static void numberInTheList() {
        int size = teaArrayList.size();
        System.out.println("The number of items in the list is " + size);
    }

    // =================================================================================================================
    // MAIN METHOD
    // =================================================================================================================
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entry;

        teaArrayList.add(new Tea("Teavana", "Green", 5, 170, getNextTeaIdNumber()));
        teaArrayList.add(new Tea("Teavana", "Black", 5, 190, getNextTeaIdNumber()));
        teaArrayList.add(new Tea("Teazaanta", "Herbal", 5, 160, getNextTeaIdNumber()));
        teaArrayList.add(new Tea("Teazaanta", "White", 5, 180, getNextTeaIdNumber()));

        do {
            System.out.println("============================================================================\n"
                    + "Enter The number of the menu Item you could like to do:\n" + "1) View current teas entered.\n"
                    + "2) Enter in a new tea.\n" + "3) Find an tea\n" + "4) delete a tea entered.\n"
                    + "5) Number of teas in list\n" + "6) exit the program.\n"
                    + "============================================================================");
            entry = input.nextInt();
            switch (entry) {
                case 1:
                    viewTeaInformationEntered();
                    break;
                case 2:
                    addANewTea(input);
                    break;
                case 3:
                    findItem(input);
                    break;
                case 4:
                    removeTea(input);
                    break;
                case 5:
                    numberInTheList();
                    break;
                case 6:
                    System.out.println("Good bye");
                    break;
                default:
                    System.out.println("Choice must be a value between 1 and 5.");
            }
        } while (entry != 6);

    }
}