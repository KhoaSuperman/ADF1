
//GraphicObject dùng để chỉ các hình học nói chung
//Khi nói đến hình học thì nó rất trừu tượng vì ko hề nói đến cụ thể là
//hình tròn, hình vuông hay hình chữ nhật ... hình học => chỉ chung
//=> nó là abstract
public abstract class GraphicObject
{
    String color;
    float area;
    
    //Constructor với thuộc tính - property chung là color
    public GraphicObject(String _color){
        this.color = _color;
    }
    
    //vì đây là hàm tính toán diện tích của
    //các loại hình học nói chung
    // nên nó phải là abstract - trừu tượng
    public abstract float getArea();
}
