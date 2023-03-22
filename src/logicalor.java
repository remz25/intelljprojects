import java.util.Scanner;
public class logicalor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("what number am i thinking off ");
        int number= reader.nextInt();

        int i = 8;
        if (number <6 || number > i){
            System.out.println("sorry that was wrong try again");
        }
        else{
            System.out.println("this was a good answer, your good at this");
        }
        }
}
