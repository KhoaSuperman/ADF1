
public class Circle extends GraphicObject
{
    int banKinh;
    
    public Circle(int _banKinh, String _color){
        //gọi constructor của lớp cha - Super Class: GraphicObject
        super(_color);
        
        this.banKinh = _banKinh;
    }
    
    @Override
    public float getArea(){
        //area = 3.14 * pi2;
        //kiểu float phải có f đằng sau
        this.area = 3.14f * this.banKinh * this.banKinh;
        return area;
    }
}
