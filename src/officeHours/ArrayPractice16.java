package officeHours;

public class ArrayPractice16 {

    public static void main(String[] args) {

     String [] [] students = { {"1","John","35","USA"},
                               {"2","Kevin","40","Brazil"},
                               {"3","Scott","20","Canada"}};

        System.out.println("How many arrays inside students 2d array? "+students.length);
        System.out.println("How many value inside second array? " + students[1].length);

        for (String [] eachStudent : students) {

            for (String studentInfo : eachStudent) {

                System.out.print(studentInfo+" ");
            }
            System.out.println();
        }
        //find oldest student and print his name

//        String [] [] students = { {"1","John","35","USA"},
//                                  {"2","Kevin","40","Brazil"},
//                                  {"3","Scott","20","Canada"}};

        for (String eachRow [] :students) {

            System.out.println(eachRow[2]);
            int age = Integer.parseInt(eachRow[2]);


        }
    }
}
