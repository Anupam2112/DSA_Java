public class CountRotation {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int count = rotationCount(arr);
        System.out.println(count);
    }

    static int rotationCount(int[] arr) {
        int pivot = pivot(arr);
        if(pivot == -1) {
            return 0;
        }
        int count  = 0;

        for(int i=0; i <= pivot; i++) {
          count += 1;
        }
        return count;
    }

    static int pivot(int[] arr) {
        int st = 0;
        int ed = arr.length-1;

        if(arr.length <= 1) {
            return -1;
        }

        while(st <= ed) {
            int mid = st+(ed-st)/2;

            if(mid < ed && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if(mid > st && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            if(arr[mid] == arr[st] && arr[mid] == arr[ed]) {
                if(arr[st] > arr[st+1]) {
                    return st;
                }
                st++;

                if(arr[ed] < arr[ed-1]) {
                    return ed-1;
                }
                ed--;
            } else if (arr[st] < arr[mid] || arr[st] == arr[mid] && arr[mid] > arr[ed]){
               st = mid+1;
            }else {
                ed = mid-1;
            }
        }
        return -1;
    }
}
