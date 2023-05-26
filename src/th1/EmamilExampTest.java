package th1;

public class EmamilExampTest {
    private static EmailExample emailExample;
    public static final String[] valiEmail=new String[]{
            "a1@gmail.com*", "ab@yahoo.com", "abc@hotmail.com"
    };
    public static final String[] invaldiEmail=new String[]{
            "@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample= new EmailExample();
        for (String email: valiEmail) {
            boolean isvalid=emailExample.validate(email);
            System.out.println("Email is "+ email+ "is valid "+isvalid );
        }
        for (String email: invaldiEmail) {
            boolean isvalid= emailExample.validate(email);
            System.out.println("Email is "+email +" is valid"+isvalid);
        }
    }
}
