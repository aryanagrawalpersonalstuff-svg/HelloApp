

public class HelloApp {

    public static void main(String[] args) {
        String name = "World";

        if (args.length > 0) {
            // Code Snippet for HelloApp UC4:
            StringBuilder nameBuilder = new StringBuilder();
            
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                
                // Add a comma and space only if it's not the last name in the list
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString(); // Use the provided names
        }

        System.out.println("Hello, " + name + "!");
    }
}
