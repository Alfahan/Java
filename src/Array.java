public class Array {
    public static void main(String[] args) {
        String[]  stringArray;

        stringArray = new String[3];
        stringArray[0] = "Mohamad";
        stringArray[1] = "Ali";
        stringArray[2] = "Farhan";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "Mohamad", "Ali", "Farhan"
        };

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong[0] = 0;

        String[][] members = {
                {"Ali", "Farhan"},
                {"Rido", "Maulana"},
                {"Riza", "Rivaldo"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);

    }
}
