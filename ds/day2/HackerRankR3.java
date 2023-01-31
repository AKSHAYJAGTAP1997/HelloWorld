// Java program to find maximum
// element of each row in a matrix
public class HackerRankR3{

	
	public static void max(int rows, int[][] arr) {
		int i = 0;
		
		
		int max = 0;
		int[] result = new int[rows];
		while (i < rows) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
			result[i] = max;
			max =0;
			i++;

		}
		printArray(result);

	}

	
	private static void printArray(int[] result) {
		for (int i =0; i<result.length;i++) {
			System.out.println(result[i]);
		}

	}

	
	public static void main(String[] args) {
		int[][] arr = new int[][] { {3, 4, 1, 8},
									{1, 4, 9, 11},
									{76, 34, 21, 1};
								
	
		max(3, arr);
	}
}
