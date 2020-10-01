package c02.等于加和加等于;

public class Main {
    public static void main(String[] args) {
        short s1 = 1;
        //s1 = s1 + 1 ;
        s1 = (short) (s1 + 1);
        short s2 = 1;
        s2 += 1;
        System.out.println(s1);
        System.out.println(s2);
    }

}
