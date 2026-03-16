import java.util.Scanner;

class InvalidMark extends Exception {
    public InvalidMark(String message) {
        super(message);
    }
}

class Student{
void grade(int[] marks) throws InvalidMark {
        int s = 0;
        for (int i : marks)
            if (i < 0 || i > 100)
                throw new InvalidMark("Invalid Marks");
            else
                s = s + i;
        System.out.println("Total: " + s);
        double per = s / 5.0;
        System.out.println("Per: " + per);
        if (per >= 90)
            System.out.println("A+");
        else if (per > 80 && per < 90)
            System.out.println("A");
        else if (per > 60 && per < 79)
            System.out.println("B");
        else if (per > 40 && per < 59)
            System.out.println("C");
        else
            System.out.println("Fail");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.println("Enter the marks: ");
        for (int i = 0; i < 5; i++)
            marks[i] = S.nextInt();
        System.out.println("The marks are: ");
        for (int i = 0; i < 5; i++)
            System.out.println(marks[i]);
        Student S1 = new Student();
        try {
            S1.grade(marks);
        } catch (InvalidMark e) {
            System.out.println(e.getMessage());
        } finally {
            S.close();
        }

    }
}
