package june.hodor.together.springplayground.chapter3;

public class DessertWithParam implements Dessert {

    MyParam param;

    public DessertWithParam(MyParam param) {
        this.param = param;
    }


    public static class MyParam {
        private int value;

        public MyParam(int value) {
            this.value = value;
            System.out.println(value);
        }
    }

}
