import java.util.Scanner;

import static java.util.Collections.max;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//        39


    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        double pi = 3.14;

//        mantiqiy misollar Azizbek Rajabov 1-misol

//        int amuD = 2540;
//        int sirD = amuD + 479;
//        System.out.println("sirdaryoning uzunligi=" + sirD);

//        2
//        int nurCH=123;
//        int sherCH=nurCH+45;
//        System.out.println("Sherali Cho'ponda="+sherCH+ " " + "ikkala cho'ponda "+ nurCH+sherCH);

//        4

//        int obod = 23;
//        int ozod = obod - 4;
//        System.out.println("Ozod qishlog‘igacha bo‘lgan yo‘l: " + ozod + " km");

//        5
//        int sm = 100;
//        int mm = 1000;
//        System.out.println("1 metr = " + sm + " sm, " + mm + " mm");

//        6
//        int pul = 2500;
//        int daftar = 500;
//        int muzqaymoq = 600;
//        int xarid = daftar + muzqaymoq;
//        int qoldiq = pul - xarid;
//        System.out.println("Xarid: " + xarid + " so‘m");
//        System.out.println("Qolgan pul: " + qoldiq + " so‘m");

//        7
//        int kinoteatr = 1200;
//        int maktab = 850;
//        int farq = kinoteatr - maktab;
//        System.out.println("Maktab masofasi kinoteatrdan " + farq + " m qisqa");

//      8
//        System.out.println("C va D nuqtalar AB kesmani 3 qismga ajratadi: AC, CD, DB");

//        9
//        int AC = 56;
//        int CB = AC + 23;
//        int AB = AC + CB;
//        System.out.println("AB kesma uzunligi: " + AB + " sm");

//        11

//        int kartoshka = 2, lavlagi = 3, sabzi = 5, karam = 5;
//        int meva = 4 + 2 + 3; // olma, nok, olxo‘ri
//        int sabzavot = kartoshka + lavlagi + sabzi + karam;
//        System.out.println("Meva: " + meva + " kg, Sabzavot: " + sabzavot + " kg");


//        12
//        int first = 125;
//        int second = first + 42;
//        int third = second + 28;
//        int total = first + second + third;
//        System.out.println("Jami kartoshka: " + total + " t");

//        13
//        int asilbek = 12750; // 12 kg 750 g
//        int shohruh = asilbek + 8500;
//        int total = asilbek + shohruh;
//        System.out.println("Jami pomidor: " + total + " g = " + total / 1000.0 + " kg");

//        14
//        int masofa = 1050;
//        int yurilgan = 685;
//        int qolgan = masofa - yurilgan;
//        System.out.println("Qolgan yo‘l: " + qolgan + " km");

//        15
//        int AB = 48;
//        int CB = 29;
//        int AC = AB - CB;
//        System.out.println("AC kesma: " + AC + " sm");

//        16
//        int suv = 1000;
//        int benzin = suv - 270;
//        System.out.println("Benzin massasi: " + benzin);

//        17
//        int c = 21;
//        int first = 56;
//        int second = first + c;
//        int third = second - 24;
//        int total = first + second + third;
//        System.out.println("Kitob jami: " + total + " bet");

//        18
//        int son = 142 - 74 - 21;
//        System.out.println("18: " + son);

//        19
//        int y = (144 + 12 - 24) / 3;
//        System.out.println("19: " + y);

//        20
//        int x = (62 - 8 + 3) / 3;
//        System.out.println("20: " + x);

//        21

