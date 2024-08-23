class mek{
    //2335
    public static void main(String[] args) {
        int [] arr = {1,1,1,1};
        System.out.println(solution(arr, 1));
    }

    static int solution(int[] votes, int k) {
        mergeSort(votes, 0, votes.length - 1);

        if(k == 0 && votes[votes.length - 1] == votes[votes.length - 2]){
            return 0;
        }

        int counter = 0;

        for(int i = 0; i < votes.length; i++){
            if(votes[i] + k > votes[votes.length - 1]){
                counter++;
            }
        }
        return counter == 0 ? 1 : counter;
    }
    

    static void mergeSort(int [] arr, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int [] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int [] Left = new int[n1];
        int [] Right = new int[n2];

        for(int i = 0; i < n1; i++){
            Left[i] = arr[left + i];
        }

        for(int i = 0; i < n2; i++){
            Right[i] = arr[mid + 1 + i];
        }

        int i = 0, j =0;
        int k = left;
        while (i < n1 && j < n2) {
            if(Left[i] <= Right[j]){
                arr[k] = Left[i];
                i++;
            }else{
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = Left[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = Right[j];
            j++;
            k++;
        }
    }
    
}