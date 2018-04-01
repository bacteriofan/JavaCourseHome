
package main.java.homework_2.task5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogStudentBD {

    public static List bd() {

        Student Ivanov = new Student("Ivanov");
        Student Petrov = new Student("Petrov");
        Student Sidorov = new Student("Sidorov");
        Student Chapkin = new Student("Chapkin");
        Student Chapa = new Student("Chapa");


//        MATHEMATICS
        Group GroupMathematic = new Group("K-2018",Discipline.MATHEMATICS, new ArrayList<Student>(), "int");
        GroupMathematic.setLogStudent(Ivanov);
        GroupMathematic.setLogStudent(Sidorov);
        GroupMathematic.setLogStudent(Chapa);

        LogStudent LogStudentMathematics=new LogStudent(GroupMathematic, new ArrayList<Student>());
        LogStudentMathematics.setLogEstimates(LogStudentBD(GroupMathematic.getTipEstimates(),  Ivanov));
        LogStudentMathematics.setLogEstimates(LogStudentBD(GroupMathematic.getTipEstimates(),  Sidorov));
        LogStudentMathematics.setLogEstimates(LogStudentBD(GroupMathematic.getTipEstimates(),  Chapa));
//INFORMATICS
        Group GroupInformatics = new Group("Ф-2018",Discipline.INFORMATICS, new ArrayList<Student>(), "int");
        GroupInformatics.setLogStudent(Ivanov);
        GroupInformatics.setLogStudent(Sidorov);
        GroupInformatics.setLogStudent(Chapa);

        LogStudent LogStudentInformatics=new LogStudent(GroupInformatics, new ArrayList<Student>());
        LogStudentInformatics.setLogEstimates(LogStudentBD(GroupInformatics.getTipEstimates(), Petrov));
        LogStudentInformatics.setLogEstimates(LogStudentBD(GroupInformatics.getTipEstimates(),  Sidorov));
        LogStudentInformatics.setLogEstimates(LogStudentBD(GroupInformatics.getTipEstimates(),  Chapa));
        //INFORMATICS
        Group GroupProgramming = new Group("Ж-2018",Discipline.PROGRAMMING, new ArrayList<Student>(), "double");
        GroupProgramming.setLogStudent(Ivanov);
        GroupProgramming.setLogStudent(Sidorov);
        GroupProgramming.setLogStudent(Chapa);

        LogStudent LogStudentProgramming=new LogStudent(GroupProgramming, new ArrayList());
        LogStudentProgramming.setLogEstimates(LogStudentBD(GroupProgramming.getTipEstimates(), Chapkin));
        LogStudentProgramming.setLogEstimates(LogStudentBD(GroupProgramming.getTipEstimates(), Ivanov));
        LogStudentProgramming.setLogEstimates(LogStudentBD(GroupProgramming.getTipEstimates(), Sidorov));

        List<LogStudent> bd =new ArrayList();
        bd.add(LogStudentMathematics);
        bd.add(LogStudentInformatics);
        bd.add(LogStudentProgramming);

        return  bd;

    }

    public static EstimatesStudent LogStudentBD(String TipEstimates,  Student FIO) {
        Scanner scan = new Scanner(System.in);

        if (TipEstimates == "int") {
//            System.out.println("Введите оценку целым числом для "+FIO.getName() );
//            int Estimates = scan.nextInt();

            int Estimates=5;

            EstimatesStudent<Integer> EstimatesStuden= new EstimatesStudent( FIO, Estimates);
            return EstimatesStuden;

        } else if (TipEstimates == "double") {
//            System.out.println("Введите оценку целым числом"+FIO.getName());
//           double Estimates = scan.nextDouble();

            double Estimates=5.5;

            EstimatesStudent<Double> EstimatesStuden= new EstimatesStudent( FIO, Estimates);
            return EstimatesStuden;
        }
        return null;
    }


}
