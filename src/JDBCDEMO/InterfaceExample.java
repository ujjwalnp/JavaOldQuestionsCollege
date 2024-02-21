public class InterfaceExample implements Java_Interface {

    @Override
    public int find_highest_number(int[] arr) {
        int highestNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highestNumber) {
                highestNumber = arr[i];
            }
        }

        return highestNumber;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 0, 1, 4, 8};

        InterfaceExample example = new InterfaceExample();
        int highestNumber = example.find_highest_number(arr);

        System.out.println("Highest number: " + highestNumber);
    }
}
