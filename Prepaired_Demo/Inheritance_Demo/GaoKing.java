
public class GaoKing extends Gao implements
 IGaoSuTuSkill, IGaoHoSkill, IGaoCaMapSkill
{
    
    public GaoKing(GaoSuTu sutu, GaoHo ho, GaoCaMap camap){
        this.health = sutu.health + ho.health + camap.health;
        this.mana = sutu.mana + ho.mana + camap.mana;
    }
    
    //Skills of GaoSuTu
    public void gaoSuTuSkill_1(){
    }
    
   public void gaoSuTuSkill_2(){
    }
    
    //Skills of GaoHo
    public void gaoHoSkill_1(){
    }
    
    //Skills of GapCaMap
    public void gaoCaMapSkill_1(){
    }
}
