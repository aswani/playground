package sorting;


public class InsertionSort implements  Sorter {

	public static void main(String[] args) {
	
		
	}
	public  int[] sort(int[] input) {
		for (int i = 1; i < input.length; i++) {
			int tmp = input[i];
			int inx=i-1;
			while (inx>=0&&input[inx]>=tmp) {
				input[inx + 1] = input[inx];
				inx--;
			}
			input[inx+1]=tmp;
		}
		return input;
	}
}