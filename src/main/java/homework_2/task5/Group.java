
package main.java.homework_2.task5;

import java.util.List;
public class Group {
    private String  name; //Наименование
    private Discipline discipline; //Дисциплина
    private List logStudents;
    private String tipEstimates;


    public Group(String  nameV, Discipline disciplineV, List logStudentV, String tipEstimatesV) {
        this.name=nameV;
        this.discipline = disciplineV;
        this.logStudents = logStudentV;
        tipEstimates = tipEstimatesV;
    }

    public void setLogStudent(Student Student) {
        logStudents.add(Student);
    }

    public String getTipEstimates() {
        return tipEstimates;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public String getName() {
        return name;
    }
}

