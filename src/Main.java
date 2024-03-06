public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        default -> "Anonymous";
                    },
                    "20/03/2003",
                    "Java Masterclass");
            System.out.println(s);
        }
        Student pojoStudent = new Student("S923006", "Ann",
                "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
                "05/11/1985", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is talking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is talking " + recordStudent.classList());

    }
}