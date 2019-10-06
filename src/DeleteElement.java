
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0};
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào giá trị muốn xoa' : ");
        int x = input.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < arr.length-1; i++) {
                arr[index] = arr[index + 1];
                index++;
            }
//            while (index < arr.length - 1) {
//                arr[index] = arr[index + 1];
//                index++;
//            }
            arr[arr.length - 1] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }


    }
}
