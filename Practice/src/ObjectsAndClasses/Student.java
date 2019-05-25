package ObjectsAndClasses;

/**
 * class store a Student's name, UID, studentNumber and final mark
 * also generate a grade and a report according to student's final mark
 */
public class Student {
    //fields : data stored in each class
    static String School;
    String firstName;
    String lastName;
    String studentNumber;
    int finalMark;

    //constructor method : initialise the field for a particular object
    //can have a number of different constructor methods(?
    // )
    public Student(String firstName, String lastName, String studentNumber, int finalMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.finalMark = finalMark;
    }

    //methods
    public String grade(){
        if(finalMark < 50){
            return "N";
        }
        else if (finalMark < 60){
            return "P";
        }
        else if (finalMark < 70){
            return "C";
        }
        else if(finalMark < 80){
            return "D";
        }
        else {
            return "HD";
        }
    }

    public String report(){
        return "Name"+lastName +"n"+
                "UID :"+studentNumber+"n"
                +"Grade :"+grade() + "n"+
                "Final Mark :" +finalMark;
    }
}
