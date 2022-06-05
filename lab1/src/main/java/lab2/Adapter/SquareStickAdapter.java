package lab2.Adapter;

class SquareStickAdapter extends RoundStick {

    private SquareStick stick;

    public SquareStickAdapter(SquareStick stick) {
        this.stick = stick;
    }

    public int getRadius() { // вычисляется половина диагонали квадратной палки по теореме Пифагора.
        return (int) (stick.getWidth() * Math.sqrt(2) / 2);
    }

}