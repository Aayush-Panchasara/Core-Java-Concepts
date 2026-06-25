package oops;
/*Program to demonstrate Hierarchical Inheritance */

class Cricket {

    public void playCricket() {
        System.out.println("Playing Cricket...");
    }
}

class TestCricket extends Cricket {

    @Override
    public void playCricket() {
        System.out.println("Playing Test Cricket...");
    }
}

class ODICricket extends Cricket {

    @Override
    public void playCricket() {
        System.out.println("Playing ODI Cricket...");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {
        TestCricket testCricket = new TestCricket();
        testCricket.playCricket();

        ODICricket odiCricket = new ODICricket();
        odiCricket.playCricket();
    }

}
