public class BinarySearch {

    int binarySearch(int[] array, int x, int low, int high) {

        int mid;
        int returnValue = -1;
        while (high >= low) {
            mid = (low + high) / 2;
            if (x == array[mid]) {
                returnValue = mid;
                break;
            } else if (x < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return returnValue;
    }

    public static void main(String[] args) {

        int[] array = {2, 4, 6, 8, 10, 12};
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearch(array, 4,0,array.length);
        if (result == -1){
            System.out.println("The Element is not found in the array");
        }else {
            System.out.println("The Element is found in the array at index "+result);
        }
    }
}

