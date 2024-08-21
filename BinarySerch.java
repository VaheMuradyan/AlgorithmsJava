public class BinarySerch {
    public static void main(String[] args) {
        int[] sortedCatalog = {101, 123, 137, 150, 165, 172, 189, 205, 220};
        int bookCode = 150;
        System.out.println("Book found at index: " + findBook(sortedCatalog, bookCode));
    }

    static int findBook(int[] catalog, int bookCode) {
        int left = 0;
        int right = catalog.length - 1;
        
        while (left <= right) {
            // TODO: implement this
            int mid = left + (right - left) / 2;
            if(catalog[mid] == bookCode){
                return mid;
            }
            if(catalog[mid] < bookCode){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        
        return -1; // Book not found
    }

    static int binarySearchForBook(int[] bookIDs, int start, int end, int searchID) {
        if (start > end){
            return start; // Base case
        } 
        int mid = start + (end - start) / 2; // Find the midpoint
        if (bookIDs[mid] == searchID) return mid; // Target found
        if (bookIDs[mid] > searchID) // If the target is less than the midpoint
            return binarySearchForBook(bookIDs, start, mid - 1, searchID); // Search the left half
        return binarySearchForBook(bookIDs, mid + 1, end, searchID); // Search the right half
    }

    public int binarySearch(int [] arr, int target){
        int start = 0; 
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }
        return -1;
    }

    
}
