package Excercise;

/**
 * Created by Snehal on 2/11/2017.
 *
 * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
 has sufficient space at the end to hold the additional characters, and that you are given the "true"
 length of the string. (Note: If implementing in Java, please use a character array so that you can
 perform this operation in place.)

 EXAMPLE
 Input: "Mr John Smith ", 13
 Output: "Mr%20John%20Smith"
 Hints: #53, # 118
 */
public class Ex3_URLify {

    public static void main(String[] args){
        String input = "Mr John Smith ";
        System.out.println(urlConvertor(input));

        String output = input.replaceAll(" " , "%20");
        System.out.println(output);

        System.out.println();
        replaceSpace(input.toCharArray(),input.length());
    }

    private static void replaceSpace(char[] str, int length) {
        int spaceCount = 0;
        for(int i = 0 ; i<str.length ; i++){
            if(str[i] == ' ') spaceCount++;
        }
        int newLength = length + spaceCount*3;

        char[] strNew = new char[newLength];

        for(int i = 0,j=0 ; j<str.length ; i++,j++){
            if(str[j] == ' ') {
                strNew[i] = '%';
                strNew[i+1] = '2';
                strNew[i+2] = '0';
                i = i+2;
            }else
                strNew[i]=str[j];
        }

        System.out.println(strNew);
    }

    private static String urlConvertor(String input) {
        char[] contents = input.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(char element : contents){
            if(element == ' '){
                sb.append("%20");
            }else
                sb.append(element);
        }

        return sb.toString();
    }

}
