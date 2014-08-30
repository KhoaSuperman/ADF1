

public class Test
{
    public static void main(String[] args){
        //khởi tạo các gao mãnh thú
        GaoSuTu gSuTu = new GaoSuTu(300, 120, 50);
        GaoCaMap gCaMap = new GaoCaMap(250, 110, 30);
        GaoHo gHo = new GaoHo(240, 90, 40);
        
        GaoKing gKing = new GaoKing(gSuTu , gCaMap , gHo);
        
        System.out.println(gKing.name);
        System.out.println("Health: "+gKing.health);
        System.out.println("Mana: "+gKing.mana);
        
        
        gSuTu.attack();
        gCaMap.attack();
        gHo.attack();
        gKing.attack();
        
    }
}
