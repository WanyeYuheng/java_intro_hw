package guru.qa;

public class First {

    public static void main(String[] args) {
        Sleeper respondentA = new Sleeper("Том", 13, 22, 6, true, 0);
        Sleeper respondentB = new Sleeper("Мэри", 30, 1, 6, false, 0);
        Sleeper respondentC = new Sleeper("Джон", 70, 2, 8, true, 0);

        respondentA.printRespondentPersonalData();
        respondentA.countSleepTime();
        respondentA.sleepAccordingToAge();
        respondentA.sleepRecommendation();

        respondentB.printRespondentPersonalData();
        respondentB.countSleepTime();
        respondentB.sleepAccordingToAge();
        respondentB.sleepRecommendation();

        respondentC.printRespondentPersonalData();
        respondentC.countSleepTime();
        respondentC.sleepAccordingToAge();
        respondentC.sleepRecommendation();
    }
}
