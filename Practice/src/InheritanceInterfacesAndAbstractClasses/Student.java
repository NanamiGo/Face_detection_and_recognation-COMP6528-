package InheritanceInterfacesAndAbstractClasses;

/**
 * it's a child class
 * construct with super key word
 */
public class Student extends Person {
    String UID;

    public Student(String firstName, String lastName, String UID) {
        super(firstName, lastName);
        this.UID = UID;
    }

    public boolean checkUID(){
        return UID.length() == 8;
    }

    //if want to modified a method of the parent class
    //override it
    @Override
    public String show(){
        return firstName+" "+lastName+" "+UID;
        //or super.show() + " " + UID;
    }
}
