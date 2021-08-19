import java.util.Scanner;

public class vign {
    public static void  vigenere_encrypt() {
        Scanner in = new Scanner(System.in);
        char[] alph = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ы', 'ъ', 'э', 'ю', 'я',
                'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ы', 'Ъ', 'Э', 'Ю', 'Я','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',' ', '.', ',', ':', ';', '!', '?'};
        System.out.println("Кодовое слово:");
        String slovo = in.nextLine();
        System.out.println("Предложение:");
        String slovo1 = in.nextLine();
        char[] text = slovo1.toCharArray();
        char[] key = slovo.toCharArray();
        String encrypted = "";
        for(int i = 0, j = 0; i < text.length; i++,j++){
            if(j == key.length){
                j = 0;
            }
            int alphn = 0, keyn = 0;
            for(int k = 0; k < alph.length; k++){
                if(text[i] == alph[k]){
                    alphn = k;
                }
                if(key[j] == alph[k]){
                    keyn = k;
                }
            }
            encrypted += alph[(alphn + keyn) % 135];
        }
        System.out.println(encrypted);
    }

    public static void  vigenere_decrypt() {
        Scanner in = new Scanner(System.in);
        char[] alph = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ы', 'ъ', 'э', 'ю', 'я',
                'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ы', 'Ъ', 'Э', 'Ю', 'Я','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '.', ',', ':', ';', '!', '?'};
        System.out.println("Кодовое слово:");
        String slovo = in.nextLine();
        System.out.println("Предложение:");
        String slovo1 = in.nextLine();
        char[] key = slovo.toCharArray();
        char[] text = slovo1.toCharArray();
        String decrypted = "";
        for(int i = 0, j = 0; i < text.length; i++,j++){
            if(j == key.length){
                j = 0;
            }
            int alphn = 0, keyn = 0;
            for(int k = 0; k < alph.length; k++){
                if(text[i] == alph[k]){
                    alphn = k;
                }
                if(key[j] == alph[k]){
                    keyn = k;
                }
            }
            if((alphn - keyn) < 0){
                decrypted += alph[(alphn - keyn) + 135];
            }else {
                decrypted += alph[alphn - keyn];
            }
        }
        System.out.println(decrypted);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Что сделать?");
        String k = input.next();
        if(k.equals("Зашифровать")){
            vigenere_encrypt();}
        if(k.equals("Расшифровать")){
            vigenere_decrypt();
        }
    }
}
