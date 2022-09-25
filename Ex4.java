import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("please enter the word that you want to seprate:");
        String word=x.next();
        StringBuilder c=new StringBuilder(word);
        System.out.println(c.reverse());

    }
}
