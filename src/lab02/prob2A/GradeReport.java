package lab02.prob2A;

public class GradeReport {
    private Student student;
    private Double score;

    public GradeReport(Student student) {
        this.student = student;
        this.score = 0.0;
    }

    public Student getStudent() {
        return student;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double scr){
        this.score=scr;
    }

    @Override
    public String toString() {
        return "GradeReport{studentName='" + student.getName() + "', score=" + score + "}";
    }
}
