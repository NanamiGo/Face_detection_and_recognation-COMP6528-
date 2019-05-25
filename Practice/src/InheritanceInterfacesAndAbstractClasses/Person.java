package InheritanceInterfacesAndAbstractClasses;

public class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
    }

    public String show(){
        return firstName + " "+ lastName;
    }

    public String initials(){
        return firstName.substring(0,1).toUpperCase()+
                lastName.substring(0,1).toUpperCase();
    }
}
