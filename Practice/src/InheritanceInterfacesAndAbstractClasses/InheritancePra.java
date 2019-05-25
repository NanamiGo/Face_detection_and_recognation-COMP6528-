package InheritanceInterfacesAndAbstractClasses;

/**
 * if you want to implement a new class very similar to a class that is
 * already implemented
 * Inheritance: create a new class that refers to the original class
 * and only include code that extends/changes the original code.
 */
public class InheritancePra{
    public static void main(String[] args) {
        Student student = new Student("Jiacheng","Li","u6604906");
        System.out.println(student.initials());
        System.out.println(student.show());
    }

}
