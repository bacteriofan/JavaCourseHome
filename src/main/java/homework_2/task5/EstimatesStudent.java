
package main.java.homework_2.task5;

public class EstimatesStudent <T>{

    private Student student;//Студент
    private T Estimates;//Оценки

    public EstimatesStudent( Student student, T estimates) {

        this.student = student;
        Estimates = estimates;
    }

    public Student getStudent() {
        return student;
    }

    public T getEstimates() {
        return Estimates;
    }
}
