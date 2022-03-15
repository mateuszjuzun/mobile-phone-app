import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;



        while(!quit){

            System.out.println("Please choose action to perform:");
            System.out.println("0. Quit");
            System.out.println("1. Print list of contact");
            System.out.println("2. Add new contact");
            System.out.println("3. Update existing contact");
            System.out.println("4. Remove contact");
            System.out.println("5. Find contact");


            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0: { quit = true; break;}

                case 1: { mobilePhone.printList();
                break;}
                case 2: {
                    System.out.println("Please put name:");
                    String name = scanner.nextLine();
                    System.out.println("Please put number:");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    mobilePhone.storeData(name, number);
                    break;}
                case 3: {
                    System.out.println("Please put name of contact to edit:");
                    String name = scanner.nextLine();
                    System.out.println("Please put new name of editing contact:");
                    String newName = scanner.nextLine();
                    System.out.println("Please put new number of editing contact:");
                    int newNumber = scanner.nextInt();
                    scanner.nextLine();
                    mobilePhone.updateContact(name,newName,newNumber);

                    System.out.println(" --->Succesfull modified");


                break;}
                case 4: { quit = true;
                break;}
                case 5: { quit = true;
                break;}





            }


        }



        mobilePhone.storeData("Mateusz", 123);
        mobilePhone.storeData("Agnieszka", 456);

        mobilePhone.printList();
    }

}
