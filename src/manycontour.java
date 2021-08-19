import java.util.Scanner;

public class manycontour {
    public static void main(String[] args) {
        char[] alph = {'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я','А','Б','В','Г','Д','Е','Ё','Ж','З','И','Й','К','Л','М','Н','О','П','Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ъ','Ы','Ь','Э','Ю','Я',' ',',','.','?','!'};
        char[] alph1 ={'ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я','а','б','в','г','д','е','ё','Ж','З','И','Й','К','Л','М','Н','О','П','Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ъ','Ы','Ь','Э','Ю','Я','А','Б','В','Г','Д','Е','Ё',')','(','-','=','^'};
        char[] alph2 ={'о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','ы','ь','э','ю','я','О','П','Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ъ','А','Б','В','Г','Д','Е',')','(','-','=','^','Ё','Ж','З','И','Й','К','Л','М','Н','Ы','Ь','Э','Ю','Я'};
        char[] alph3 ={'q','w','e','r','t','y','u','i','o','p','[',']','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m','<','>','@','%','Q','W','E','R','T','Y','U','I','O','P','{','}','A','S',')','(','-','=','^','D','F','G','H','J','K','L','Z','X','C','V','B','N','M','+','*','&','$'};
        Scanner in = new Scanner(System.in);
        System.out.print("Кодовое слово: ");
        String slovo = in.nextLine();
        System.out.print("Предложение: ");
        String slovo1 = in.nextLine();
        char[] text = slovo1.toCharArray();
        char[] key = slovo.toCharArray();
        int h;
        char[] encrypted = new char[text.length];
        char[] decrypted = new char[text.length];
        for(int i =0,j= 0;i < text.length;i++,j++){
            if(j== key.length){
                j=0;
            }
            for(int k=0;k< alph.length;k++){
                if (key[j]==alph[k]){
                    h=k;
                    for(int y=0;y<alph.length;y++) {
                        if (text[i] == alph[y]) {
                            if (h % 3 == 0) {
                                encrypted[i]=alph1[y];
                            }
                            if (h % 3 == 1) {
                                encrypted[i]=alph2[y];
                            }
                            if (h % 3 == 2) {
                                encrypted[i]=alph3[y];
                            }


                        }
                    }
                }


            }

        }
        System.out.print("Зашифрованное слово: ");
        System.out.println(encrypted);
        for(int i =0,j= 0;i < text.length;i++,j++){
            if(j== key.length){
                j=0;
            }
            for(int k=0;k< alph.length;k++) {
                if (key[j] == alph[k]) {
                        h = k;
                        if (h % 3 == 0) {
                            for(int l=0;l< alph1.length;l++){
                                if(encrypted[i]==alph1[l]){
                                    decrypted[i]=alph[l];
                                }
                            }
                        }
                        if (h % 3 == 1) {
                            for(int l=0;l< alph2.length;l++){
                                if(encrypted[i]==alph2[l]){
                                    decrypted[i]=alph[l];
                                }
                            }
                        }
                        if (h % 3 == 2) {
                            for(int l=0;l< alph3.length;l++){
                                if(encrypted[i]==alph3[l]){
                                    decrypted[i]=alph[l];
                                }
                            }
                        }





                }

            }
        }
        System.out.print("Расшифрованное слово: ");
        System.out.println(decrypted);
    }
}
