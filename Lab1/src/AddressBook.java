//TEST PUSH
import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        this.buddies.add(buddy);
    }

    public void buddyNum(){
        for (BuddyInfo buddy : this.buddies) {
            System.out.println(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if(index>=0 && index<buddies.size()){
            return buddies.remove(index);
        }
        return null;
     }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }


}

