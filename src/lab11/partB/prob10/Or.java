package lab11.partB.prob10;

import java.util.Arrays;
import java.util.List;

public class Or {

    public static void main(String[] args) {
        List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
        Or main = new Or();
        System.out.println(main.someSimpleIsTrue(list));

    }

    public boolean someSimpleIsTrue(List<Simple> list) {
        return list.stream().map(s->s.flag).reduce(false, (b1, b2)->b1||b2);
    }

}