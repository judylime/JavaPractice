package ClassAndObject;

public class Test {
    public static void main(String[] args) {
        if (f() || g()) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }

        if (g() && f()) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }

        if (g() & f()) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
    public static boolean f() {
        System.out.println("F");
        return true;
    }
    public static boolean g() {
        System.out.println("G");
        return false;
    }
}

/*
bitwise AND
bitwise OR

1 & 2 = 0001 & 0010 = 0000 = 0
1 | 2 = 0001 | 0010 = 0011 = 3
 */




