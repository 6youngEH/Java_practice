package chap_01;

import java.util.Locale;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);
        //문자열의 길이
        System.out.println(s.length());//29
        //대소문자 변환
        System.out.println(s.toUpperCase());
        //소문자 변환
        System.out.println(s.toLowerCase());
        //포함관계
        System.out.println(s.contains("Java"));//포함된다면 true , 포함되지 않는다면 false
        System.out.println(s.contains("C#"));//false
        System.out.println(s.indexOf("Java"));//위치 정보 확인

    }
}
