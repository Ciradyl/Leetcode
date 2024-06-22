class Solution {
    public int divide(int dividend, int divisor) {
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long longDividend = Math.abs((long) dividend);
        long longDivisor = Math.abs((long) divisor);
        long quotient = 0;

        while (longDividend >= longDivisor) {
            long temp = longDivisor;
            long multiple = 1;
            while (longDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            longDividend -= temp;
            quotient += multiple;
        }

        if (isNegative) {
            quotient = -quotient;
        }

        if (quotient > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (quotient < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) quotient;
    }
}