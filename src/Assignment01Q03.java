public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); 
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int next1=1 ;
        int next2=1 ;
        int curr=next1 ;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(curr);
            if (curr%2==1)
                numOdd++;
            if (i>=1) {
                next1=next2;
                next2=curr;
                curr=next1+next2;
            }

            if (i < x - 1) 
                System.out.print(" "); 

        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
