
package main.java.homework_2.task1;
import java.util.Objects;

public class Pen {
        private String  Name; //Наименование
        private String CoreType; //Тип стержня
        private Double  Cost; //Стоимость

        public Pen(String name, String coreType, Double cost) {
            Name = name;
            CoreType = coreType;
            Cost = cost;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pen pen = (Pen) o;
            return Objects.equals(Name, pen.Name) &&
                    Objects.equals(CoreType, pen.CoreType) &&
                    Objects.equals(Cost, pen.Cost);
        }

        @Override
        public int hashCode() {

            return Objects.hash(Name, CoreType, Cost);
        }

        @Override
        public String toString() {
            return "Pen{" +
                    "Name='" + Name + '\'' +
                    ", CoreType='" + CoreType + '\'' +
                    ", Cost=" + Cost +
                    '}';
        }

        public Double getCost() {
            return Cost;
        }
    }
