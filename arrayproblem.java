package training;
import java.util.ArrayList;
public class arrayproblem {
	 public static int removeDuplicates(int[] nums)
	 {
	ArrayList<Integer> unique=new ArrayList<>();
	for(int num:nums) {
		if(!unique.contains(num)) {
			unique.add(num);
		}
	}
	 // Copy elements back to array
    for (int i = 0; i < unique.size(); i++) {
        nums[i] = unique.get(i);
    }
	return unique.size();
	}
	public static void main(String args[]) {
		int[] nums= {0,1,1,1,2,2,2,3,3,4};
		int k=removeDuplicates(nums);
		System.out.println("k: "+k);
		for(int i=0;i<k;i++) {
			System.out.println(nums[i] +" ");
		}
	}
}
