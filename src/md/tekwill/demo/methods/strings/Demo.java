package md.tekwill.demo.methods.strings;

class Demo {
    public static void main(String[] args) {
        System.out.println(StringUtils.reverse("Mike"));
        System.out.println(StringUtils.reverse("John"));
        System.out.println(StringUtils.reverse("Hello"));
        System.out.println();
        System.out.println(StringUtils.checkForCommonPart("Hello bob", "Hello helen"));
        System.out.println(StringUtils.checkForCommonPart("H3llo bob", "Hello helen"));
        System.out.println(StringUtils.checkForCommonPart("ioilo bob", "Hello helen"));
    }
}
