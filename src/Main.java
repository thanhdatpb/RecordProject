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
    }
}