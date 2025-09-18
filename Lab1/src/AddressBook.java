import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void adBuddy(BuddyInfo buddy) {
        this.buddies.add(buddy);
    }

    public void removeBuddy(int index){
        this.buddies.remove(index);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

