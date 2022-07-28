package guru.qa;

public class Sleeper {

    String name;
    private int age;
    private int wentToSleepAt;
    private int wokeUpAt;
    private boolean isRested;
    private int sleepTime;


    public Sleeper(String name, int age, int wentToSleepAt, int wokeUpAt, boolean isRested, int sleepTime) {
        this.name = name;
        this.age = age;
        this.wentToSleepAt = wentToSleepAt;
        this.wokeUpAt = wokeUpAt;
        this.isRested = isRested;
        this.sleepTime = sleepTime;
    }

    public void printRespondentPersonalData() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    public void sleepAccordingToAge() {
        if (age <= 6) {
            System.out.println("Детям необходимо спать 10-17 часов");
        } else if (6 <= age && age <= 13) {
            System.out.println("Вам необходимо спать 9-12 часов");
        } else if (14 <= age && age <= 17) {
            System.out.println("Вам необходимо спать 8-10 часов");
        } else if (18 <= age && age <= 65) {
            System.out.println("Вам необходимо спать 7-9 часов");
        } else {
            System.out.println("В старшем возрасте сон фрагментарный, может понадобиться дневной отдых");
        }
    }

    public void countSleepTime() {
        if (wentToSleepAt >= 18) {
            int sleepTime = 24 - wentToSleepAt + wokeUpAt;
            System.out.println("Время сна: "+ sleepTime + " ч.");
        } else {
            int sleepTime = wokeUpAt - wentToSleepAt;
            System.out.println("Время сна: "+ sleepTime + " ч.");
        }
    }

    public void sleepRecommendation() {
        if (isRested && 7 <= sleepTime) {
            System.out.println("Кажется, это норма сна. Так держать!");
        } else if (isRested && sleepTime <= 7) {
            System.out.println("Неплохо, но усталость имеет свойство накапливаться - стоит пересмотреть режим.");
        } else {
            System.out.println("Пора кардинально пересмотреть режим - калькулятор сна может помочь.");
        }
    }
}