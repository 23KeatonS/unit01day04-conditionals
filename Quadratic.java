public class Quadratic {
    public static void main(String[] args) {
        if (args.length<3){
            System.out.println("Please provide 3 integer arguments");
        }else{
             double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            if ((Math.pow(b,2)-(4*a*c)) <0){
                System.out.println("No Solutions");
            }else{
                if (a==0){
                    double result = -c/b;
                    System.out.println("x = "+result);
                }else{
                double result1 = (((-1*b) + Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a));
                double result2 = (((-1*b) - Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a));
                System.out.println("The solutions to "+args[0]+"x^2"+" + "+ args[1]+"x"+" + "+args[2]+" are " +result1 +" and "+result2);
                }
            }
        }
    


}
}
