package cipher;

import java.util.Scanner;

public class shifr {
    public static void encrypt(){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char[] alph = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z','А','Б','В','Г','Д','Е','Ё','Ж','З','И','К','Л','М','Н','О','П','Р','С','Т','У','Ф','Х','Ц','Ч','Ы','Ъ','Ь','Э','Ю','Я','а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ы', 'ъ', 'э', 'ю', 'я',' ','.',',','!','?','0','1','2','3','4','5','6','7','8','9'};
        char[] bukvy = s.toCharArray();
        for(int i=0;i<bukvy.length;i++){
            for(int k=0;k<=alph.length;k++){
                if(bukvy[i]==alph[k] && (k+1)==alph.length){
                    bukvy[i]=alph[0];
                    break;
                }
                if(bukvy[i]==alph[k] && (k+1)!=alph.length){
                    bukvy[i]=alph[k+1];
                    break;
                }
            }
        }
        System.out.print(bukvy);
    }
    public static void decrypt(){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char[] alph = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z','А','Б','В','Г','Д','Е','Ё','Ж','З','И','К','Л','М','Н','О','П','Р','С','Т','У','Ф','Х','Ц','Ч','Ы','Ъ','Ь','Э','Ю','Я','а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ы', 'ъ', 'э', 'ю', 'я',' ','.',',','!','?','0','1','2','3','4','5','6','7','8','9'};
        char[] bukvy = s.toCharArray();
        for(int i=0;i<bukvy.length;i++){
            for(int k=0;k<alph.length;k++){
                if(bukvy[i]==alph[k] && k==0 ){
                    bukvy[i]=alph[alph.length-1];
                    break;
                }
                if(bukvy[i]==alph[k] && k!=0){
                    bukvy[i]=alph[k-1];
                    break;
                }
            }
        }
        System.out.print(bukvy);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
       if(p==1){
           encrypt();
       }
        if (p == 0) {
            decrypt();
        }

    }
}
