package Homework3;

    import java.util.Scanner;


    public class ThreeProgram {

        private static Scanner scan = new Scanner(System.in);

        private static double a,b,c;

        public static void main(String [] at) {



            System.out.println("Введите коэффицент а ");
            a=scan.nextDouble();
            System.out.println("Введите коэффицент b ");
            b=scan.nextDouble();
            System.out.println("Введите коэффицент c ");
            c=scan.nextDouble();

            roots(a, b, c);
        }




        static void roots (double a,double b,double c) {


            if(a==0) {
                System.out.println("Первый коэффициент не может быть 0");
            }

            else {

                double d = b*b-4*a*c;


                if(d<0) {
                    System.out.println("Нет действительных решений уравнения");
                }

                else if(d==0) {

                    double x1 = -b/(2*a);

                    System.out.println("Уравнение имеет один действительный корень "
                            +String.format("%.3f", x1));

                }

                else {

                    double x1 = (-b+Math.sqrt(d))/(2*a);
                    double x2 = (-b-Math.sqrt(d))/(2*a);

                    System.out.println("Уравнение имеет два действительных корня "
                            +String.format("%.3f", x1) + " и "+String.format("%.3f", x2));
                }
            }

        }


    }
