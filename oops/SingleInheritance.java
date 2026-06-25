package oops;
/*Program to demonstrate Single Inheritance */

class Phone {
    public void makeCall() {
        System.out.println("Calling ...");
    }
}

class SmartPhone extends Phone {
    public void makeVideoCall() {
        System.err.println("Video calling...");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.makeCall();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall();
        smartPhone.makeVideoCall();
    }

}
