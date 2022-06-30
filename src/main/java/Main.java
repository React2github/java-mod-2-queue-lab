import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Setting initial values 
        int table = 2; 
        Boolean isAvailable = true;
        Boolean isChecked = false;
        // Create a loop to check someone in or out of restaurant
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Do you want to check in? ");
            String status = obj.nextLine();
            if(status.equalsIgnoreCase("yes")){
                isChecked = true;
                System.out.println("Welcome to our restaurant! ");
                System.out.println("How many people will be joining us? ");
                int numOfGuests = obj.nextInt();
                System.out.println("Let's see if we have any availability tonight. ");
                if(table > 0 && numOfGuests < 3) {
                 System.out.println("We found you a spot. Follow me! ");
                 table = table - numOfGuests;
                 System.out.print("Number of available tables: " + table);
                 isChecked = false;
                } else {
                        System.out.println("Unfortuntely, all the tables are full ");
                        System.out.println("We will now add you to our waiting list ");
                        Queue<Integer> waitingList = new LinkedList<Integer>();
                            for (Integer counter = 0; counter < 2; counter++) {
                            waitingList.add(counter);
                            }
                            if(isAvailable == true) {
                            Thread.sleep(5000);
                            waitingList.remove();
                            }
                        if(waitingList.size() < 2) {
                            System.out.print("We now have an available table!");
                        }
                        }
            }
        }
        

        // If checkIn is true, check if table is available 
        // If it is available, check in if not put on waiting list 

        // If they want to check out, free one of the tables remove person from waiting list 


    }
}
