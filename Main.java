package BtContactList;

import BtContactList.Contact;
import BtContactList.ContactList;
import giftview.GiftShop;

import java.util.Scanner;

public class Main {
    final int SENTINEL = 0;
    int n;
    Scanner sc = new Scanner(System.in);
    ContactList contactList = new ContactList();
    public static void main(String[] args) {
        Main main = new Main();
        main.BtContactList();
    }

    public void menu() {
        System.out.println("1 - to shutdown");
        System.out.println("2 - to print contact");
        System.out.println("3 - to add to new contact");
        System.out.println("4 - to update exiting an exiting contact ");
        System.out.println("5 - to remove exiting an contact ");
        System.out.println("6 - query if an exiting an contact exiting");
        System.out.println("7 - to print a list of available actions." +
                "Choose your actions ");

    }


    public void insertPhone(){
        System.out.println("Insert into name: ");
        String name = sc.nextLine();
        System.out.println("Insert into  phone: ");
        String phone = sc.nextLine();
        phone = sc.nextLine();
        Contact contact = new Contact(name, phone);
        contactList.addContact(contact);
    }
    public void deletePhone(){
        System.out.println("Insert into id: ");
        String name = sc.nextLine();
        contactList.DeletePhone(name);
    }

    private void BtContactList() {
        Main main = new Main();
        main.menu();
        n = sc.nextInt();
        while (n != SENTINEL ){
            switch (n){
                case 0:
                    System.out.println(" for shutdown:");
                    break;
                case 2:
                    System.out.println("phonebook:");
                    contactList.selectContact();
                    break;
                case 3:
                    System.out.println("Enter existing contact name: ");
                    String name = sc.next();
                    Contact Contact = contactList.updateContact();
                    System.out.print("Enter new contact name: ");
                    String newName = sc.next();
                    System.out.print("Enter phone number: ");
                    String newPhone = sc.next();
                    Contact newContact = new Contact(newName,newPhone);
                    System.out.println(Contact+"," + " was replaced with " + newContact);
                    System.out.println("Successfully updated record");
                case 4:
                    System.out.println("INSERT name for delete:");
                    contactList.DeletePhone(name);
                    break;
                case 5: System.out.println("Enter existing contact name: ");
                    String name = sc.next();
                    Contact Contact = contactList.updateContact(name);
                    System.out.println( name  + "," + " was deleted");
                    System.out.println("Successfully deleted ");
                case 6:   System.out.println("Enter existing contact name: ");
                          String name = sc.next();
                           contactList.updateContact(name);
                case 7: contactList.menu();
            }
        }
    }


}
