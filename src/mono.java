import java.util.Scanner;

public class mono {
    public static void main(String[] args) {
        char[] alph ={'а','б','в','г','д','е','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я','.',',',' '};

        char[] alph1={'Ф','Н','(','Щ','И','Г','Е','R','A','Д','Ы','~','@','Z','Л','Я','Ж','^','C','Ш','М','Б','Q','П','Т','Х','Ю','Ъ','Р','}','№','?','_','>','#'};

        char[] alph2={'*','Н','У','Щ','D','+','Е','R','=','Д','Ц','Й','Ч','[','В','Ь',')','O','&','{','М','Б','Q','П','Т','Х','Ю','Ъ','Р','}','№','?','_',' ','<'};

        char[] alph3={'Л','Н','(','Щ','И',']','Е','R','%','Д','Ы','~','@','G','/','Я','Э','З','"','Ш','М','Б','Q','П','Т','Х','Ю','Ъ','Р','}','№','?','_',' ','W'};

        char[] alph4={'Ф','Н','У','Щ','D','К','Е','R','A','Д','Ц','Й','Ч','S','/','Ь','Ж','^','C','{','М','Б','Q','П','Т','Х','Ю','Ъ','Р','}','№','?','_',' ','V'};

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сообщение:");
        String slovo = in.nextLine();
        char[] text = slovo.toCharArray();
        char[] encrypted=new char[text.length];
        for(int i = 0;i<text.length;i++){
            for(int j=0;j<alph.length;j++){
                if (text[i]==alph[j]) {
                    char k=alph1[j];
                    text[i]=alph1[j];
                    alph1[j]=alph2[j];
                    alph2[j]=alph3[j];
                    alph3[j]=alph4[j];
                    alph4[j]=k;
                    break;

                }
            }
            encrypted[i]=text[i];
        }
        System.out.print("Зашифрованное сообщение:");
        System.out.println(encrypted);
        System.out.println(alph);
        System.out.println(alph1);
        System.out.println(alph2);
        System.out.println(alph3);
        System.out.println(alph4);
        char[] decrypted=new char[text.length];
        for(int i=0;i< text.length;i++){
            for(int j=0;j<alph1.length;j++){
                if (encrypted[i]==alph1[j]) {
                    decrypted[i]=alph[j];
                }
            }
            for(int j=0;j<alph2.length;j++){
                if (encrypted[i]==alph2[j]) {
                    decrypted[i]=alph[j];
                }
            }
            for(int j=0;j<alph3.length;j++){
                if (encrypted[i]==alph3[j]) {
                    decrypted[i]=alph[j];
                }
            }
            for(int j=0;j<alph4.length;j++){
                if (encrypted[i]==alph4[j]) {
                    decrypted[i]=alph[j];
                }
            }



        }
        System.out.print("Расшифрованное сообщение:");
        System.out.println(decrypted);

    }
}
