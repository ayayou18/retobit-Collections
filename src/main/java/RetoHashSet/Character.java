package RetoHashSet;

import java.util.HashSet;

public abstract class Character {
    private HashSet<Skill> skills = new HashSet<>();

    public boolean learnSkill(Skill skill) {
        // Aquí tu código
       return skills.add(skill);
        // sustituye este boolean por el return real
    }

    public boolean hasSkill(Skill skill) {
        // Aquí tu código
        boolean A=false;
        if (skills.contains(skill))
        {A=true;}
        else{A=false;}
        return A;  // sustituye este boolean por el return real
        // o mas sencillo return skills.contains(skill)
    }
}