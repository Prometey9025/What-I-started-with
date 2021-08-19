
import java.util.Arrays;
import java.util.Scanner;



public class sort {
    public static void puzyr(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива");
        int t=0;
       int n = in.nextInt();
       int[] cifry = new int[n];
       for ( int i=0;i< cifry.length;i++) {
           cifry[i] = in.nextInt();
       }
       for(int i=0;i<cifry.length-1;i++){
           for(int j=0;j< cifry.length-1;j++) {
               if (cifry[j] > cifry[j + 1]) {
                   t++;
                   int d = cifry[j];
                   cifry[j] = cifry[j + 1];
                   cifry[j + 1] = d;
               }
           }
       }
        System.out.print(Arrays.toString(cifry));
        System.out.print("\nКоличество перестановок:" + t);
    }

    public static void maximum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива");
        int s=0;
        int n = in.nextInt();
        int[] cifry = new int[n];
        for ( int i=0;i< cifry.length;i++) {
            cifry[i] = in.nextInt();
        }
        for(int i=0;i<cifry.length;i++){
            int p=i;
            int max=cifry[i];
            for(int j=i+1;j< cifry.length;j++) {
                if (cifry[j] > max) {
                    s++;
                    p=j;
                    max=cifry[j];
                }
            }
            cifry[p]=cifry[i];
            cifry[i]=max;
        }
        System.out.print(Arrays.toString(cifry));
        System.out.print("\nКоличество сравнений:" + s );
    }
    public static void vstavka(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива");
        int n = in.nextInt();
        int[] cifry = new int[n];
        for ( int i=0;i< cifry.length;i++) {
            cifry[i] = in.nextInt();
        }
        for(int i=0;i<cifry.length;i++){
            int v=cifry[i];
            int j=i-1;
            for(;j>=0;j--) {
                if (v < cifry[j]) {
                    cifry[j+1]= cifry[j];
                }
                else
                  {
                    break;
                  }
            }
            cifry[j+1]= v;
        }

        System.out.print(Arrays.toString(cifry));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите метод сортировки");
        String s = in.next();

        if(s.equals("Пузырьковый"))
            puzyr();
        if(s.equals("Максимальный"))
            maximum();
        if(s.equals("Вставка"))
            vstavka();

    }
}
