public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        int ceilingNum = CeilingOfaNumber(arr, target);
        System.out.println(ceilingNum);
    }

    static int CeilingOfaNumber(int[] arr, int target) {
        int st = 0;
        int ed = arr.length-1;
        while(st <= ed) {
            int mid = st+(ed-st)/2;

            if(arr[mid] < target) {
                st = mid+1;
            }else if(arr[mid] > target) {
                ed = mid-1;
            } else {
                return mid;
            }
        }
        return arr[st];
    }
}
