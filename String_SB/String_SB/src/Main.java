public class Main {
    public static void main(String[] args) {
        int a = 10;

        int[] arr = {3,5,5,5,};

        String str1 = "Yusuf Pathan";

        String str2 = "Yusuf Pathan";

        str2 = "Khan Sahab";

       // System.out.println(str1);
      //  System.out.println(str2);


        String name1 = new String("Kunal");
        String name2 = new String("Kunal");

        System.out.println(name1 == name2); // false
        System.out.println(name1.equals(name2)); // true

    }
}
