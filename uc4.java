/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 * * This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate
 * character-to-pattern mappings. The application retrieves and displays the "OOPS"
 * banner using these mappings. This approach enhances code organization and modularity.
 * * @author Developer
 * @version 7.0
 */

class CharacterPatternMap {
    private String character;
    private String pattern;

    // Requirement 1 & 2: Constructor and methods to hold/retrieve patterns
    public CharacterPatternMap(String character, String pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public String getCharacter() {
        return character;
    }

    public String getPattern() {
        return pattern;
    }
}

public class OOPSBannerApp {
    public static void main(String[] args) {
        // Requirement 2: Creating character patterns (Example patterns for O, O, P, S)
        CharacterPatternMap charO = new CharacterPatternMap("O", " *** \n* *\n* *\n *** ");
        CharacterPatternMap charP = new CharacterPatternMap("P", "**** \n* *\n**** \n* ");
        CharacterPatternMap charS = new CharacterPatternMap("S", " ****\n* \n *** \n    *\n**** ");

        // Requirement 3: Use CharacterPatternMap to display the "OOPS" banner
        System.out.println("Displaying Banner:");
        System.out.println(charO.getPattern());
        System.out.println(charO.getPattern());
        System.out.println(charP.getPattern());
        System.out.println(charS.getPattern());
    }
}
