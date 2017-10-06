package edu.ashish.strings;

/**
 * Created by ashish.bhargava on 10/6/2017.
 */
public class MissingCharactersToMakePanagram {

    public static void main(String[] args) {
        String str = "A welcome to geeksforgeeks";
        int a = 'a';
        System.out.println(a);
//        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] letters = new char[52];
        for(char c: str.toCharArray()) {
            if(c > 97 && c < 123) {
                letters[c - 71] = c;
            } else if(c > 64 && c < 92) {
                letters[c-65] = c;
            }
        }
        for(int i=0; i<52; i++) {
            if(letters[i] == '\u0000') {
                if(i > 25) {
                    System.out.print((char) (i + 71));
                }
                if(i < 26) {
                    System.out.print((char)(i + 65));
                }
            }
        }
//        System.out.print((char)63);

    }
}
