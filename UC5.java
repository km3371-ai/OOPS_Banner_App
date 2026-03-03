public class UC5 {

    public static void main(String[] args) {

        // Inline array initialization using String.join()
        String[] lines = {
            String.join(" ", "*****", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*   *", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*    ", "    *"),
            String.join(" ", "*****", "*****", "*    ", "*****")
        };

        // Print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}