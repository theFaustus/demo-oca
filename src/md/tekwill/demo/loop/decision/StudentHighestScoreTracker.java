package md.tekwill.demo.loop.decision;

import java.util.Scanner;

class StudentHighestScoreTracker {

    private String topFirstStudentName = "Unknown";
    private int topFirstHighestScore = 0;
    private String topSecondStudentName = "Unknown";
    private int topSecondHighestScore = 0;

    public void computeTop2HighestScoreStudentsFrom(int numberOfStudents) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter student name > ");
            String studentName = in.nextLine();
            System.out.println("Enter score >");
            int studentScore = in.nextInt();
            in.nextLine();

            if (studentScore > topFirstHighestScore) {
                topFirstHighestScore = studentScore;
                topFirstStudentName = studentName;
                continue;
            }
            if (studentScore > topSecondHighestScore) {
                topSecondHighestScore = studentScore;
                topSecondStudentName = studentName;
            }
        }
    }

    public String getTopFirstStudentName(){
        return topFirstStudentName;
    }

    public String getTopSecondStudentName(){
        return topSecondStudentName;
    }

    public int getTopFirstHighestScore(){
        return topFirstHighestScore;
    }

    public int getTopSecondHighestScore(){
        return topSecondHighestScore;
    }

}
