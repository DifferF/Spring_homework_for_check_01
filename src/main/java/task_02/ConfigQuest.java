package task_02;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import task_02.quest.RunAwayQ;


@Configuration
public class ConfigQuest {


    @Bean
    public Quest questRun(){
        return new RunAwayQ();
    }

    @Bean
    public Knight Knight(Quest quest){
        return new Knight(quest);
    }

}
