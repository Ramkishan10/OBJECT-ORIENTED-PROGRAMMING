package exno13;
import java.util.*;
class employee implements Comparable<employee>
{
    Scanner s=new Scanner(System.in);
    public String name;
    public long salary;
    employee()
    {
        name=s.nextLine();
        salary=s.nextLong();
    }
    public int compareTo(employee e1)
    {
        return this.name.compareTo(e1.name);
    }
}
public class Exno13
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter how many employee");
        n=s.nextInt();
        ArrayList<employee> obj=new ArrayList<>();
        ArrayList<String> obj1=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            obj.add(new employee());
        }
        Collections.sort(obj);
        for(employee e:obj)
        {
            obj1.add(e.name);
            
        }
        System.out.println(obj1);
    }
    
}

