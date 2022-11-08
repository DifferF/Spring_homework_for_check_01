package task_02;

import task_02.quest.RunAwayQ;
import task_02.quest.StandQ;

public class Knight {
    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public Knight() {

    }

    public Quest getQuest() {
        return quest;
    }
    public void setQuest(Quest quest) {
        this.quest = quest;
    }
    public void setSetQuest(Quest quest) {
        this.quest = quest;
    }
}
