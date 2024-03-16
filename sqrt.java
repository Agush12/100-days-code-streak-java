class sqrt {

    public static void main(String[] args) {
        int x = 16; 
     
        int result = mySqrt(x);
        System.out.println("Square root of " + x + " is: " + result);
    
}


    static int mySqrt(int x) {
        long low = 0, high = x;
        long sol = 0;

        while (low <= high) {
            long mid = (low + high) / 2;

            long sq = mid * mid;
            if (sq == x) {
                return (int) mid;
            }
            if (sq < x) {
                sol = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int) sol;
    }
}
