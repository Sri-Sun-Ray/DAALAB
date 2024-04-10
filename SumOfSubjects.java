import java.util.*;
public class SumOfSubjects
{
    public static void findSubsets(int[] arr,int targetSum,int index,List<Integer> Subset,int currentSum)
    {
        if(currentSum==targetSum)
        {
            System.out.println("Subset with sum "+targetSum+":"+Subset);
            return;
        }
        if(currentSum>targetSum||index==arr.length){
            return;
        }
        Subset.add(arr[index]);
        currentSum+=arr[index];
        findSubsets(arr, targetSum, index+1, Subset, currentSum);
        Subset.remove(Subset.size()-1);
        currentSum-=arr[index];
        findSubsets(arr, targetSum, index+1, Subset, currentSum);
    }
    
    public static void main(String [] args)
    {
        int [] arr={10,7,5,18,12,20,15};
        int targetSum=35,index=0,currentSum=0;
        List<Integer> Subset=new ArrayList<>();
        findSubsets(arr,targetSum,index,Subset,currentSum);
    }
    
}