import java.util.Scanner;

public class AllCharacterFrequency {
    public static char[][] findCharacterFrequencies(String str) {
        int[] freq=new int[256];
        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            freq[ch]++;
        }

        char[][] result=new char[str.length()][2];
        int index=0;

        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if (freq[ch]!=0) {
                result[index][0]=ch;
                result[index][1]=(char)(freq[ch]+'0');
                freq[ch]=0;
                index++;
            }
        }
        char[][] finalResult=new char[index][2];
        for (int i=0;i<index;i++) {
            finalResult[i][0]=result[i][0];
            finalResult[i][1]=result[i][1];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=sc.nextLine();

        char[][] frequencies=findCharacterFrequencies(input);

        System.out.println("Character Frequencies:");
        for (int i=0;i<frequencies.length;i++) {
            System.out.println("Character: "+frequencies[i][0]+" Frequency: "+(frequencies[i][1]-'0'));
        }
    }
}