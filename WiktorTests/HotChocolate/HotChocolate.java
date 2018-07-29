public class HotChocolate {

    public static final int tooCold = 160;
    public static final int tooHot = 190;

    public static void main(String[] args) {
        int currentCocoaTemp = 1200;
        try {
            System.out.println(drinkHotChocolate(currentCocoaTemp));
            System.out.println("Good cocolate!");
        } catch(TooColdException e) {
            System.out.println("That's too cold");
            e.printStackTrace();
        } catch(TooHotException e) {
            System.out.println("Too HOT!!!");
            System.out.println(e.getMessage());
        }
        System.out.println("That's it");
    }

    public static String drinkHotChocolate(int cocoaTemp) throws TooColdException, TooHotException {
        if (cocoaTemp <= tooCold) {
            throw new TooColdException();
        } else if (cocoaTemp >= tooHot) {
            throw new TooHotException();
        }
        return "The chocolate is gone;)";
    }

}
