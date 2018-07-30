/*
Kurt Kaiser
CTIM-168
7/23/2018
 */

import java.util.Scanner;

public class DemoServiceRequests {



    public static void main(String args[]) throws RequestException {
        String[] namesArray = new String[]{
                "Charles Babbage", "Claude Shannon", "Alan Turing",
                "Philip Don Estridge", "Tim Berners-Lee", "Robert Noyce",
                "Grace Hopper", "James Gosling", "Linus Torvalds",
                "Ada Lovelace"
        };
        int length = 0;
        String input = "";
        boolean go = true;
        ServiceRequests requests = new ServiceRequests();
        while (go){
            System.out.println("Enter letter a to add a name, r to remove a name, " +
                    "p to print all names or e to exit the program.");
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
            switch(input){
                case "a":
                    length = requests.getNumber();
                    if (length == 10) {
                        System.out.println("All ten names have been added. You can only remove or print names now.");
                    } else {
                        requests.addName(namesArray[length]);
                    }
                    break;
                case "r":
                    requests.removeName(namesArray[requests.getNumber()-1]);
                    break;
                case "p":
                    System.out.println("List: " + requests.toString());
                    break;
                case "e":
                    requests.addName("kurt");
                    break;
            }

        }

    }

}
