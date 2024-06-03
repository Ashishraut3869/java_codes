import java.util.*;
class Collec
{
    public static void main(String args[])
    {
        ArrayList a=new ArrayList<>();
        a.add("ram");
        a.add(100);
        a.add(101);
        System.out.println(a.add(102));
        System.out.println(a);
        ArrayList b= new ArrayList<>();
        b.add(30);
        b.addAll(a);
        System.out.println(b);
        a.remove(1);
        System.out.println(a);
        a.removeAll(b);
         System.out.println(a);
          System.out.println(b);
        
  
    }
}