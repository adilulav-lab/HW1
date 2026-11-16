public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int n=Integer.parseInt(args[0]); 
        int denominator=1;
        int sign=1;
for (int i=0; i<n; i++){
approxPi+=sign*(1.0/denominator);
sign=sign*(-1);
denominator+=2;
        }
approxPi=4*approxPi;       
        System.out.println(approxPi + " " + actualPi);
    }
}
