import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        Set<Character> matchingCharacters = getMatchingCharactersIgnoreCase(str1, str2);
        System.out.println("Matching characters (case-insensitive): " + matchingCharacters);

        scanner.close();
    }

    public static Set<Character> getMatchingCharactersIgnoreCase(String str1, String str2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Set<Character> resultSet = new HashSet<>();

        for (char c : str1.toCharArray()) {
            set1.add(Character.toLowerCase(c));
        }

        for (char c : str2.toCharArray()) {
            set2.add(Character.toLowerCase(c));
        }

        // Find matching characters (case-insensitive)
        for (char c : str1.toCharArray()) {
            if (set2.contains(Character.toLowerCase(c))) {
                resultSet.add(c);
            }
        }

        for (char c : str2.toCharArray()) {
            if (set1.contains(Character.toLowerCase(c))) {
                resultSet.add(c);
            }
        }

        return resultSet;
    }
}
