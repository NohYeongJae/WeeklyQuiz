package dailyExample.DataStructure;

public class BusinessContact extends Contact {
    private String company;

    public BusinessContact(String name,String phoneNumber,String company) {
        super(name,phoneNumber);
        this.company=company;
    }
    public String getCompany(){
        return company;
    }

    public void displayInfo(){
        System.out.println("이름: " + name + ", 전화번호: " + phoneNumber + ", 회사명: " + company);
    }
}
