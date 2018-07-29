import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String[] shapes = ",Circle,Square,Rectangle,Hexagon".split(",");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(i + " element: " + shapes[i]);
        }
    }

}
