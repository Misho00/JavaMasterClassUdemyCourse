import OOP.LPAStudent;
import OOP.Student;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Marry";
                        case 2 -> "John";
                        case 3 -> "Kim";
                        case 4 -> "Tom";
                        case 5 -> "Jim";
                        default -> "Anonymous";
                    },
                    "05-11-1995",
                    "Java Master Class");

            System.out.println(s);
        }
        System.out.println("-----------------");

        Student pojoStudent = new Student("S923006", "Ann", "05-11-1995", "Java Master Class");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05-11-1995", "Java Master Class");

        System.out.println(pojoStudent);
        System.out.println("---------------");
        System.out.println(recordStudent);
        System.out.println("---------------");

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
