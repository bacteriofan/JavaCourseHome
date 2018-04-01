
package main.java.homework_2.task5;

import java.util.List;

public class LogStudent  {
    private Group  Group;
    private List LogEstimates;

    public LogStudent(Group group, List logEstimates) {
        Group = group;
        LogEstimates = logEstimates;
    }

    public void setLogEstimates(EstimatesStudent EstimatesStudent) {
        LogEstimates.add(EstimatesStudent);
    }
    public Group getGroup() {
        return Group;
    }

    public List getLogEstimates() {
        return LogEstimates;
    }
}