import java.util.Scanner;
class MergeSort{
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
        mergepass(a,lb,ub);
        System.out.println("Sorted list is");
        for(int i=0;i<n;i++){
         System.out.print(a[i]+" ");
        }
        System.out.println();
   }
   public static void mergepass(int a[],int lb,int ub){
     if(lb!=ub){
       int mid=(lb+ub)/2;
       mergepass(a,lb,mid);
       mergepass(a,mid+1,ub);
       mergesort(a,lb,mid,ub);
     }
     
   }
   public static void mergesort(int a[],int lb,int mid,int ub){
      int i=lb;
      int j=mid+1;
      int temp[]=new int[a.length];
      int k=lb;
      while((i<=mid) && (j<=ub)){
       if(a[i]<a[j])
         temp[k++]=a[i++];
       else
         temp[k++]=a[j++];
      }
      while(i<=mid)
         temp[k++]=a[i++];
      while(j<=ub)
        temp[k++]=a[j++];
      for(int p=lb;p<=ub;p++)
         a[p]=temp[p];
   }
 }