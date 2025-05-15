//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Patterns {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        pattern13(5);

    }
    public static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n)
    {
        int sp = n-1,st = 1;

        for(int row = 1; row <= 5; row++) {

            for(int i = 1 ; i<=sp ;i++)
            {
                System.out.print("\t");
            }
            for(int i = 1 ; i<=st ;i++)
            {
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();
        }

    }

    public static void pattern4(int n)
    {
        int sp = 0,st = n;

        for(int row = 1; row <= 5; row++) {

            for(int i = 1 ; i<=sp ;i++)
            {
                System.out.print("\t");
            }
            for(int i = 1 ; i<=st ;i++)
            {
                System.out.print("*\t");
            }
            sp++;
            st--;
            System.out.println();
        }

    }

    public static void pattern5(int n)
    {
        int sp = n / 2,st = 1;
        for (int i = 1; i <= n; i++) {

            for(int j = 1 ; j<=sp ;j++)
            {
                System.out.print("\t");
            }
            for(int j = 1 ; j<=st ;j++)
            {
                System.out.print("*\t");
            }

            if(i<=n/2){
               sp--;
               st+=2;
            }
            else{
                sp++;
                st-=2;
            }
            System.out.println();
        }
    }


    public static void pattern6(int n){
        int st = n/2 + 1,sp = 1;
        for(int i = 1; i<=n ; i++){

            for(int j = 1 ; j<= st ; j++){
                System.out.print("*\t");
            }

            for(int j = 1 ; j<= sp ; j++){
                System.out.print("\t");
            }

            for(int j = 1 ; j<= st ; j++){

                System.out.print("*\t");
            }

            if(i <= n/2){
                st--;
                sp+=2;
            }
            else{
                st++;
                sp-=2;
            }
            System.out.println();
        }

    }


    public static void pattern7(int n)
    {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i == j){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i+j == n + 1 )
                {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void pattern9(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i+j == n + 1 || i == j)
                {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void pattern10(int n){

        int os = n / 2;
        int is = -1;

        for (int i = 1; i <= n; i++) {
            //System.out.print(os +  " ," + is);

            for (int j = 1; j <= os ; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");

            for (int j = 1; j <= is ; j++) {
                System.out.print("\t");
            }

            if(i > 1 && i < n){
                System.out.print("*\t");
            }

            if(i <= n / 2){
                os--;
                is+=2;
            }
            else{
                os++;
                is -= 2;
            }
            System.out.println();
        }
    }


    public static void pattern11(int n){
        int val = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(val+"\t");
                val++;
            }

            System.out.println();
        }

    }

    public static void pattern12(int n){
        int a = 0,b = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(a+"\t");
                int c = a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }


    public static void pattern13(int n){

        int sp = n/2;
        int st = 1;
        int val = 1;

        for (int i = 1; i <= n ; i++) {

            int cval = val;
            for (int j = 1; j <= sp ; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= st ; j++) {
                System.out.print(cval +"\t");

                if(j <= st / 2){
                    cval++;
                }
                else{
                    cval--;
                }
            }

            if(i <= n /2)
            {
                sp--;
                st+=2;
                val++;
            }
            else{
                sp++;
                st-=2;
                val--;
            }


            System.out.println();
        }
    }

}