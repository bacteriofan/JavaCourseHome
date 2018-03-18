
package main.java.homework_2.task5;
import java.util.Iterator;
import java.util.List;

public class SearchOfGroups {

    public  static void Search(List<LogStudent> bd,String StudentV) {
        for (Iterator<LogStudent> iter = bd.iterator(); iter.hasNext(); ) {
            LogStudent elementLog = iter.next();
            elementLog.getLogEstimates();
            for (Iterator<EstimatesStudent> iter1 = elementLog.getLogEstimates().iterator(); iter1.hasNext(); ) {
                EstimatesStudent elementLogEstimatesStuden = iter1.next();
                Student Student = elementLogEstimatesStuden.getStudent();
                if (Student.getName().equals(StudentV)) {
                    System.out.println("Группа=" + elementLog.getGroup().getName() +
                            ", Дисциплина=" + elementLog.getGroup().getDiscipline() +
                            ", Студент=" + elementLogEstimatesStuden.getStudent().getName() +
                            ", Оценка=" + elementLogEstimatesStuden.getEstimates());

                }
            }


        }
    }
}
