public class ReferenceDataTypes {
    public static void main(String[] args) {
        int five = 5;
        Integer six = 6;
        String result = sum(five, six);

        System.out.println(result); // 11
    }

    public static String sum(Integer a, int b) {
        Integer result = a + b;
        return result.toString(); 
    }
}