//            int daftars = 10;
//            int ortiq = 6;
//            int yetishmaydi = 5;
//
//            int jami = daftars * ortiq + ortiq; // 10x + 6 = 11x - 5 => x = 11
//            int bolalar = jami / (daftars + 1);
//
//            System.out.println("21: " + bolalar);
//
//
//
//            int ikkiOrkachli = 17;
//            int birOrkachli = 24 - ikkiOrkachli;
//            System.out.println("22: " + birOrkachli);
//
//
//            int boyi = 516;
//            int eni = boyi - 145;
//            int perimetr = 2 * (boyi + eni);
//            System.out.println("23: " + perimetr);
//
//
//            int nargiza = 5;
//            int dono = nargiza + 7;
//            int ota = dono * 3;
//            System.out.println("24: Dono - " + dono + ", Ota - " + ota);
//
//
//            int birinchi = 27;
//            int ikkinchi = birinchi * 3;
//            int jami = birinchi + ikkinchi;
//            System.out.println("25: " + jami);
//
//
//            int masofa = 6 * 4;
//            int vaqt = masofa / 8;
//            System.out.println("26: " + vaqt);
//
//
//            int ishchi1 = 57;
//            int ishchi2 = ishchi1 - 12;
//            int jami = (ishchi1 + ishchi2) * 5;
//            System.out.println("27: " + jami);
//
//
//            int qarich = 192 / 16;
//            System.out.println("28: " + qarich);
//
//
//            int choyshab = 200 / 6;
//            int ortiq = 200 % 6;
//            System.out.println("29: " + choyshab + " choyshab, " + ortiq + " m ortadi");
//
//
//
//            int narx = (10000 - 100) / 55;
//            System.out.println("30: " + narx);
//
//
//
//            int soni = 5000 / 450;
//            int ortiq = 5000 % 450;
//            System.out.println("31: " + soni + " dona, " + ortiq + " so'm ortadi");
//
//
//            int bidonlar = 200 / 32;
//            int oxirgi = 200 % 32;
//            System.out.println("32: " + bidonlar + " to‘liq, " + oxirgi + " litr oxirgida");
//
//
//            int birinchi = 2350 / 5;
//            System.out.println("33: " + birinchi);
//
//
//            int tuz = (2 * 14) / (5 + 2);
//            System.out.println("34: " + tuz);
//
//
//
//            int son = 1500 / (15 + 45);
//            System.out.println("35: " + son);
//
//
//            double massa = 7.8;
//            double jami = 25 + 9 + 5;
//            double qum = 25 * massa / jami;
//            System.out.println("36: " + qum);
//



//      6
//        System.out.print("B son kiriting> ");
//        int a=scannerInt.nextInt();
//        System.out.print("A son kiriting> ");
//        int b=scannerInt.nextInt();
//        System.out.print("C son kiriting> ");
//        int c=scannerInt.nextInt();
//        System.out.println("V="+a*b*c+" "+ "S="+2*(a*b+b*c+a*c));

//      7
//        System.out.print("R son kiriting> ");
//        int r = scannerInt.nextInt();
//        System.out.println("L=" + 2 * 3.14 * r + " " + "S=" +3.14 * r * r);

//      8

//        System.out.print("B son kiriting> ");
//        int a=scannerInt.nextInt();
//        System.out.print("A son kiriting> ");
//        int b=scannerInt.nextInt();
//
//        System.out.println("o'rta arifmetik ="  + (a+b)/2 );

//        9
//        System.out.print("A son kiriting> ");
//        int a=scannerInt.nextInt();
//        System.out.print("B son kiriting> ");
//        int b=scannerInt.nextInt();
//        System.out.println("o'rta Gemoetrik ="  + Math.sqrt(a*b));

//        10
//        System.out.print("A son kiriting> ");
//        int a = scannerInt.nextInt();
//        System.out.print("B son kiriting> ");
//        int b = scannerInt.nextInt();
//        System.out.println("Yig'indisi =" + a + b + " ko'paytmasi=" + a * b + "Kvadratlari= " + a * a + " " + b * b);
//         11
//        System.out.print("A son kiriting> ");
//        int a = scannerInt.nextInt();
//        System.out.print("B son kiriting> ");
//        int b = scannerInt.nextInt();
//        System.out.println("Yig'indisi =" + a + b + " ko'paytmasi=" + a * b + "moduli= " + Math.abs(a) + " " + Math.abs(b));

//        12
//        System.out.print("A son kiriting> ");
//        int a = scannerInt.nextInt();
//        System.out.print("B son kiriting> ");
//        int b = scannerInt.nextInt();
//        int C= Math.sqrt(a*a+b*b) "

//        System.out.println("C=" +C + " P=" + a + b + C);
//
//        13
//        System.out.print("R1 son kiriting> ");
//        int r1 = scannerInt.nextInt();
//        System.out.print("R2 son kiriting> ");
//        int r2 = scannerInt.nextInt();
//        if (r1<r2) System.out.println("R1>R2 Shart qanoatlantirilsin") ;
//        else {
//            double S1=3.14*r1;
//            double S2=3.14*r2;
//            double S3=3.14*(r1-r2);
//
//            System.out.println("C1=" + S1 + " S2=" + S2 + " S3=" + S3);
//        }

//        14

//        System.out.print("L son kiriting> ");
//        int l = scannerInt.nextInt();
//        double R = l / (2 * pi);
//        double S = pi * R*R;
//        System.out.println("R=" + R + " S=" + S );

