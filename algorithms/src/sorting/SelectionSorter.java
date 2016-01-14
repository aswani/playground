package sorting;

public class SelectionSorter implements Sorter {

	@Override
	public int[] sort(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			int tentiveMin = inputArray[i];
			int minIndex = i;
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[j] < tentiveMin) {
					tentiveMin = inputArray[j];
					minIndex = j;
				}
			}
			if (tentiveMin < inputArray[i]) {
				inputArray[i] = inputArray[minIndex]^inputArray[i];
				inputArray[minIndex] = inputArray[minIndex]^inputArray[i];
				inputArray[i]=inputArray[minIndex]^inputArray[i];
			}

		}
		return inputArray;
	}


}
