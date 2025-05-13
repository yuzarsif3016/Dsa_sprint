//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        pattern5(5);

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

    public static void hello(){
        System.out.println("Say hello");
    }


}