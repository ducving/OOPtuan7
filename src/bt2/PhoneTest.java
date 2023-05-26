package bt2;
public class PhoneTest {
    public static Phone phoneTest;
    public static final String[] validPhone=
            new String[]{"84 123456","84 21325","84 12234"};
    public static final String[] invalidAccount=
            new String[]{"84 32a32","84 2145h","84 13493a"};

    public static void main(String[] args) {
        phoneTest=new Phone();
        for (String phone:validPhone) {
            boolean isValid=phoneTest.valiPhone(phone);
            System.out.println("      "+phone+isValid);
        }
        for (String phone:invalidAccount) {
            boolean isValid=phoneTest.valiPhone(phone);
            System.out.println("      "+phone+isValid);
        }
    }
}
