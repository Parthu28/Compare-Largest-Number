public class CompareLargest
{
   public static Comparable find_Largest(Comparable arr[])
   {
       //declare and initialize a variable to store the largest value
       Comparable largest=arr[0];

       //search over the array and find the largest
       for(int i=1;i<arr.length;i++)
       {
           if(arr[i].compareTo(largest)>0)
           {
               largest=arr[i];
           }
       }
       // return largest
       return largest;
   }
   public static void main(String[] args)
   {
       Double[] d= {2.0,5.7,22.4};
       System.out.println("Largest Double: "+find_Largest(d));

       Integer[] i= {1,2,3,4,5,6,7,8,9};
       System.out.println("Largest Integer: "+find_Largest(i));

       String[] s = {"john", "mack", "sam", "Parth"};
       System.out.println("Largest string: " + find_Largest(s));
   }
}