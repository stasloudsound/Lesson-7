

public class Main {


    public static int index;
    public static int arr[];
    public static int size = 10;

    public static void add(int value) {

        regeneration();
        arr[index++] = value;
    }


    public static void regeneration() {

        if (index >= size) {
            size = size * 2;
            int[] newArr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }

            arr = newArr;

        }
    }


    public static void remove(int indexR) {
        if (indexR < index && indexR >= 0) {
            int[] newArr = new int[size];
            for (int i = 0, t = 0; i < index; i++) {
                if (indexR != i) {
                    newArr[t++] = arr[i];
                }

            }
            index--;
            arr = newArr;
        }
    }

    public static int lenght() {

        return index;
    }

    public static void insertByIndex(int indexI, int value) {
        regeneration();

        int[] newArr = new int[size];
        for (int i = 0, j = 0; i < index; j++) {
            if (j == indexI) {
                newArr[j] = value;
            }else  {
                newArr[j] = arr[i];
                i++;
            }

        }
        index++;
        arr = newArr;

    }

    public static void print() {
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        arr = new int[size];
//   List <Integer> arr = new ArrayList<>();
        add(0);
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);
        add(7);
        add(8);
        add(9);
        add(10);
        add(11);
        remove(5);
        insertByIndex(7, 135413);
        print();
        System.out.println(lenght());

    }
}