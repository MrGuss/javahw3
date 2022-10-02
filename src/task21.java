public class task21 {
    public static void main(String[] args) {
        Double test1 = Double.valueOf(123.123);
        Double test2 = Double.parseDouble("123.123");

        byte testByte = test1.byteValue();
        short testShort = test1.shortValue();
        int testInt = test1.intValue();
        long testLong = test1.longValue();
        float testFloat = test1.floatValue();
        double testDouble = test1.doubleValue();

        System.out.println(
                test1 + "\n" +
                testByte + "\n" +
                testShort + "\n" +
                testInt + "\n" +
                testLong + "\n" +
                testFloat + "\n" +
                testDouble
        );

        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
