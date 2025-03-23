package dailyExample.DataStructure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int userChoice;

        while (true) {
            System.out.println("1. 비지니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.println("메뉴를 선택해주세요: ");

            if (scanner.hasNextInt()) {
                userChoice = scanner.nextInt();
                scanner.nextLine();

                switch (userChoice) {
                    case 1:
                        System.out.println("이름을 입력하세요: ");
                        String businessName = scanner.nextLine();

                        System.out.println("전화번호를 입력하세요: ");
                        String businessPhoneNumber = scanner.nextLine();

                        System.out.println("회사명을 입력하세요: ");
                        String businessCompany = scanner.nextLine();

                        addressBook.addContact(new BusinessContact(businessName, businessPhoneNumber, businessCompany));
                        System.out.println("비지니스 연락처에 추가되었습니다.");

                        break;
                    case 2:
                        System.out.println("이름을 입력하세요: ");
                        String personName = scanner.nextLine();

                        System.out.println("전화번호를 입력하세요: ");
                        String personPhoneNumber = scanner.nextLine();

                        System.out.println("관계를 입력하세요: ");
                        String relationship = scanner.nextLine();

                        addressBook.addContact(new PersonalContact(personName, personPhoneNumber, relationship));
                        System.out.println("개인 연락처에 추가되었습니다.");
                        break;
                    case 3:
                        addressBook.displayContacts();
                        break;
                    case 4:
                        System.out.println("검색할 이름을 입력하세요: ");
                        String searchName = scanner.nextLine();
                        addressBook.searchContact(searchName);
                        break;
                    case 5:
                        System.out.println("기능을 종료합니다.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("올바른 번호를 입력하시오.");
                }
            } else {
                System.out.println("숫자를 입력해주새요.");
                scanner.next();
            }
        }
    }
}
