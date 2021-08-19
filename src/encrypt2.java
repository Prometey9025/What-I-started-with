import java.util.Scanner;

public class encrypt2 {
    public static void  vigenere_encrypt(int bias, int letters) {
        Scanner input = new Scanner(System.in);
        System.out.print("Кодовое слово:");
        String key = input.nextLine();
        System.out.print("Предложение:");
        String plaintext = input.nextLine();
        String encryptedText = "";
        for (int i = 0, j = 0; i < plaintext.length(); i++, j++) {
            if (j == key.length()) { j = 0; }
            encryptedText += (char) ((plaintext.charAt(i)+key.charAt(j)-2*bias)%letters+bias);//алфавит начинается с пробела , а у него код 32 в аски таблице
        }
        System.out.print(encryptedText);
    }

    public static void  vigenere_decrypt(int bias, int letters) {
        Scanner input = new Scanner(System.in);
        System.out.print("Кодовое слово:");
        String key = input.nextLine();
        System.out.print("Предложение:");
        String plaintext = input.nextLine();
        String decryptedText = "";
        for (int i = 0, j = 0; i < plaintext.length(); i++, j++) {
            if (j == key.length()) { j = 0; }
            decryptedText += (char) ((plaintext.charAt(i)-key.charAt(j)+letters)%letters+bias);
        }
        System.out.print(decryptedText);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Что сделать?");
        String k = input.next();
          if(k.equals("Зашифровать")){
        vigenere_encrypt(32,1071);}
          if(k.equals("Расшифровать")){
              vigenere_decrypt(32,1071);
          }
    }
}
