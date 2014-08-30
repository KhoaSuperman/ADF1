

public class Test
{
    public static void main(String[] args){
        String s = "'abc '";
        s = s + "def' ";
        System.out.println(s);
        
        
        //hÌnh tròn
        int banKinh = 5;
        Circle c = new Circle(banKinh, "Đỏ");
        
        System.out.println("Hình tròn có màu: "+c.color);
        
        //lấy diện tích hình tròn
        float area = c.getArea();
        System.out.println("Diện tích hình tròn: "+area);
        
        
        //hình chũ nhật
        int width = 20;
        int height = 5;
        Square h = new Square(width, height, "Xanh");
        System.out.println("Hình chữ nhật màu: "+h.color);
        
        //lấy diện tích
        float area2 = h.getArea();
        System.out.println("Diện tích hình chữ nhật: "+area2);
    }
}
