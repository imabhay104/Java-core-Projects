import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact >myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts= new ArrayList<>();
    }
    public boolean addNewContact(Contact contact)
    {
        return !(myContacts.contains(contact));
    }
    public boolean updateContact(Contact old, Contact new1)
    {
        if(addNewContact(old)){ myContacts.remove(old); myContacts.add(new1); return true;}
        else return false;
    }
}
