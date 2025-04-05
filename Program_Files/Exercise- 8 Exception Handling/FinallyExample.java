public class FinallyExample {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length()); // Causes NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Null value detected!");
        } finally {
            System.out.println("This code runs no matter what.");
        }
    }
}
