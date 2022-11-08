package task_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import task_02.quest.JumpQ;
import task_02.quest.RunAwayQ;
import task_02.quest.StandQ;

/*
Задание 2+
Создать интерфейс Quest и несколько его реализаций, а также класс Knight.
Рыцарь может принимать любую реализацию интерфейса Quest и выполнять этот Quest успешно.
При выполнении задания использовать новые знания о POJO, DI & IoC.
 */
public class Main {


    public static void main(String[] args) {

        Knight knight_01 = new Knight();

        knight_01.setQuest(new RunAwayQ());
        knight_01.getQuest().myQuest();

        knight_01.setQuest(new JumpQ());
        knight_01.getQuest().myQuest();


        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        Knight knight_02 = ctx.getBean("knight", Knight.class);
        knight_02.setQuest(new RunAwayQ());
        knight_02.getQuest().myQuest();

        // Внедрение зависимости в коде
        Knight knight_03 = ctx.getBean("knight", Knight.class);
        knight_03.setQuest(ctx.getBean("stand", StandQ.class));
        knight_03.getQuest().myQuest();

        // Внедрение зависимости в контейнере
        Knight knight_04 = ctx.getBean("knight_2", Knight.class);
        knight_04.getQuest().myQuest();

        // Внедрение зависимости используя конструктор
        Knight knight_05 = ctx.getBean("knight_3", Knight.class);
        knight_05.getQuest().myQuest();

        // Внедрение зависимости в режиме java конфигурации
        ApplicationContext ctxJ = new AnnotationConfigApplicationContext(ConfigQuest.class);
        Knight knight_06 = ctxJ.getBean(Knight.class);
        knight_06.getQuest().myQuest();
    }





}
