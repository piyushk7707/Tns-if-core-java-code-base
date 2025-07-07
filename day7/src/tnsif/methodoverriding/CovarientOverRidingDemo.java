package tnsif.methodoverriding;

public class CovarientOverRidingDemo {

    static class Colour {
        protected Colour getColour() {
            return new Colour();
        }
    }

    static class Red extends Colour {
        @Override
        protected Red getColour() {
            return new Red();
        }
    }

    static class Blue extends Colour {
        @Override
        protected Blue getColour() {
            return new Blue();
        }
    }

    public static void main(String[] args) {
        Colour c1 = new Red();
        Colour c2 = new Blue();

        Colour r = c1.getColour();
        Colour b = c2.getColour();

        System.out.println("Returned object type from c1: " + r.getClass().getSimpleName());
        System.out.println("Returned object type from c2: " + b.getClass().getSimpleName());
    }
}