public class Continue {
    public static void main(String[] args) {
        for(var counter = 1; counter <= 100; counter++){
//            module
            if(counter % 2 == 1){
                continue;
            }

            System.out.println("Perulangan Ganjil " + counter);
        }
    }
}
