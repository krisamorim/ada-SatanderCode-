public class AAB_Variables {
    public static void main(String[] args) {
        //Primitives types
        byte byteNUmber = -128; //from -128 to 127
        short shortNumber = -32768;//from -32768 to 32767
        int intNumber = 2147483647; //from -2147483647 to 2147483647
        long longNumber = 9223372035999999999L; //from -9223372036854775808 to 9223372036854750000
        double numberDouble = 2000.00;
        float numberFloat = 2500.0F;
        boolean value = true;
        char v = 65; //ascii value

        //reference types
        String txt = "text"; //in truth String is a class not a type

        //doing cast
        int number = (byte) 129;

        var anyVariable = 15; //from version 10 Java add a feature in which it isn't necessary to inform the type of variable

        System.out.println(number);
    }
}
