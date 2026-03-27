import java.util.*;
public class CountCharacters {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                String s=sc.nextLine();
                int vowel=0;
                int consonant=0;
                int digit=0;
                int special=0;
                s=s.toLowerCase();
                int n=s.length();
                for(int i=0;i<n;i++){
                        char ch=s.charAt(i);
                        if(Character.isLetter(ch)){
                                ch=Character.toLowerCase(ch);
                                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                                        vowel++;
                                }
                                else{
                                        consonant++;
                                }
                        }
                        else if(Character.isDigit(ch)){
                                digit++;
                        }
                        else{
                                special++;
                        }
                }
                System.out.println(vowel + " " + consonant + " " + digit + " " + special);
        }
        
}
