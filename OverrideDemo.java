class A {
    int i;
    int j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    @Override
    void show() {
        System.out.println("k: " + k);
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        B subOb = new B(10, 20, 30);
        subOb.show();
    }
}
