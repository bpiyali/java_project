package daysofCode.day12;

public class Student extends Person {
    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores){
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public String calculate(){
        String grade = "";
        int len = testScores.length;
        int sum =0;
        for(int testScore : testScores){
            sum += testScore;
        }
        int avg = sum / len;
        if(avg<=100 && avg >= 90)
            grade = "O";
        else if(avg < 90 && avg >= 80)
            grade = "E";
        else if(avg < 80 && avg >= 70)
            grade = "A";
        else if(avg < 70 && avg >= 55)
            grade = "P";
        else if(avg < 55 && avg >= 40)
            grade = "D";
        else if(avg < 40)
            grade = "T";

        return grade;
    }
}
