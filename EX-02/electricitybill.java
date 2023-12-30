package simplejavaprogram;
import java.util.*;
class electricitybill1
{
    Scanner o=new Scanner(System.in);
    int consumer_no;
    String consumer_name;
    int premonthread;
    int curmonthread;
    String EB_connectiontype;
    int unit,bill;
    System.out.println("Enter your unit");
    unit=o.nextInt();
    void domesticbill()
    {
        if(unit<100)
        {
            bill=(unit*1.5);
        }
        else if(unit>100 && unit<=200)
        {
            bill=(unit-100)*3+150;
        }
        else if(unit>200 && unit<=500)
        {
            bill=(unit-200)*4.5+450;
        }
        else if(unit>500)
        {
            bill=(unit-500)*7+1800;
        }
        
    }
}
public class electricitybill
{
    public static void main(String[] args)
    {
        
        
        
    }
    
}
