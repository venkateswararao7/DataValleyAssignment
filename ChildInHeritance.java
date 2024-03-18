class Parent {
    // Method Overloading
    public void display() {
        System.out.println("Parent's display method");
    }

    public void display(String message) {
        System.out.println("Parent's display method with message: " + message);
    }
}

class Child extends Parent {
    // Method Overriding
    @Override
    public void display() {
        System.out.println("Child's display method");
    }
}

public class ChildInHeritance {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); // Calls Parent's display method

        Parent child = new Child();
        child.display(); // Calls Child's display method, overriding Parent's method

        parent.display("Hello"); // Calls Parent's overloaded method
    }
}
