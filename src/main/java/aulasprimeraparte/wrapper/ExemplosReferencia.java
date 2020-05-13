package aulasprimeraparte.wrapper;

public class ExemplosReferencia {

    public static void main(String[] args) {

        int a = 0;
        int b = a;
        a = 1;
        System.out.println(a);
        System.out.println(b);

        String c = "1";
        String d = c;

        c = "2";

        System.out.println(c);
        System.out.println(d);
    }
}
