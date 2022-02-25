package FindDuplicateCharacter;
public class FindDuplicateChar {

    public static void main(String[] args) {
    	//Create a input String
        String string1 = "NOTHING IS IMPOSSIBLE";
        int count;

        // Converts given string into character array
        char string[] = string1.toCharArray();

        System.out.println("This are the Duplicate Characters in a given string: ");

        // Counts each character present in the string
        for (int i = 0; i < string.length; i++) {
            count = 1;
            
            for (int l = i + 1; l < string.length; l++) {
                if (string[i] == string[l] && string[i] != ' ') {
                    count++;
                    string[l] = '0';
                }
            }
            // A character is considered as duplicate if count is greater than 1
            if (count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
    }
}