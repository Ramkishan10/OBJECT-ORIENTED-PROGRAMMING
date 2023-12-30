package basicjavaprograms118;
import java.util.*;
      class banks
        {
            public int amount;
            int getbalance()
            {
             return 0;
            }
      }
            class bankA extends banks
            {
             bankA(int a)
             {
              amount=a;
             }
             int getbalance()
            {
             return amount;
            }
             
            }
             class bankB extends banks
            {
             bankB(int b)
             {
              amount=b;
             }
             int getbalance()
            {
             return amount;
            }
             }
             class bankC extends banks
            {
             bankC(int c)
             {
              amount=c;
             }
             int getbalance()
             {
                 return amount;
             }
             }
            
public class bank{
    public static void main(String[] args)
    {
         int bankamount1,bankamount2,bankamount3;
         Scanner obj=new Scanner(System.in);
         System.out.println("Enter the BANK->A,BANK->B,BANK->C :");
         bankamount1=obj.nextInt();
         bankamount2=obj.nextInt();
         bankamount3=obj.nextInt();
         bankA A=new bankA(bankamount1);
         bankB B=new bankB(bankamount2);
         bankC C=new bankC(bankamount3);
         System.out.println("Bank A :"+A.getbalance());
         System.out.println("Bank B :"+B.getbalance());
         System.out.println("Bank C :"+C.getbalance());
         
         
         
    }
        
    }
      
    
           
           