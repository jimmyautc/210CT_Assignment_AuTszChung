public class BinarySearch{
	private int globalArray[];
	private int globalKey;
	
	public int binSearch( int array[], int key, int low, int high ) {
		int middle;
		if (low > high) return -1;
		middle = (low + high) / 2;
		return key == array[middle] ?
		middle :
		key < array[middle] ?
		binSearch(array, key, low, middle-1) :
		binSearch(array, key, middle+1, high);
	}
	
	public int binSearch( int array[], int key ) {
		globalArray = array;
		globalKey = key;
		return (binSearchRecur(0, array.length-1));
	} // binSearch
	
	private int binSearchRecur(int low, int high) {
		int middle; 
		if (low > high) return -1;
		middle = (low + high) /2;
		if(globalKey == globalArray[middle] ){
			 return middle; 
		}
		else if(globalKey < globalArray[middle] ){
			return binSearchRecur(low, middle-1);
		}
		else{
			return binSearchRecur(middle+1, high);
		}

	} // binSearchRecur
	
}