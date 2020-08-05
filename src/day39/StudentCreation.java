package day39;

public class StudentCreation {

    public static void main(String[] args) {

        //how do we create an object out of template

        Student s1 = new Student();
        //set the values for s1 object attribute
        s1.age = 18;
        s1.name = "Karima";
        s1.gender = 'F';

        System.out.println("s1 name " + s1.name);

        Student s2 = new Student();
        //set the values for s1 object attribute
        s2.age = 33;
        s2.name = "Juma";
        s2.gender = 'M';
        System.out.println("s2 name " + s2.name);

        s2.age = 30;
        System.out.println(s2.name + " | " + s2.age + " | " + s2.gender);
    }
}
