//Text Wrap Problem
//Write a program that takes an input string and prints it as multiple lines of text such that no line of text
// is greater than 13 characters and words are kept whole.

import java.util.*;

public class TextWrap {
    public static String[] wrapText(String text, int limit) {
        StringBuilder output = new StringBuilder(text.length());
        StringTokenizer token = new StringTokenizer(text, " ");
        int lineLength = 0;
        while (token.hasMoreTokens()) {
            String word = token.nextToken();
            if (lineLength + word.length() > limit) {
                //if the entire length of the line is more than given limit
                //go to the next line
                output.append("\n");
                lineLength = 0;
            }
            //add space after a word
            output.append(word + " ");
            lineLength += word.length() + 1;
        }
        return output.toString().split("\n");
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input text");
        String input=sc.nextLine();
        System.out.println("Enter character limit");
        int n = sc.nextInt();

        String result[]=wrapText(input, n);
        for(String str : result){
            System.out.println(str);
        }
    }
}