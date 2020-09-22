public class TowerOfHanoi {
    /*
        Create a recursive function which calls itself and takes in the parameter number of discs as an integer, from, to, and intermidates as a characters which signifies tower A, C, and B respectively.
   
    */
    public void hanoiMoves (int numberOfDiscs, char from, char to, char intermediate) {
        // checking if the number of discs in the first tower is 1 then just move to A to C
        if(numberOfDiscs == 1) {
            System.out.print("move discs " + numberOfDiscs + " from " + from + " to " + to);
        }
        //else call the function recursively
        else {
            hanoiMoves(numberOfDiscs - 1, from, intermediate, to);
            System.out.println();//next line
            System.out.print("move discs " + numberOfDiscs + " from " + from + " to "+ to);
            System.out.println();//next line
            hanoiMoves(numberOfDiscs - 1, intermediate, to, from);
        }
       
    }


    public static void main (String[] args) {
        int discs = 5;
        //Scanner input = new Scanner(System.in);
        //System.out.print("Enter the number of discs: ");
        //discs = input.nextInt();
        TowerOfHanoi toh = new TowerOfHanoi();
        toh.hanoiMoves(discs, 'A', 'C', 'B');
       
    }
}