//        15

//        System.out.print("L son kiriting> ");
//        int S = scannerInt.nextInt();
//
//        double R = Math.sqrt(S/pi);
//        double L = 2*pi*R;
//        System.out.println("R=" + R + " S=" + S );

//      16

//        System.out.print("X1 son kiriting> ");
//        int x1 = scannerInt.nextInt();
//        System.out.print("X2 son kiriting> ");
//        int x2 = scannerInt.nextInt();
//
//        System.out.println("|X2-X1|="+ Math.abs(x2-x1));

//      17

//        System.out.print("A nuqtani kiriting: ");
//        int A = scannerInt.nextInt();
//
//        System.out.print("B nuqtani kiriting: ");
//        int B = scannerInt.nextInt();
//
//        System.out.print("C nuqtani kiriting: ");
//        int C = scannerInt.nextInt();
//
//        int AC = Math.abs(C - A);
//        int BC = Math.abs(C - B);
//
//        int sum = AC + BC;
//
//        System.out.println("AC kesma uzunligi: " + AC);
//        System.out.println("BC kesma uzunligi: " + BC);
//        System.out.println("AC + BC = " + sum);


//    18


//        System.out.print("A nuqtani kiriting: ");
//        int A = scannerInt.nextInt();
//
//        System.out.print("B nuqtani kiriting: ");
//        int B = scannerInt.nextInt();
//
//        System.out.print("C nuqtani kiriting: ");
//        int C = scannerInt.nextInt();
//
//        if ((C > A && C < B) || (C > B && C < A)) {
//            int AC = Math.abs(C - A);
//            int BC = Math.abs(C - B);
//
//            int product = AC * BC;
//
//            System.out.println("AC kesma uzunligi: " + AC);
//            System.out.println("BC kesma uzunligi: " + BC);
//            System.out.println("Ko‘paytma (AC * BC): " + product);
//        } else {
//            System.out.println("Xatolik: C nuqta A va B orasida emas!");
//        }


//        19


//        System.out.print("x1 ni kiriting: ");
//        int x1 = scannerInt.nextInt();
//
//        System.out.print("y1 ni kiriting: ");
//        int y1 = scannerInt.nextInt();
//
//        System.out.print("x2 ni kiriting: ");
//        int x2 = scannerInt.nextInt();
//
//        System.out.print("y2 ni kiriting: ");
//        int y2 = scannerInt.nextInt();
//        int length = Math.abs(x2 - x1);
//        int width = Math.abs(y2 - y1);
//
//        int perimeter = 2 * (length + width);
//        int area = length * width;
//
//        System.out.println("Perimetri: " + perimeter);
//        System.out.println("Yuzasi: " + area);

//        20
//
//        System.out.print("x1: ");
//        double x1 = scannerInt.nextDouble();
//        System.out.print("y1: ");
//        double y1 = scannerInt.nextDouble();
//        System.out.print("x2: ");
//        double x2 = scannerInt.nextDouble();
//        System.out.print("y2: ");
//        double y2 = scannerInt.nextDouble();
//        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//        System.out.println(result);

//        21

//        System.out.print("x1: ");
//        double x1 = scannerInt.nextDouble();
//        System.out.print("y1: ");
//        double y1 = scannerInt.nextDouble();
//        System.out.print("x2: ");
//        double x2 = scannerInt.nextDouble();
//        System.out.print("y2: ");
//        double y2 = scannerInt.nextDouble();
//        System.out.print("x3: ");
//        double x3 = scannerInt.nextDouble();
//        System.out.print("y3: ");
//        double y3 = scannerInt.nextDouble();
//
//        double a = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1)); // AB
//        double b = Math.sqrt((x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2)); // BC
//        double c = Math.sqrt((x1 - x3)*(x1 - x3) + (y1 - y3)*(y1 - y3)); // CA
//
//        double p = (a + b + c) / 2;
//        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
//
//        System.out.println("Tomonlar uzunligi: a = " + a + ", b = " + b + ", c = " + c);
//        System.out.println("Perimetri = " + (a + b + c));
//        System.out.println("Yuzasi = " + S);


//        22
//        System.out.print("A Sonni kiriting: ");
//        int A = scannerInt.nextInt();
//
//        System.out.print("B Sonni kiriting: ");
//        int B = scannerInt.nextInt();
//
//        int temp = A;
//        A = B;
//        B = temp;
//
//        System.out.println("Qiymatlar almashtirildi:");
//        System.out.println("A = " + A);
//        System.out.println("B = " + B);

