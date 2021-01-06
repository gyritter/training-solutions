package exam02;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills= new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkills(String... képzettség){
        String skill;
        int level;
        for(String s:képzettség){
           skill= s.substring(0,s.indexOf("(")-1);
           level=Integer.parseInt(s.substring(s.length()-2,s.length()-1));
           skills.add(new Skill(skill, level));
        }
    }

    public int findSkillLevelByName(String skillName){
        for(Skill s:skills){
            if (s.getName().equals(skillName)){
                return s.getLevel();
            }
        }
        return 0;
       // throw new SkillNotFoundException();
    }
}
