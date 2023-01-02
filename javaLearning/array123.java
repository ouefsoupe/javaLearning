// Given an array of ints, return 
// true if the sequence of numbers 
// 1, 2, 3 appears in the array somewhere.

public boolean array123(int[] nums) {
    for(int i = 2; i < nums.length; i ++){
      if(nums[i - 2] == 1 && nums[i - 1] == 2 && nums[i] == 3){
        return true;
        }
    }
      return false;
  }
  