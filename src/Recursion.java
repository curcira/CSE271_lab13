/**
 * Lab13: GitLab and Recursion
 */
public class Recursion {

    /**
     * Recursive method that finds the value of base to the n power.
     * 
     * @param base number that will be taken to the n power
     * @param n    number that will the the power
     * @return
     */
    public static int powerN(int base, int n) {

        if (n == 1) {
            return base;
        }

        return base * powerN(base, n - 1);
    }

    /**
     * Recursive method that counts the number of blocks in a triangle based on
     * the amount of rows. The topmost row has 1 block, the next row down as 2
     * blocks, the next has 3 and so on and so forth.
     * 
     * @param row number of rows in the triangle
     * @return
     */
    public static int triangle(int row) {

        if (row == 0) {
            return 0;
        }

        return row + triangle(row - 1);
    }

    public static void main(String[] args) {
        System.out.println(powerN(2, 3));
        System.out.println(powerN(3, 2));
        System.out.println(powerN(5, 3));

        System.out.println(triangle(4));
        System.out.println(triangle(3));
        System.out.println(triangle(6));
    }

}
