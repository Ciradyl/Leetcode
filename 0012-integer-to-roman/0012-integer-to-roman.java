class Solution {
    public String intToRoman(int num) {
        String onesArr[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String tensArr[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String hundredsArr[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String thousandsArr[] = {"", "M", "MM", "MMM"};

        String ones = onesArr[num % 10];
        String tens = tensArr[(num % 100) / 10];
        String hundreds = hundredsArr[(num % 1000) / 100];
        String thousands = thousandsArr[num / 1000];

        String romanChar = thousands + hundreds + tens + ones;

        return romanChar;
    }
}