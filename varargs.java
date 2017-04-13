public class Varargs {

	public static void main(String[] args){
		walk(1);	// 0
		walk(1, 2);	// 1
		walk(1, 2, 3);	// 2
		walk(1, new int[] {2, 5});	// 2
		walk(1, new int[] {2, 5, 58, 8});	// 4
		
		//walk(1, null); //throws a null pointer exception

		run(11, 22);	// 22
	}	

	public static void walk(int start, int... nums) {
		System.out.println(nums.length); // prints the length of the varags nums parameter passed in, if there is one.
	}

	public static void run(int... nums) {
		System.out.println(nums[1]); // prints the second number in the zero indexed array of nums passed in as a varags parameter.
	}

}
