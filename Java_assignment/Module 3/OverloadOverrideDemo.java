class OverloadExample {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class OverrideExample {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends OverrideExample {
    void show() {
        System.out.println("Child class method");
    }
}

public class OverloadOverrideDemo {
    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5, 10, 15));

        OverrideExample ref = new Child();
        ref.show();
    }
}