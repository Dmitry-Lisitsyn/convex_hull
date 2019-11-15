import java.util.Scanner;
import java.awt.*;
class ConvexTest {
    static Graphics g;
    public static int x1,x2,x3,y1,y2,y3;
    public static char answ;
    public static void main(String[] args) throws Exception {
        Convex convex = new Convex();
        int endline;
        Scanner first = new Scanner(System.in);
        MyFrame fr = new MyFrame(convex);
        System.out.println("Запустить программу 'rebra'? y/n");
        answ=first.next().charAt(0);
        if(answ=='y') {
            System.out.println("Задайте треугольник");
            System.out.println("Введите первую точку(x y)");
            x1 = first.nextInt();
            y1 = first.nextInt();
            System.out.println("Введите вторую точку(x y)");
            x2 = first.nextInt();
            y2 = first.nextInt();
            System.out.println("Введите третью точку(x y)");
            x3 = first.nextInt();
            y3 = first.nextInt();
        }

        while(true){
            //System.out.println("Введите количество точек:");
              //  endline = first.nextInt();
               // for(int i=0;i<endline;i++){

                    convex.add(new R2Point());
                System.out.println("S = " + convex.area() + " , P = "
                        + convex.perimeter() + " , rebra = " + convex.rebra());

           // }
            fr.repaint();
        }

    }
}
