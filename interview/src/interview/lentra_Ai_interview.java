package interview;

public class lentra_Ai_interview
 {

   public static void main(String[] args) 
   {
       int arr[] = {3,9,36,62,121,64,21,3,660,6,-1};

      int count = 0;

       for(int i=0;i<arr.length-1;i++){

           if(arr[i]%2!=0&&arr[i+1]%2!=0 && arr[i]+arr[i+1]>=20)
           {
               count++;
           }

       }

       System.out.println(count);

   }

}
