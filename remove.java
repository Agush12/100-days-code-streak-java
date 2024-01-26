class Solution {
    public static int []swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
    public static int removeElement(int[] nums, int val) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
               nums= swap(nums,i,count);
                count++;
            }
        }return count;
        
    }
    public static void main(String args[]){
        int arr[]={1,2,2,4,2,5,6};
        System.out.println(removeElement(arr,2));
    }
}