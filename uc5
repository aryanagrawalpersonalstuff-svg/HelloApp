public class UC5 {
    public static void main(String[] args) {
        // Default name
        String name = "World";
        
        // Check if names are provided as command-line arguments
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            boolean isFirst = true; // Flag to help us handle commas
            
            // Enhanced for loop (for-each)
            for (String arg : args) {
                // If it's not the first name, add a comma and space before appending
                if (!isFirst) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(arg);
                isFirst = false; // Turn off the flag after the first name
            }
            name = nameBuilder.toString(); // Use the provided names
        }
        
        System.out.println("Hello, " + name + "!");
    }
}
