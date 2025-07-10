public class Main {
    public static void main(String[] args) {

        // Linear_Search_Algorithm we are going to learn and also solve some problems with practice

        int [] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 11;
        int ans = linerSearch(nums,target);
        System.out.println(ans);
    }

    //search in the array : return the index if item found
    // otherwise if item not found return -1

    static int linerSearch(int[] arr, int target){
        if(arr.length== 0){
            return -1;
        }
        //run a for loop
//        for (int index = 0; index <arr.length;index++){
//            //check for element at every index if it is = target
//            int element = arr[index];
//            if (element == target){
//                return index;
//            }
//        }
        for(int element:arr){
            if (element == target) {
                return  element;
            }
        }
        // this line will execute if none of the return statement above have executed
        //hence the target  not found
        return Integer.MAX_VALUE;
    }
}