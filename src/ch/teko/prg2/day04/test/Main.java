package ch.teko.prg2.day04.test;

public class Main {
    public static void main(String[] args) {
        // to be implemented
        IForms2D rectangle = new Rectangle();

        // to be implemented

        class Rectangle implements IForms2D {

            public Rectangle() {
            }

            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        }



        public double getWidth() {
            return width;
        }

        public double getLength() {
            return length;
        }

        // to be implemented



    };

        System.out.printf("Die Fläche beträgt: %f \n", rectangle.getArea());
        System.out.printf("Die Umfang beträgt: %f", rectangle.getPerimeter());
}
}
