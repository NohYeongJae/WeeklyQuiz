package dailyExample.DataStructure;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        if(contacts.isEmpty()){
            System.out.println("연락처가 비어있습니다.");
            return;
        }
        for(Contact contact : contacts){
            contact.displayInfo();
        }
    }

    public void searchContact(String name) {
        boolean found = false;

        for(Contact contact : contacts){
            if(contact.getName().equalsIgnoreCase(name)){
                contact.displayInfo();
                found = true;
            } else {
                System.out.println("연락처를 찾을 수 없습니다.");
            }
        }

    }
}
