import java.util.Scanner;
class BinarySearchR{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the key");
        int key=sc.nextInt();
        int lb=0,ub=n-1;
        int c=binarysearch(lb,ub,key,a);
        if(c==-1){
        System.out.println("Element no found");
        }
        else{
         System.out.println("Element "+key+" is found at "+c);
        }
    }
    public static int binarysearch(int lb,int ub,int key,int a[]){
         if(lb>ub)
           return -1;
          else{
            int mid=(lb+ub)/2;
            //System.out.println(lb+" "+ub);
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]<key){
                return binarysearch(mid+1,ub,key,a);
            }
            else
              return binarysearch(lb,mid-1,key,a);
          }
    }
}