import java.util.Scanner;
class QuickSort{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter no.of elements");
        int n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       
        int lb=0,ub=n-1;
        quicksort(a,lb,ub);
        System.out.println("Sorted list is");
        for(int i=0;i<n;i++){
         System.out.print(a[i]+" ");
        }
        System.out.println();
   }
   public static void quicksort(int a[],int lb,int ub){
          int left=lb;
          int right=ub;
          int pivot=lb;
          while(left<right){
             while((a[pivot]<a[right]) && (pivot!=right))
                right--;
             if(pivot!=right)
             {
               int temp=a[pivot];
               a[pivot]=a[right];
               a[right]=temp;
               pivot=right;
            }
            while((a[pivot]>a[left]) && (left!=pivot))
                left++;
            if(pivot!=left){
               int temp=a[pivot];
               a[pivot]=a[left];
               a[left]=temp;
               pivot=left;
            }
   }
   if(lb<pivot)
     quicksort(a,lb,pivot-1);
   if(pivot<ub)
     quicksort(a,pivot+1,ub);
   }
}