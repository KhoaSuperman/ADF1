
public class GaoHo extends Gao implements IGaoHoSkill
{
    public GaoHo(int _health, int _mana, int _damage){
        this.health = _health;
        this.mana = _mana;
        this.name = "Gao Hổ";
        this.damage = _damage;
    }
    
    @Override
    public void gHo_Skill1(){
        System.out.println("Gao Hổ sử dụng skill 1");
    }
}
