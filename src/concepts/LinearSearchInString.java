package concepts;

public class LinearSearchInString {
    public static void main(String[] args) {
        System.out.println("Linear Search In String");
        String name = "shrutimeshram";
        char target = 'i';
        System.out.println(linearSearchInString(name, target));
        System.out.println(linearSearchInStringBoolean(name, target));
    }

    public static int linearSearchInString(String string,  char target){
        if(string.length() == 0) return -1;
        else {
            for(int i=0; i<string.length(); ++i){
                if(string.charAt(i) == target){
                    return i;
                }
            }
            return -1;
        }
    }

    public static boolean linearSearchInStringBoolean(String string, char target){
        if(string.length() == 0) return false;
        else {
            char[] charArray = string.toCharArray();
            for(char character : charArray){
                if(character == target) return true;
            }
            return false;
        }
    }
}
