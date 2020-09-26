package Class;

/**
 * @Author AT-zfc
 * @Since 2020-06-29 15:21
 */
public class TestArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        try {
            for (int x = 0; x <= arr.length; x++) {
                System.out.println(arr[x]);
            }
            System.out.println("程序继续向下执行...");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("下标越界");
        }
        System.out.println("over");
    }
}
