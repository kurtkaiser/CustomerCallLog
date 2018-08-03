/*
Kurt Kaiser
CTIM-178
7/23/2018
 */

import java.util.Scanner;

public class DemoServiceRequests {

    public static void main(String args[]) throws RequestException {
        String[] namesArray = new String[]{ };
        /*
               // Originally used an array, it state the names were recorded,
                 I was thinking that meant logged in some way and didn't
                 have to be manually entered.
                "Charles Babbage", "Claude Shannon", "Alan Turing",
                "Philip Don Estridge", "Tim Berners-Lee", "Robert Noyce",
                "Grace Hopper", "James Gosling", "Linus Torvalds",
                "Ada Lovelace"
        */
        int length = 0;
        String input = "";
        boolean go = true;
        ServiceRequests requests = new ServiceRequests();
        while (go){
            System.out.println("Enter letter a to add a name, r to remove a name, " +
                    "g to get a name, p to print all names or e to exit the program.");
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
            switch(input){
                case "a":
                    length = requests.getNumber();
                    if (length == 10) {
                        System.out.println("All ten names have been added. You can only remove or print names now.");
                    } else {
                        System.out.print("Name: ");
                        input = scan.nextLine();
                        requests.addName(input);
                    }
                    break;
                case "r":
                    length = requests.getNumber();
                    if (length == 0) {
                        System.out.println("List is empty, there are no names to remove.");
                    } else {
                        System.out.print("Name: ");
                        input = scan.nextLine();
                        requests.removeName(input);
                    }
                    break;
                case "p":
                    System.out.println("List: " + requests.toString());
                    break;
                case "g":
                    System.out.print("Number: ");
                    int intInput = scan.nextInt();
                    System.out.print("This is name number " + intInput + "(index: "
                            + (intInput- 1) + ") in the list: " +
                            requests.getName(intInput - 1) + "\n");
                break;
                case "e":
                    return;
            }
        }
    }
}
