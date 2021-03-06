package bigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();


        //Write your code here
        Arrays.sort(s,(as,bs) -> {BigDecimal bd = new BigDecimal(bs);
            return bd.compareTo(new BigDecimal(as));});
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
