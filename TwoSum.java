package leetcode.TwoSum;

//给定一个数和一个数组，要求找出数组中相加等于给定数的两个数
public class TwoSum {
	public static void main(String[] args) {
		int a[]= {3,13,2,7,6,11,15};
		int b=9;
		int c[]=twoSum(a,b);
		System.out.println(c[0]+","+c[1]);
	}
//两层循环暴力相加
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>i;j--){
                if(nums[i]+nums[j]==target) {
                	return new int [] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    /**
     *通过keyvalue键值对，检查符合结果减去循环数的数。
     * public int[] twoSum(int[] nums, int target) {
            int[] indexs = new int[2];
        
        // 建立k-v ，一一对应的哈希表
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                indexs[1] = i;
                indexs[0] = hash.get(nums[i]);
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target-nums[i],i);
        }
        return indexs;
     */
}
