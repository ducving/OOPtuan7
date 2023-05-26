package bt1;

public class ClassTest {
    private static Lop LopExample;
    public static final String[]valiClass=new String[]{
            "C1234G*","A12321","P1233I"
    };
    public static final String[]invaldiClass=new String[]{
            "C1234I*","A1232B","C1233I"
    };

    public static void main(String[] args) {
        LopExample=new Lop();
        for (String lop:valiClass) {
            boolean isvalis= LopExample.validate(lop);
            System.out.println("class  "+ lop+ "is valid "+isvalis );
        }
        for (String lop:invaldiClass) {
            boolean isvalis= LopExample.validate(lop);
            System.out.println("class  "+ lop+ "is valid "+isvalis );
        }
    }
}
