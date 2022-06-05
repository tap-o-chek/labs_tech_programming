package lab2.Adapter;

//Адаптер преобразует один интерфейс в другой,
// позволяя совместить квадратные палки и круглые отверстия.
//Он вычисляет наименьший радиус окружности,
// в которую можно вписать квадратную палку,
// и представляет его как круглую палку с этим радиусом.

public class AdapterService {

    public void exec() {
        RoundHole hole = new RoundHole(10);
        RoundStick roundStick = new RoundStick(10);
        System.out.println(hole.fits(roundStick)); // TRUE

        SquareStick smallSquareStick = new SquareStick(15);
        SquareStick largeSquareStick = new SquareStick(30);

        SquareStickAdapter smallSquareStickAdapter = new SquareStickAdapter(smallSquareStick);
        SquareStickAdapter largeSquareStickAdapter = new SquareStickAdapter(largeSquareStick);

        System.out.println(hole.fits(smallSquareStickAdapter)); // true
        System.out.println(hole.fits(largeSquareStickAdapter)); // false
    }

}