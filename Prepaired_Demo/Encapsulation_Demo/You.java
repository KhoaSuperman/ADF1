

public class You
{
    //people don't know where you earn money from ?
    //people only know total of your salary
    
    //=> hiding all private method, field
    //=> hiding process behind, public only output
    
   private int banBia(){
       return 300;
    }
    
   private int thietKeWeb(){
       return 2000;
    }
    
   private int nepTuyn(){
       return 400;
    }
    
    public void thuNhapHangThang(){
        int total = banBia() + thietKeWeb() + nepTuyn();
        System.out.println("Thu nhap: "+total);
    }
}
