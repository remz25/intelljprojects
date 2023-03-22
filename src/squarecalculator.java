import java.util.Scanner;
public class squarecalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter the width");
        double Width= reader.nextDouble();
        System.out.println("enter ther height");
        double height= reader.nextDouble();


        System.out.println("Rectangle Width =" + Width);
        System.out.println("Rectangle height= "+ height);

        double perimeter = 2 * (Width + height);
        System.out.println("rectangle perimeter=" + perimeter);
        double Area = 2 * (Width * height);
        System.out.println("rectangle * Area =" + Area);
    }
}
