

public class Square extends GraphicObject
{
    int width;
    int height;
    
   public Square(int _width, int _height, String _color){
       super(_color);
       
       this.width = _width;
       this.height = _height;
    }
    
    @Override
    public float getArea(){
        this.area = width * height;
        return area;
    }
}
