import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Foot foot = new Foot();

        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            foot.draw();
            FootShape ellipse = new Ellipse();
            ellipse.drawAsEllipse();
        } else if (choice == 2) {
            foot.draw();
            FootShape rectangle = new Rectangle();
            rectangle.drawAsRectangle();
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}