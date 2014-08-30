
public class HighSchoolTalentStudent extends HighSchoolStudent
{
    String talent;
    
    public HighSchoolTalentStudent(int _id, String _name, int _toan, String _talent){
        super(_id, _name, _toan);
        this.talent = _talent;
    }
}
