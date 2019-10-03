package md.tekwill.demo.grades;

class Demo {

    public static void main(String[] args) {
        int[] digitsArray = new int[7];
        String digits = "87 87 65 4 69 78 56";

        int start = 0;
        int end = 0;
        int indexOfDigitArray = 0;

        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) == ' ') {
                end = i;
                String oneNumber = "";
                for (int j = start; j < end; j++) {
                    oneNumber += digits.charAt(j);
                }
                start = end + 1;
                digitsArray[indexOfDigitArray++] = new Integer(oneNumber);
            }
            if (i == digits.length() - 1) {
                String oneNumber = "";
                end = i;
                for (int j = start; j < end; j++) {
                    oneNumber += digits.charAt(j);
                }
                digitsArray[indexOfDigitArray++] = new Integer(oneNumber);
            }
        }

        for (int i : digitsArray) {
            System.out.println(i);
        }
    }
}
