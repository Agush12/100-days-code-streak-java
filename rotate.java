class Solution {
    static void rev(int nums[],int i,int j){
        while(i<j){int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;}
    }
    public static void rotate(int[] nums, int k) {
        if(k>nums.length){
            k=k%nums.length;
        }
        int d=nums.length-k;

        rev(nums,0,d-1);
        rev(nums,d,nums.length-1);
        rev(nums,0,nums.length-1);
        
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        rotate(arr,3);
    }
}