
public class GaoSuTu extends Gao implements IGaoSuTuSkill
{
    public GaoSuTu(int _health, int _mana, int _damage){
        this.health = _health;
        this.mana = _mana;
        this.name = "Gao Sư Tử";
        this.damage = _damage;
    }
    
    @Override
    public void gSuTu_Skill1(){
        System.out.println("Gao Sư Tử sử dụng skill 1.");
    }
    
    @Override
    public void gSuTu_Skill2(){
        System.out.println("Gao Sư Tử sử dụng skill 2.");
    }
}
