package chap07.constructor;

public class Person {
    private String name;       //field
    private String ssn;

    public Person(String name, String ssn){
        this.name = name;      //생성장
        this.ssn = ssn;
    }

    public String getName(){
        return name;
    }

    public String getSsn(){
        return ssn;
    }

}
