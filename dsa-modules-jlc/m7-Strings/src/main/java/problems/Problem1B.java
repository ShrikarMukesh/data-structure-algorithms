package problems;

public class Problem1B {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);
        StringBuffer stringBuffer = new StringBuffer(str);

        stringBuffer.reverse();
        String revstr = stringBuffer.toString();
        System.out.println(revstr);
    }
}
