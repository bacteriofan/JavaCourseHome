
package main.java.homework_2.task5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchOfGroups {

    public static List  Search(List<LogStudent> bd,String StudentV) {
        List<String> ctr=new ArrayList<String>();

        for (Iterator<LogStudent> iter = bd.iterator(); iter.hasNext(); ) {
            LogStudent elementLog = iter.next();
            elementLog.getLogEstimates();
            for (Iterator<EstimatesStudent> iter1 = elementLog.getLogEstimates().iterator(); iter1.hasNext(); ) {
                EstimatesStudent elementLogEstimatesStuden = iter1.next();
                Student Student = elementLogEstimatesStuden.getStudent();
                if (Student.getName().equals(StudentV)) {

                    ctr.add("Группа=" + elementLog.getGroup().getName() +
                            ", Дисциплина=" + elementLog.getGroup().getDiscipline() +
                            ", Студент=" + elementLogEstimatesStuden.getStudent().getName() +
                            ", Оценка=" + elementLogEstimatesStuden.getEstimates());

                    //System.out.println("Группа=" + elementLog.getGroup().getName() +
                    //       ", Дисциплина=" + elementLog.getGroup().getDiscipline() +
                    //      ", Студент=" + elementLogEstimatesStuden.getStudent().getName() +
                    //      ", Оценка=" + elementLogEstimatesStuden.getEstimates());


                }
            }


        }
        return ctr;
    }
}
