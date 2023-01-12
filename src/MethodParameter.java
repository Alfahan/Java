public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Ali", "Farhan");
        sayHello("Eko", "Kurniawan");
        sayHello("Joko", "Nugroho");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
