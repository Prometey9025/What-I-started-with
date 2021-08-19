import java.util.Scanner;

public class gammashifr {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String encrypted = "";
        String decrypted = "";
        String slovo="";
        while(!slovo.equals("Стоп")){
            System.out.print("Введите сообщение: ");
            String text = in.nextLine();
            System.out.print("Введите гамму: ");
            String gamma = in.nextLine();
            for(int i=0,j=0;i< text.length();i++,j++){
                if(j == gamma.length()){
                    j = 0;
                }
                encrypted += (char) (text.charAt(i)^gamma.charAt(j));

            }
            System.out.print("Зашифрованное сообщение: ");
            System.out.println(encrypted);

            for(int k=0,l=0;k<encrypted.length();k++,l++){
                if(l == gamma.length()){
                    l = 0;
                }
                decrypted += (char) (encrypted.charAt(k)^gamma.charAt(l));

            }
            System.out.print("Расшифрованное сообщение: ");
            System.out.println(decrypted);
            encrypted = "";
            decrypted = "";
            slovo= in.nextLine();
        }

    }
}
