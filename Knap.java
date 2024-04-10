import java.util.*;
class DataObject{
    int profit,weight;
    double pw;
}
public class Knap{
    DataObject d[];
    int max,n,sum=0;
    Scanner sc;
    public Knap(){
        sc=new Scanner(System.in);
        System.out.println("enter no of objects");
        n=sc.nextInt();
        d=new DataObject[n];
        for(int i=0;i<n;i++){
            d[i]=new DataObject();
            System.out.println("enter profit");
            d[i].profit=sc.nextInt();
            System.out.println("enter weight");
            d[i].weight=sc.nextInt();
        }
        System.out.println("enter size of ksnap");
        max=sc.nextInt();
    }
        public void Calculate(){
            for(int i=0;i<n;i++){
                d[i].pw=d[i].profit/(double)d[i].weight;
            }
            for(int j=0;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(d[j].pw<d[k].pw){
                        DataObject temp=d[j];
                        d[j]=d[k];
                        d[k]=temp;
                    }
                }
            }
            int i=0;
            while(max>0){
                if(d[i].weight<max){
                    max=max-d[i].weight;
                    sum+=d[i].profit;
                }
                else{
                    sum+=max*(d[i].profit/d[i].weight);
                    max=0;
                }
                i++;
            }
            System.out.print("max profit "+sum);
       
    }
    public static void main(String args[]){
       Knap p=new Knap();
       p.Calculate();
         
    }
}