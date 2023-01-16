// good
public class ThreeEqual {
    public static void main(String[] args) {
        if (args.length<3){
            System.out.println("Please Provide at least 3 integer arguments.");
        }else{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            if (a == b && b == c){
                System.out.println("Equal");
            }else{
                System.out.println("Not Equal");
            }
        }
    }
}