//        23

//        System.out.print("A = "); int A = scannerInt.nextInt();
//        System.out.print("B = "); int B = scannerInt.nextInt();
//        System.out.print("C = "); int C = scannerInt.nextInt();
//
//        int temp = A;
//        A = B;
//        B = C;
//        C = temp;
//
//        System.out.println("Begin23 natija:");
//        System.out.println("A = " + A);
//        System.out.println("B = " + B);
//        System.out.println("C = " + C);
//
//        // 24
//
//        System.out.print("A = "); A = scannerInt.nextInt();
//        System.out.print("B = "); B = scannerInt.nextInt();
//        System.out.print("C = "); C = scannerInt.nextInt();
//
//        temp = A;
//        A = C;
//        C = B;
//        B = temp;
//
//        System.out.println("A = " + A);
//        System.out.println("B = " + B);
//        System.out.println("C = " + C);

//        25


//        System.out.print("x = ");
//        int x = scannerInt.nextInt();
//        double y=3*Math.pow(x,6)-6*Math.pow(x,2)-7;
//
//        System.out.println("Y="+y);


//        26
//        System.out.print("x = ");
//        int x = scannerInt.nextInt();
//        double y=4*Math.pow((x-3),6)-7*Math.pow((x-3),3)+2;
//        System.out.println("Y="+y);
//
//        27

//        System.out.print("A = ");
//        int a = scannerInt.nextInt();
//        System.out.println("a^2 = " + Math.pow((a),2) + ", a^4 = " + Math.pow((a),4) + ", a^8 = " + Math.pow((a),8));

//        28
//        System.out.print("A = ");
//        int a = scannerInt.nextInt();
//        System.out.println("a^2 = " + Math.pow((a), 2) + ", a^3 = " + Math.pow((a), 3) + ", a^5 = " + Math.pow((a), 5)+ ", a^15 = " + Math.pow((a), 15));

//      29
//        System.out.print("A = ");
//        int gradus = scannerInt.nextInt();
//        if (0 > gradus || gradus > 360) System.out.println("xatolik");
//        gradus × π / 180
//        else{
//            System.out.println("Radian="+gradus*pi/180);
//        }

//        30

//        System.out.print("A = ");
//        int radian = scannerInt.nextInt();
//        gradus = radian × 180 / π
//        System.out.println("gradus="+radian*180/pi);

//      31-32

//        System.out.print("TF = ");
//        int TF = scannerInt.nextInt();
//        double TC = (TF - 32) * 5 / 9;
//        System.out.println(TC);

//        33

//        System.out.print("X kg A konfeti narxi: ");
//        double x = scannerInt.nextDouble();
//        System.out.print("Y kg B konfeti narxi: ");
//        double y = scannerInt.nextDouble();
//        System.out.print("1 kg A: ");
//        double A = scannerInt.nextDouble();
//        System.out.print("1 kg B: ");
//        double B = scannerInt.nextDouble();
//
//        double total = x * A + y * B;
//        System.out.println("Jami narxi: " + total);

//        34

//        System.out.print("1 kg shokolad narxi: ");
//        double chPrice = scannerInt.nextDouble();
//        System.out.print("1 kg konfet narxi: ");
//        double kPrice = scannerInt.nextDouble();
//        System.out.print("X kg shokolad: ");
//        double x = scannerInt.nextDouble();
//        System.out.print("Y kg konfet: ");
//        double y = scannerInt.nextDouble();
//
//        double total = x * chPrice + y * kPrice;
//        System.out.println("Jami narxi: " + total);


//        35

//        System.out.print("Qayiqning tezligi (V): ");
//        double V = scannerInt.nextDouble();
//        System.out.print("Daryo oqimi tezligi (U): ");
//        double U = scannerInt.nextDouble();
//        System.out.print("Oqim bo'yicha vaqt T1: ");
//        double T1 = scannerInt.nextDouble();
//        System.out.print("Oqimga qarshi vaqt T2: ");
//        double T2 = scannerInt.nextDouble();
//
//        double S = (V + U) * T1 + (V - U) * T2;
//        System.out.println("Qayiq yurgan masofa: " + S);


//        36

