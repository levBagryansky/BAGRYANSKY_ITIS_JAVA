public class Ex2 {
    static boolean isit(String[] array) {
        int n = array.length;
        boolean k = false;
        for (int i = 0; i < n; i++) {
            if (array[i].equals("str"))
                k = true;
        }
        return k;
    }


    public static void main(String[] args) {
        String[] arr = {"g", "f", "t", "str", "o"};
        System.out.println(isit(arr));
        String[] arr1 = {"g", "f", "t", "o"};
        System.out.println(isit(arr1));
    }
}