package DSA;

public class SubSequence {

    public static void main(String args[]) {

        int[] givenSet = { 5, 1, 22, 25, 6, -1, 8, 10 };

        int[] subSet = { 6, -1, 10 };

        int ida = 0;
        int ids = 0;
        while (ida < givenSet.length && ids < subSet.length)

        {
            if (givenSet[ida] == subSet[ids]) {

                ids++;
            }
            ida++;
            if (ids == subSet.length) {
                System.out.println("sub sequence found");
            }

        }

    }
}
