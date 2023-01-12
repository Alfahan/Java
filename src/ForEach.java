public class ForEach {
    public static void main(String[] args) {

        String[] names = {
                "Mohamad", "Ali", "Farhan",
                "Programmer", "Zaman", "Now"
        };

        for(var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("ForEach");

        for(String name: names){
            System.out.println(name);
        }
    }
}