//        System.out.print("V1 tezlik: ");
//        double V1 = scannerInt.nextDouble();
//        System.out.print("V2 tezlik: ");
//        double V2 = scannerInt.nextDouble();
//        System.out.print("Boshlang'ich masofa S: ");
//        double S = scannerInt.nextDouble();
//        System.out.print("Vaqt T: ");
//        double T = scannerInt.nextDouble();
//
//        double distance = S + (V1 + V2) * T;
//        System.out.println("Oraliq masofa: " + distance);

//        37

//        System.out.print("V1 tezlik: ");
//        double V1 = scannerInt.nextDouble();
//        System.out.print("V2 tezlik: ");
//        double V2 = scannerInt.nextDouble();
//        System.out.print("Boshlang'ich masofa S: ");
//        double S = scannerInt.nextDouble();
//        System.out.print("Vaqt T: ");
//        double T = scannerInt.nextDouble();
//
//        double distance = Math.abs(S - (V1 + V2) * T);
//        System.out.println("Oraliq masofa: " + distance);

//
//        38

//        System.out.print("A: ");
//        double A = scannerInt.nextDouble();
//        System.out.print("B: ");
//        double B = scannerInt.nextDouble();
//
//        if (A != 0) {
//            double x = -B / A;
//            System.out.println("Yechim: x = " + x);
//        } else {
//            System.out.println("A 0 bo'lishi mumkin emas.");

//    39

//        System.out.print("A: ");
//        double A = scannerInt.nextDouble();
//        System.out.print("B: ");
//        double B = scannerInt.nextDouble();
//        System.out.print("C: ");
//        double C = scannerInt.nextDouble();
//
//        if (A == 0) {
//            System.out.println("Kvadrat tenglama emas (A = 0).");
//        } else {
//            double D = B * B - 4 * A * C;
//            System.out.println("Diskriminant D = " + D);
//
//            if (D > 0) {
//                double x1 = (-B + Math.sqrt(D)) / (2 * A);
//                double x2 = (-B - Math.sqrt(D)) / (2 * A);
//                System.out.println("2 ta haqiqiy yechim: x1 = " + x1 + ", x2 = " + x2);
//            } else if (D == 0) {
//                double x = -B / (2 * A);
//                System.out.println("Bitta yechim: x = " + x);
//            } else {
//                System.out.println("Haqiqiy yechim yo'q (kompleks ildizlar mavjud).");
//            }
//        }


//        40


//        double A1 = scannerInt.nextDouble();
//        double B1 = scannerInt.nextDouble();
//        double C1 = scannerInt.nextDouble();
//        double A2 = scannerInt.nextDouble();
//        double B2 = scannerInt.nextDouble();
//        double C2 = scannerInt.nextDouble();
//
//        double D = A1 * B2 - A2 * B1;
//        if (D != 0) {
//            double x = (C1 * B2 - C2 * B1) / D;
//            double y = (A1 * C2 - A2 * C1) / D;
//            System.out.println("Yechim: x = " + x + ", y = " + y);
//        } else {
//            System.out.println("Tizimda yechim yo'q yoki cheksiz.");
//        }


//        *-**-*-**-*-*-*****************************************************************************


//        shart operatorlariga oid masalalar


//        1
//        System.out.print("Son kiriting= ");
//        int num = scannerInt.nextInt();
//        if (num < 0) System.out.println(num);
//        else System.out.println(++num);

//        2
//        System.out.print("Son kiriting= ");
//        int num = scannerInt.nextInt();
//        if (num < 0) System.out.println(num-2);
//        else System.out.println(num+1);
//        3
//
//        System.out.print("Son kiriting= ");
//        int num = scannerInt.nextInt();
//        if (num < 0) System.out.println(num-2);
//        else if (num==0) System.out.println(num+10);
//        else System.out.println(num+1);

//        4

//        System.out.print("A: ");
//        int a = scannerInt.nextInt();
//        System.out.print("B: ");
//        int b = scannerInt.nextInt();
//        System.out.print("C: ");
//        int c = scannerInt.nextInt();
//
//        int count = 0;
//
//        if (a > 0) count++;
//        if (b > 0) count++;
//        if (c > 0) count++;
//
//        System.out.println("Musbatlar="+count);

//        5

//        System.out.print("A: ");
//        int a = scannerInt.nextInt();
//        System.out.print("B: ");
//        int b = scannerInt.nextInt();
//        System.out.print("C: ");
//        int c = scannerInt.nextInt();

