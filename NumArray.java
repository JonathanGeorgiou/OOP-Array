package arraysExercise;

public class NumArray {

	public static void main(String[] args) {
		int numbers[] = new int[9];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
			System.out.println(numbers[i]);
		}
		System.out.println();
		int numbers2[] = new int[9];
		for (int j = 0; j < numbers2.length; j++) {
			numbers2[j] = j * 10;
			System.out.println(numbers2[j]);
		}

	}

}
