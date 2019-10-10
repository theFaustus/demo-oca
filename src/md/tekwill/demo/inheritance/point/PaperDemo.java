package md.tekwill.demo.inheritance.point;

class PaperDemo {
    public static void main(String[] args) {
        MovablePoint a = new MovablePoint(2, 3);
        MovablePoint b = new MovablePoint(0, 2);
        MovablePoint c = new MovablePoint(2, 0);
        MovablePoint d = new MovablePoint(-1, 1);

        System.out.println(a);
        a.move();
        System.out.println(a);
        System.out.println();
        System.out.println(b);
        b.move();
        System.out.println(b);
        System.out.println();
        System.out.println(c);
        c.move();
        System.out.println(c);
        System.out.println();
        System.out.println(d);
        d.move();
        System.out.println(d);

        MovablePoint[] movablePoints = {a, b, c, d};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < movablePoints.length; j++) {
                System.out.println(movablePoints[j]);
                movablePoints[j].move();
                System.out.println(movablePoints[j]);
            }
        }

        MovablePoint ab = a.move();
        MovablePoint abc = ab.move();

        abc.move().move().move().move().move().move().move().move();
        b.moveUp().moveDown().moveDown().moveLeft();

    }
}
