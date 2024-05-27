package Labs.Lab1;
import java.util.*;
public class Compute_Area_of_Circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the value of the radius here: ");
        double radius = s.nextInt();

        double area = ((radius*radius)*Math.PI);

        System.out.print("The circle's area is "+area);
    }
}
