final class FinalClass {
    final int value = 10;

    final void display() {
        System.out.println("Final Method Called");
    }
}

public class FinalDemo {
    public static void main(String[] args) {

        FinalClass obj = new FinalClass();

        System.out.println("Final Variable: " + obj.value);
        obj.display();
    }
}