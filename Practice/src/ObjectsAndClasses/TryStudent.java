package ObjectsAndClasses;

public class TryStudent {
    public static void main(String[] args) {
        Student stu = new Student("Jiacheng","Li","u6604906",80);
        Student stu2 = new Student("Zihang","Chu","u6604907",100);
        //can use different references pointing the same object
        System.out.println(stu.grade());
        System.out.println(stu2.firstName);
        stu.finalMark = 90;
        System.out.println(stu.finalMark);
        stu.School = "ANU";
        System.out.println(stu.School);
        Student.School = "U";
        System.out.println(Student.School);

        Student o1, o2;
        o1 = new Student("Nanami","Qiaki","u6604902",95);
        Student.School = "Kibogaminei";
        System.out.println(o1.School);
        o2 = new Student("Naiki","Magoduo","u6609890",80);
        System.out.println(o2.School);
    }
}
