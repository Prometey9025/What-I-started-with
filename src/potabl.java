import java.util.Scanner;

public class potabl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сообщение: ");
        String slovo = in.nextLine();
        System.out.print("Количество неиспользуемых клеток в таблице: ");
        int t = in.nextInt();

        for(int i=0;i < t;i++){
            slovo = (new StringBuilder(slovo)).insert((int) (Math.random()*slovo.length()), "#").toString();
        }

        char[] text = slovo.toCharArray();

        int[] key1 = new int[2];
        System.out.print("Кодовое слово1: ");
        for(int i=0;i < key1.length;i++){
            key1[i]=in.nextInt();
        }

        int[] key2 = new int[key1[1]];
        System.out.print("Кодовое слово2: ");
        for(int i=0;i < key2.length;i++){
            key2[i]=in.nextInt();
        }
        double y=(double)slovo.length()/(double)(key1[0]*key1[1]);
        int p=(int)Math. ceil(y);
        int[] index1= new int[t];
        int[] index2= new int[t];
        int[] index6= new int[t];
        int[] index3= new int[(key1[0]*key1[1]*p)- text.length];
        int[] index4= new int[(key1[0]*key1[1]*p)- text.length];
        int[] index5= new int[(key1[0]*key1[1]*p)- text.length];


        char[][][] start = new char[key1[0]][key1[1]][p];
        for(int a=0,k=0;a<p;a++){
            for(int i=0; i<key1[0];i++) {
                for (int j = 0; j < key1[1]; j++,k++) {
                    for(int m =0;m<y;m++) {
                        if (k >= text.length ) {
                            start[i][j][a] = '$';
                        }
                        else{
                            start[i][j][a] = text[k];
                        }

                    }

                }
            }
        }

       for(int a=0,l=0,c=0;a<p;a++){
           for(int i=0;i<key1[0];i++){
               for(int j = 0;j<key1[1];j++){
                   if(start[i][j][a]=='#'){
                       index1[l]=i;
                       index2[l]=j;
                       index6[l]=a;
                       l++;
                   }
                   if(start[i][j][a]=='$'){
                       index3[c]=i;
                       index4[c]=j;
                       index5[c]=a;
                       c++;
                   }
               }
           }
       }

        System.out.print("Кодовое слово3: ");
        for(int i=0;i<t;i++){
            System.out.print(index1[i]);
            System.out.print(index2[i]);
            System.out.print(index6[i]);
        }
        System.out.println();

        char[][][] tabl = new char[key1[0]][key1[1]][p];
        for(int a=0,k=0;a<p;a++){
            for(int i=0;i<key1[0];i++) {
                for (int j = 0; j < key1[1]; j++,k++) {
                    for(int m =0;m<t;m++) {
                        if (k >= text.length ) {
                            tabl[i][j][a] = '$';
                        }
                        else{
                            tabl[i][j][a] = text[k];
                        }

                    }

                }
            }
        }


        for(int a=0;a<p;a++){
            for (int i = 0; i < key1[0]; i++) {
                for (int j = 0; j < key1[1]; j++) {
                    System.out.print(" "+tabl[i][j][a]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }


        String encrypted ="";
        for(int a=0;a<p;a++){
            for(int i=0; i< key2.length;i++) {
                for(int j =0;j< key2.length;j++){
                    if (key2[j]==i) {
                        for(int k=0;k< tabl.length;k++){
                            if(tabl[k][j][a]=='#'||tabl[k][j][a]=='$'){
                                encrypted+="";
                            }
                            else{
                                encrypted+=tabl[k][j][a];
                            }

                        }
                    }
                }

            }
        }

        System.out.println(encrypted);

        for(int l=0;l<index2.length;l++){
            for(int n=0;n<key2.length;n++){
                if(n==index2[l]){
                    index2[l]=key2[n];
                    break;
                }
            }
        }
        for(int c=0;c<index4.length;c++){
            for(int n=0;n<key2.length;n++){
                if(n==index4[c]){
                    index4[c]=key2[n];
                    break;
                }
            }
        }

        char[] text1 = encrypted.toCharArray();
        char[][][] tabl1 = new char[key1[0]][key1[1]][p];
        int z = 0;
        int b = 0;
        for(int a=0,k=0;a<p;a++){
            for(int j=0;j<key1[1];j++){
                for(int i=0;i<key1[0];i++){
                    for(int l=0;l<t;l++){
                        if(i==index1[l]&&j==index2[l]&&a==index6[l]){
                            tabl1[i][j][a]='#';
                            z++;

                        }

                    }
                    for(int c=0;c<(key1[0]*key1[1]*p)- text.length;c++){
                        if(i==index3[c]&&j==index4[c]&&a==index5[c]){
                            tabl1[i][j][a]='$';
                            b++;

                        }

                    }

                    if(z==0&&b==0){
                        tabl1[i][j][a]=text1[k];
                        k++;
                    }
                    if(z==1){
                        z--;
                    }
                    if(b==1){
                        b--;
                    }

                }
            }
        }


        for(int a=0;a<p;a++){
            for (int i = 0; i < key1[0]; i++) {
                for (int j = 0; j < key1[1]; j++) {
                    System.out.print(" " + tabl1[i][j][a] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


        String decrypted ="";
        for(int a= 0;a<p;a++){
            for(int i=0; i< key1[0] ;i++) {
                for(int k =0;k< key2.length;k++){
                    for(int j=0;j< key1[1];j++){
                        if (key2[k]==j) {
                            if(tabl1[i][j][a]=='#'||tabl1[i][j][a]=='$'){
                                decrypted+="";
                            }
                            else{
                                decrypted+=tabl1[i][j][a];
                            }
                        }

                    }
                }

            }
        }

        System.out.println(decrypted);
    }
}
