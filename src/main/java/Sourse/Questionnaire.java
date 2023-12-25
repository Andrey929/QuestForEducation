package Sourse;

import java.util.HashMap;

public class Questionnaire {
    private static HashMap<Integer,String> questionsList = new HashMap<>();
    private static String question;

    public Questionnaire(){
        question = "Какое образование вы бы хотели получить (Высшее / Среднее) ?";
    }
    static {
        questionsList.put(2,"(Бюджет / Комерция) ?");
        questionsList.put(3," Есть ли у вас желание учиться ? (Да / Нет) ?");
        questionsList.put(4," Есть ли у тебя или родителей возможность оплатить обучение в университете? (Да / Нет) ?");
        questionsList.put(5," Готов продержаться в таком темпе 5 лет ?");
        questionsList.put(6," Ты победил и спустя 5 лет получишь корочку !!!");
        questionsList.put(7," Пока ты к такому не готов( Ступай подрабатывать и возвращайся.");
        questionsList.put(8," На бюджете с таким настроем не удеражаться, вы проиграли (");
        questionsList.put(9,"(Бюджет / Комерция) ?");
        questionsList.put(10,"Проходишь по баллам  (Да / Нет) ?");
        questionsList.put(11," Есть ли у тебя или родителей возможность оплатить обучение в колледже? (Да / Нет) ?");
        questionsList.put(12," Ты везунчик 4 года и диплом твой. Но пойдешь ли в ВУЗ (Да / Нет)?");
        questionsList.put(13,"Пора работать )) p.s Поражение");
        questionsList.put(14,"Удачи в упорном обучении, и диплом обязательно получишь ) p.s Победа");
        questionsList.put(15,"Нужно время собраться силами. p.s Поражение");

    }


    public Integer getQuestionIndex(int index,int indexAns) {
            int newIndex = distribution(index,indexAns);
            question = questionsList.get(newIndex);
            return newIndex;
    }

    public static String getQuestion() {
        return question;
    }

    private Integer distribution(int indexQues, int indexAns){
        int index = 0;
        switch (indexQues){
             case 1-> index = indexAns == 1 ? 2 : 9;
             case 2-> index = indexAns == 1 ? 3 : 4;
             case 3-> index = indexAns == 1 ? 5 : 15;
             case 4-> index = indexAns == 1 ? 6 : 7;
             case 5-> index = indexAns == 1 ? 6 : 8;
             case 9-> index = indexAns == 1 ? 10 : 11;
             case 10-> index = indexAns == 1 ? 14 : 11;
             case 11-> index = indexAns == 1 ? 12 : 13;
             case 12-> index = indexAns == 1 ? 2 : 13;
        }
        return index;
    }




}
