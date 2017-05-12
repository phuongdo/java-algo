package vn.vcc.alg;

/**
 * Created by Minh Thu on 5/13/2017.
 */
public class StringAlg {
    public static void main(String[] args) {
        StringAlg alg = new StringAlg();
        alg.reverseString();
    }

    public void reverseString(){

        String input = "helloworld";
        char[] chars = input.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for(int i = chars.length -1; i > 0;i-- ){
            buffer.append(chars[i]);

        }
        System.out.println(buffer.toString());

    }
}
