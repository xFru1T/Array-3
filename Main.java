import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print length 1 array: ");
        int len1 = scanner.nextInt();
        int[] array1 = new int[len1];
        System.out.print("Print the number for merge: ");
        for (int i = 0; i < len1; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.print("Print length 2 array: ");
        int len2 = scanner.nextInt();
        int[] array2 = new int[len2];
        System.out.print("Print the number for merge: ");
        for (int i = 0; i < len2; i++) {
            array2[i] = scanner.nextInt();
        }
        int[] str = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, str, 0, array1.length);
        System.arraycopy(array2, 0, str, array1.length, array2.length);
        Arrays.sort(str);
        int count = 0;
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            if (i == 0 || str[i] != str[i - 1]) {
                arr[count] = str[i];
                count++;
                }
            }
        int[] arr1 = Arrays.copyOf(arr, count);
        String[] str1 = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            str1[i] = String.valueOf(arr1[i]);
            }
        System.out.println("Merged array: " + Arrays.toString(str1));
        }
    }


