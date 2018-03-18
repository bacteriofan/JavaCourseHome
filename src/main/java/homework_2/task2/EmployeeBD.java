

package main.java.homework_2.task2;

public class EmployeeBD {

    public  Employee[] bd(){
        Office[] OfficeAtTheEmployeeС1=new Office[3];

        Employee c1=new Employee("Иванов", "Директор", OfficeAtTheEmployeeС1);
        Office K1= new Office("Бумага",22.3,"Германия");
        OfficeAtTheEmployeeС1[0]=K1;
        Office K2= new Office("Ручка",55.3,"Чехия");
        OfficeAtTheEmployeeС1[1]=K2;
        Office K3= new Office("Файлы",33.1,"Чехия");
        OfficeAtTheEmployeeС1[2]=K3;
        Office[] OfficeAtTheEmployeeС2=new Office[3];
        Employee c2=new Employee("Темофеев", "Бух", OfficeAtTheEmployeeС2 );
        Office K4= new Office("Бумага",20.3,"Германия");
        OfficeAtTheEmployeeС2[0]=K4;
        Office K5= new Office("Ручка",50.3,"Турция");
        OfficeAtTheEmployeeС2[1]=K5;
        Office K6= new Office("Файлы",80.1,"Чехия");
        OfficeAtTheEmployeeС2[2]=K6;
        Office[] OfficeAtTheEmployeeС3=new Office[3];

        Employee c3=new Employee("Рожков", "секретарь", OfficeAtTheEmployeeС3 );
        Office K7= new Office("Бумага",25.3,"Россия");
        OfficeAtTheEmployeeС3[0]=K7;
        Office K8= new Office("Ручка",10.3,"Турция");
        OfficeAtTheEmployeeС3[1]=K8;
        Office K9= new Office("Файлы",20.1,"Чехия");
        OfficeAtTheEmployeeС3[2]=K9;

        Employee[] Employee=new Employee[3];
        Employee[0]=c1;
        Employee[1]=c2;
        Employee[2]=c3;
        return Employee;

    }
}