//        int musbat = 0, manfiy = 0;
//
//        if (a > 0) musbat++; else if (a < 0) manfiy++;
//        if (b > 0) musbat++; else if (b < 0) manfiy++;
//        if (c > 0) musbat++; else if (c < 0) manfiy++;
//        System.out.println("Musbat: " + musbat + ", Manfiy: " + manfiy);


//        6

//        int a = scannerInt.nextInt();
//        int b = scannerInt.nextInt();
//
//        int max = (a > b) ? a : b;
//        System.out.println("Katta son: " + max);

//        7

//        System.out.print("A: ");
//        int a = scannerInt.nextInt();
//        System.out.print("B: ");
//        int b = scannerInt.nextInt();
//
//        if (a < b) System.out.println("Kichik son: 1");
//        else System.out.println("Kichik son: 2");

//        8

//        System.out.print("A: ");
//        int a = scannerInt.nextInt();
//        System.out.print("B: ");
//        int b = scannerInt.nextInt();
//
//        if (a > b) {
//            System.out.println("Katta: " + a);
//            System.out.println("Kichik: " + b);
//        } else {
//            System.out.println("Katta: " + b);
//            System.out.println("Kichik: " + a);


//        9

//        double a = scannerInt.nextDouble();
//        double b = scannerInt.nextDouble();
//
//        if (a > b) {
//            double temp = a;
//            a = b;
//            b = temp;
//        }else System.out.println("xatolik");
//
//        System.out.println("A: " + a);
//        System.out.println("B: " + b);


//      10

//        int a = scannerInt.nextInt();
//        int b = scannerInt.nextInt();
//
//        if (a != b) System.out.println(a + b);
//        else System.out.println(0);
//        System.out.println("A: " + a);
//        System.out.println("B: " + b);

//        11

//        int a = scannerInt.nextInt();
//        int b = scannerInt.nextInt();
//
//        if (a != b) {
//            int max = Math.max(a, b);
//            a = max;
//            b = max;
//        } else {
//            a = 0;
//            b = 0;
//        }
//
//        System.out.println("A: " + a);
//        System.out.println("B: " + b);
//

//        12

//        int a = scannerInt.nextInt();
//        int b = scannerInt.nextInt();
//        int c = scannerInt.nextInt();
//
//        int min = Math.min(a, b);
//        if (min>c) System.out.println(c);
//        else System.out.println(min);

//         13

//        int a = scannerInt.nextInt();
//        int b = scannerInt.nextInt();
//        int c = scannerInt.nextInt();
//        int num;
//        if ((a > b && a < c) || (a > c && a < b)) {
//            num = a;
//        } else if ((b > a && b < c) || (b > c && b < a)) {
//            num = b;
//        } else {
//            num = c;
//        }
//        System.out.println(num);

//        14

//        int a = scannerInt.nextInt();
//        int b = scannerInt.nextInt();
//        int c = scannerInt.nextInt();
//
//        int max = a;
//        int min = a;
//
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//
//        if (b < min) {
//            min = b;
//        }
//        if (c < min) {
//            min = c;
//        }
//
//        System.out.println("katta: " + max);
//        System.out.println("kichik: " + min);


//        15

//        int a = scannerInt.nextInt();
//        int b = scannerInt.nextInt();
//        int c = scannerInt.nextInt();

//        int sumAB = a + b;
//        int sumAC = a + c;
//        int sumBC = b + c;
//
//        if (sumAB >= sumAC && sumAB >= sumBC) {
//            System.out.println("Eng katta yig‘indi: a + b = " + sumAB);
//            System.out.println( a + " va " + b);
//        } else if (sumAC >= sumAB && sumAC >= sumBC) {
//            System.out.println("Eng katta yig‘indi: a + c = " + sumAC);
//            System.out.println( a + " va " + c);
//        } else {
//            System.out.println("Eng katta yig‘indi: b + c = " + sumBC);
//            System.out.println(b + " va " + c);
//        }

//      16


//        int a = scannerInt.nextInt();
//        int b = scannerInt.nextInt();
//        int c = scannerInt.nextInt();
//
//        if (a == b - 1 && b == c - 1) {
//            a *= 2;
//            b *= 2;
//            c *= 2;
//        } else {
//            a = -a;
//            b = -b;
//            c = -c;
//        }
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

//        16


        int a = scannerInt.nextInt();
        int b = scannerInt.nextInt();
        int c = scannerInt.nextInt();

        if (a == b - 1 && b == c - 1|| c==b-1&&b==a-1) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = -a;
            b = -b;
            c = -c;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);




    }
}

