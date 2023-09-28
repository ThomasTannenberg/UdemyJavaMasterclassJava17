public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }


        if (bigCount * 5 + smallCount < goal) {
            return false;
        }

        // After using the big bags, the remaining weight to reach the goal should be
        // less than or equal to the smallCount
        return (goal % 5) <= smallCount;
    }
}
