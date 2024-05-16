package Interview.interview160524.BinarySearch;

public class BinarySearch {
    
     public static void main(String[] args){
         int arr[]={1,3,5,8,9,10,12};
         System.out.println(binarySearch(arr,0,arr.length-1,5));
     }
    
public static int binarySearch(int arr[], int low, int high, int key) {
	int mid = (low + high) / 2;
	//System.out.println(mid);

	while (low <= high) {
		if (arr[mid] < key) {
			low = mid;
			//System.out.println(low);
		} else if (arr[mid] == key) {
			return mid;
		} else {
			high = mid;
		}
		mid = (low + high) / 2;
	}

	if (low > high) {
		return -1;
	}

	return -1;
}

}