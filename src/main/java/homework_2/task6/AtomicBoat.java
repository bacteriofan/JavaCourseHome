package main.java.homework_2.task6;

public class AtomicBoat {
    private int x;
    private int y;

    public AtomicBoat(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    class TheengineFortheAtomicBoat implements Plit{
        @Override
        public int Forward(int ras) {
            return x+=ras;
        }
        @Override
        public int Back(int ras) {
            return x-= ras;
        }
        @Override
        public int Up(int ras) {
            return y+= ras;
        }
        @Override
        public int Down(int ras) {
            return y-= ras;
        }
    }

    public Plit creatTheengineFortheAtomicBoat(){
        return new TheengineFortheAtomicBoat();
    }

}


