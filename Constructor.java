class Constructor {
    static int count = 0;
    {
        count++;
    }

    Constructor() {
    }

    Constructor(int i) {
    }

    Constructor(double d) {
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(10);
        Constructor c3 = new Constructor(10.5);
        System.out.println("Object created" + count);
    }

}