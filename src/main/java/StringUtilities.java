
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {

        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {

        return (baseValue + valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String results = "";

        for (int i = valueToBeReversed.length() - 1; i >= 0; i--){
            results = results + valueToBeReversed.charAt(i);

        }
        return results;

    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */

//    I know im close, still a beginner and trying to figure it all out, had to comment out "getMiddlechar" to run other test
    public Character getMiddleCharacter(String word) {
////        int position;
////        int size;
////        if (word.length() % 2 == 0){
////            position = word.length() / 2 - 1;
////            size = 2;
////        }else {
////            position = word.length() / 2;
////            size = 1;
////        }
////        return word.substring(position, position + size);
        return null;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
//        String newStr = String.replace(charToRemove, " ");

        return null;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] word = sentence.split(" ");
        for(int i = 0; i <= word.length; i++){
            System.out.println(word[i].toString().length() - 1);
        }
//        sentence.split("");
//        for(int i = 0; i <= sentence; i++){
//
//        }
        return null ;

    }

}
