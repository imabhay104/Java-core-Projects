class Solution {
    private int valueMapper(char s) {
        return switch (s) {

            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }

    public int romanToInt(String s) {

        int length, count = 0, no = 0;
        length = s.length();
        while (count < length) {

            if (count < length - 1 && valueMapper(s.charAt(count)) < valueMapper(s.charAt(count + 1))) {
                no = no - valueMapper(s.charAt(count));
            } else {
                no += valueMapper(s.charAt(count));
            }
            count++;

        }
        return no;

    }
}