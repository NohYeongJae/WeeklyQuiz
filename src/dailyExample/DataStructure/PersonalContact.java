package dailyExample.DataStructure;

public class PersonalContact extends Contact {
    String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    public String getRelationship() {
        return relationship;
    }

    public void displayInfo(){
        System.out.println("이름: " + name + ", 전화번호: " + phoneNumber + ", 관계: " + relationship);
    }
}
