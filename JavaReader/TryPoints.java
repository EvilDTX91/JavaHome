package point3d;
import java.awt.*;
public class TryPoints {
    public static void main(String[] args) {
    Point object1 = new Point(11,22);
    Point3D object2 = new Point3D(7,6,64);
    Point4D object3 = new Point4D(8,26,19,33);
    
    System.out.println("The 2D point is located at (" + object1.x + ", " + object1.y + ")");
    System.out.println("\tIt's being moved to (4, 13)");
    object1.move(4,13);
    System.out.println("The 2D point is now at (" + object1.x + "," + object1.y + ")");
    System.out.println("\tIt's being moved -10 untis on both the x and y axes");
    object1.translate(-10,-10);
    System.out.println("The 2D point ends up at (" + object1.x + ", " + object1.y + ")\n");
    
    System.out.println("The 3D point is located at (" + object2.x + ", " + object2.y + ", "
    + object2.z + ")");
    System.out.println("\tIt's being moved to (10, 22, 71)");
    object2.move(10,22,71);
    System.out.println("The 3D point is now at (" + object2.x + ", " + object2.y + ", "
    + object2.z + ")");
    System.out.println("\tIt's being moved -20 units on the x,y and z axes");
    object2.translate(-20, -20, -20);
    System.out.println("The 3D point ends up at (" + object2.x + ", " + object2.y + ", "
    + object2.z + ")\n");
    
    System.out.println("The 4D point is located at (" + object3.x + ", " + object3.y + ", "
    + object3.z + ", " + object3.getTime() + ")");
    System.out.println("\tIt's being moved to (26, 50, 15, 30)");
    object3.move(26,50,15,30);
    System.out.println("The 4D point is now at (" + object3.x + ", " + object3.y + ", "
    + object3.z + ", " + object3.getTime() + ")");
    System.out.println("\tIt's being moved -15 units on the x,y,z and t axes");
    object3.translate(-15, -15, -15, -15);
    System.out.println("The 4D point ends up at (" + object3.x + ", " + object3.y + ", "
    + object3.z + ", " + object3.getTime() + ")");
    }
    
}
