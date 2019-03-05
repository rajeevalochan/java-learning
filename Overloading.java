class Overloading {
    public void m1() {
        System.out.println("Method with no args");
    }

    public int m1(int i) {
        System.out.println("Method with int args " + i);
        return i;
    }

    public void m1(double d) {
        System.out.println("Method with Double args " + d);
    }

    public void m1(String d) {
        System.out.println("Method with String args " + d);
    }

    public void m1(StringBuffer d) {
        System.out.println("Method with StringBuffer args " + d);
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.m1();
        o.m1(10);
        o.m1(10.5);
        /* o.m1(null);// C.E: method m1 is ambiguous for type-overloading */
        o.m1("Rajeevalochan");
        o.m1(new StringBuffer("rajeev"));
    }
}