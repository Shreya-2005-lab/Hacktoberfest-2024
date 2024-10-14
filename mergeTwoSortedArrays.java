public class mergeTwoSortedArr {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int[] brr = {2,4,6,8,9,10};
        int m = arr.length, n = brr.length;
        int[] crr = new int[m+n];

        int l =0;
        int j= 0;
        int k =0;

        while(l<arr.length && j< brr.length ) {
            if (arr[l] <= brr[j]) {
                crr[k] = arr[l];
                l++;
            } else {
                crr[k] = brr[j];
                j++;
            }
            k++;
        }
            if (l == arr.length) {
                while (j < brr.length) {
                    crr[k] = brr[j];
                    j++; k++;
                }
            }
            else if (j== brr.length){
                while(l< arr.length) {
                    crr[k] = arr[l];
                    l++; k++;
                }
            }

        for (int i = 0; i < crr.length; i++) {
            System.out.print(crr[i]+" ");
        }
        }
    }
