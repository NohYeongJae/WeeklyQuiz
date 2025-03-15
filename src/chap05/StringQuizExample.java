package chap05;

public class StringQuizExample {
    public static void main(String[] args) {
        String str = "aaaabbccd";
        StringBuilder ans = new StringBuilder();
        char currentChar = str.charAt(0);

        int equalCount = 0;
        int strLength = str.length();

        for (int i = 0; i < strLength; i++) {
           if (currentChar == str.charAt(i)) {
               equalCount++;
           } else {
               ans.append(currentChar);
               ans.append(equalCount);
               currentChar = str.charAt(i);
               equalCount = 1;
           }
        }
        ans.append(currentChar);
        ans.append(equalCount);
        System.out.println(ans);
    }
}
