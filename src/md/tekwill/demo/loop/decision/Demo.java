package md.tekwill.demo.loop.decision;

class Demo {
    public static void main(String[] args) {
        StudentHighestScoreTracker tracker = new StudentHighestScoreTracker();

        System.out.println(tracker.getTopFirstStudentName() + " / " + tracker.getTopFirstHighestScore());
        System.out.println(tracker.getTopSecondStudentName() + " / " + tracker.getTopSecondHighestScore());

        tracker.computeTop2HighestScoreStudentsFrom(4);

        System.out.println(tracker.getTopFirstStudentName() + " / " + tracker.getTopFirstHighestScore());
        System.out.println(tracker.getTopSecondStudentName() + " / " + tracker.getTopSecondHighestScore());


    }
}
