
public class GaoKing extends Gao
{
    //Constructor
    public GaoKing(GaoSuTu gSuTu, GaoCaMap gCaMap, GaoHo gHo){
        this.health = gSuTu.health + gCaMap.health + gHo.health;
        this.mana = gSuTu.mana + gCaMap.mana + gHo.mana;
    }
}
