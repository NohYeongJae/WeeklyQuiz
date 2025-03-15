package chap09;

import java.io.*;

public class FileNotFoundExceptionSample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("hi.txt"));
            System.out.println(reader.readLine());
            reader.close();
            throw new IOException("IOException");

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾지 못했습니다.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("파일 읽기에 실패했습니다.");
            System.out.println(e.getMessage());
        }
    }
}
