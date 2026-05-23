package RetoHashMap;

import java.util.HashMap;

public class QuestLog {
    private HashMap<String, Quest> quests;  // Mapa: ID → Quest

    // El constructor no hace falta modificarlo
    public QuestLog() {
        this.quests = new HashMap<>();
    }

    public void addQuest(Quest quest) {
        // Aquí tu código
        quests.put(quest.getId(),quest);
    }

    public Quest getQuest(String questId) {
        // Aquí tu código
       return quests.get(questId);
       // return null; // Sustituye null por el valor que sea
    }

    public void completeQuest(String questId) {
        // Aquí tu código
        if (quests.containsKey(questId)) {
            Quest quest = quests.get(questId);
            quest.setCompleted(true);
        }
        // o podemos hacer if (quests!=null)
    }

    // Este getter no lo vamos a modificar
    public HashMap<String, Quest> getQuests() {
        return quests;
    }

}