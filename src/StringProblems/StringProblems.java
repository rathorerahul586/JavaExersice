package StringProblems;

public class StringProblems {
    public static void main(String[] args) {
        StringProblems stringProblems = new StringProblems();
        String s= "Hello this is Rahul";
        stringProblems.foundMaxOccurenceCharInString(s);

        stringProblems.removeDuplicates(s.toCharArray());

        stringProblems.reverseString(s);

        stringProblems.reverseWords(s);
    }

    private void foundMaxOccurenceCharInString(String s){
        int maxCount = 0;
        char charIs = 0 ;
        int charCount;
        for (int i = 0; i < s.length(); i++){
            charIs = s.charAt(i);
            charCount = 0;
            for (int j = 0; j < s.length(); j++){
                if (charIs == s.charAt(j)){
                    charCount = charCount+1;
                }
            }
            if (charCount > maxCount){
                maxCount = charCount;
            }
        }
        System.out.println("Max Occurence char is: "+charIs+ " Count: "+maxCount);
    }

    private void removeDuplicates(char[] s1){
        System.out.println("With duplicates => "+String.valueOf(s1));
        for (int i = 0; i < s1.length ; i++){
            for (int j = 0; j < s1.length; j++){
                if ( i != j ){
                    if (s1[i] == s1[j]){
                        s1[j] = 0;
                    }
                }
            }
        }
        System.out.println("without Duplicates => "+String.valueOf(s1));
    }
    private void reverseString(String s1){
        StringBuilder s2 = new StringBuilder();
        for (int i = s1.length()-1; i >= 0 ; i--){
           s2.append(s1.charAt(i));
        }
        System.out.println("Reverse String => "+s2);
    }

    private void reverseWords(String s){
        StringBuilder s2 = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length() ; i++){

            if (s.charAt(i) == ' '){
                System.out.println("word: "+word);
                s2.insert(0," "+ word);
                word = new StringBuilder();

            }else if(i == s.length()-1){
                word.append(s.charAt(i));
                s2.insert(0, word);
            }
            else {
                System.out.println("i: "+i);
                word.append(s.charAt(i));
            }

        }
        System.out.println(s2);
    }
}
