
public class GaoKing extends Gao implements IGaoSuTuSkill, IGaoHoSkill, IGaoCaMapSkill
{
    public GaoKing(GaoSuTu _gSuTu, GaoCaMap _gCaMap, GaoHo _gHo){
        this.health = _gSuTu.health + _gCaMap.health + _gHo.health;
        this.mana = _gSuTu.mana + _gCaMap.mana + _gHo.mana;
        this.name = "Gao King";
        this.damage = _gSuTu.damage + _gCaMap.damage + _gHo.damage;
    }
    
    //Skill của Gao Sư Tử
    @Override
    public void gSuTu_Skill1(){
        System.out.println("Gao King sử dụng skill 1 của Gao Sư Tử.");
    }
    
    @Override
    public void gSuTu_Skill2(){
        System.out.println("Gao King sử dụng skill 2 của Gao Sư Tử.");
    }
    
    //Skill của GaoHo
    @Override
    public void gHo_Skill1(){
        System.out.println("Gao King sử dụng skill 1 của Gao Hổ.");
    }
    
    //Skill của Gao Cá MÂp
    @Override
    public void gCaMap_Skill1(){
        System.out.println("Gao King sử dụng skill 1 của Gao Cá Mập.");
    }
}
