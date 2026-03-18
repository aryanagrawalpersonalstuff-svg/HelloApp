/**
 * @author Developer Name
 * @version 4.0
 * @since UC1
 */

// Key Concepts for HelloAppUC4:
// 1. Default Values: Providing a fallback value when no input is given
// 2. Command-line Arguments: Accessing user input via args[] parameter
// 3. Conditional Statements: Using if to check conditions
// 4. Boolean Logic: Using logical conditions to control flow
// 5. Array Length: Checking the number of command-line arguments
// 6. StringBuilder: Efficiently building a string from multiple parts
// 7. Looping Constructs: Using for loops to iterate through command-line arguments
// 8. String Concatenation: Joining multiple strings with a delimiter (comma and space)

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
