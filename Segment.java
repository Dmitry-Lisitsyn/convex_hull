import java.awt.*;
import java.util.Random;


class Segment implements Figure {
    protected Color color=Color.magenta;
    private R2Point p, q;
    public Segment(R2Point p, R2Point q) {
        this.p = p; this.q = q;
    }
    public double perimeter() {
        return 2.0 * R2Point.dist(p, q);
    }
    public double area() {
        return 0.0;
    }
    public int rebra(){
        return 0;
    }
    public Figure add(R2Point r) {
        if (R2Point.isTriangle(p, q, r))
            return new Polygon(p, q, r);
        if (q.inside(p, r)) q = r;
        if (p.inside(r, q)) p = r;
        return this;
    }
    public void draw(Graphics g) {
        //////////////////////
        g.setColor(Color.GREEN);
        g.fillOval((int)p.x-5, (int)p.y-5, 10, 10);
        g.fillOval((int)q.x-5, (int)q.y-5, 10, 10);
        g.setColor(Color.RED);
        g.drawLine((int)p.x, (int)p.y,(int)q.x, (int)q.y);
    }
}