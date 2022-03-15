import java.util.ArrayList;

public class MobilePhone {

    public ArrayList<Contacts> arrayListOfContacts = new ArrayList<Contacts>();
    String myNumber;



    public  void storeData(String name, int number){
        Contacts contact = new Contacts(name,number);
        arrayListOfContacts.add(contact);
    }

    private  int returnPosition(String name) {
        int position = 0;

        for (int i = 0; i < arrayListOfContacts.size(); i++) {
            String nameOfContact = arrayListOfContacts.get(i).getName();
            if (nameOfContact.equals(name)) {
                position = arrayListOfContacts.indexOf(i);

            } else position = -1;


        }return position;
    }

    public void removeName(String name){

               arrayListOfContacts.remove(returnPosition(name));

    };


    public  void updateContact(String nameToChange, String newName, int newNumber){
        Contacts newContact = new Contacts(newName, newNumber);

        if (returnPosition(nameToChange)==-1) {
            System.out.println("Upps... Missing this record in database");
        } else {
            arrayListOfContacts.set(returnPosition(nameToChange), newContact);

        }


    }


    public void printList(){
        for (int i=0; i<arrayListOfContacts.size(); i++){
            System.out.println("Name: " + arrayListOfContacts.get(i).getName() + " call using: " + arrayListOfContacts.get(i).getPhoneNumber() );




        }

    }


}
