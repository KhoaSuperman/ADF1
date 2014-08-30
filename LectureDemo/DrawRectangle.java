
public class DrawRectangle
{
    public static void main(String[] args){
        //để truy cập vào biến static
        String a  = TinhToan.a;
        //để truy vào biến non-static
        TinhToan t = new TinhToan();
        String b = t.b;
        
        System.out.println("Static: "+a);
        System.out.println("Non-Static: "+b);
    }
}
