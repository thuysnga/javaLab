package lab1_homework;

/**
 *
 * @author THUYNGA
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class lab1_homework {
    public static int uocChungLonNhat(int a, int b) {
        int rel = 0;
        while (a != b) {
            if (a < b)
                b -= a;
            else if (a > b)
                a -= b;
        }
        rel = a;
        return rel;
    }
    public static void timUocChungLonNhat() {
        Scanner scanIn = new Scanner(System.in);
        int a, b;
        System.out.print("Nhap hai so a va b ");
        a = scanIn.nextInt();
        b = scanIn.nextInt();
        System.out.println("Uoc chung lon nhat cua "+ a + " va " + b + " la : " + uocChungLonNhat(a, b));
        scanIn.close();        
    }
    public static int BoiChungNhoNhat(int a, int b) {
        return (a*b/uocChungLonNhat(a, b));
    }
    public static void timBoiChungNhoNhat() {
        Scanner scanIn = new Scanner(System.in);
        int a, b;
        System.out.print("Nhap hai so a va b ");
        a = scanIn.nextInt();
        b = scanIn.nextInt();
        System.out.println("Boi chung nho nhat cua "+ a + " va " + b + " la : " + BoiChungNhoNhat(a, b));
        scanIn.close();        
    }
    public static void donGianPhanSo() {
        Scanner scanIn = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap tu so va mau so cua phan so (mau so khac 0).");
        a = scanIn.nextInt();
        do {
            b = scanIn.nextInt();
        } while (b == 0);
        if (uocChungLonNhat(a, b) != 1) {
            a /= uocChungLonNhat(a, b);
            b /= uocChungLonNhat(a, b);
        }
        System.out.println("Phan so sau khi don gian la " + a + "/" + b);
        scanIn.close();
    }
    public static void lietKeUocSo() {
        Scanner scanIn = new Scanner(System.in);
        int n;
        System.out.println("Nhap so nguyen duong n");
        n = scanIn.nextInt();
        System.out.print("Cac uoc so cua " + n + " la ");
        for (int i = 1; i <= n/2; i++) {
            if (n%i == 0) {
                if (i == n/i) System.out.print(i + " ");
                else System.out.print (i +" " + n/i + " ");
            }
        }
        scanIn.close();
    }
    // PHAN 2
    // bai 1
    public static void mang1C() {
        Scanner scanIn = new Scanner(System.in);
        Random rand = new Random();
        int n,m;
        System.out.println("Nhap vao so phan tu cua mang A.");
        n = scanIn.nextInt();
        System.out.println("Nhap vao so phan tu cua mang B.");
        m = scanIn.nextInt();
        // khoi tao ba mang A,B,C
        int [] arrA = new int[n];
        int [] arrB = new int[m];

        System.out.println("Nhap cac phan tu cua mang A!");
        for (int i=0; i<n; i++) 
            arrA[i] = scanIn.nextInt();
        System.out.println("Da nhap xong mang A, Mang B se tu dong duoc khoi tao!");
        for (int i = 0; i < m; i++) 
            arrB[i] = rand.nextInt(500);
        System.out.println("Cac phan tu cua mang B : " + Arrays.toString(arrB));
        int [] arrC = Arrays.copyOf(arrB, m);
        System.arraycopy(arrB, m - 3, arrC, 1, 3);
        Arrays.sort(arrC);
        System.out.println("Mang C sau khi thay 3 phan tu 1->3 bang 3 phan tu cuoi cua B\nva sap xep : " + Arrays.toString(arrC));
        scanIn.close();
    }
    //bai2
    public static boolean laSNT(int n) {
        boolean flag = true;
        for (int i = 2; i <= (n/2); i++) {
            if (n%i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void mang2C() {
        Scanner scanIn = new Scanner(System.in);
        int dong, cot;
        System.out.println("Nhap so dong");
        dong = scanIn.nextInt();
        System.out.println("Nhap so cot");
        cot = scanIn.nextInt();
        int [][] arr2c = new int[dong][cot];
        System.out.println("Nhap mang!");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++)
                arr2c[i][j] = scanIn.nextInt();
        }
        int pos1 = 0;
        int pos2 = 0;
        int max = arr2c[0][0];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (max < arr2c[i][j]) {
                    max = arr2c[i][j];
                    pos1 = i;
                    pos2 =j;
                }
            }
        } 
        System.out.println("Phan tu lon nhat mang la " + max + " o vi tri [" + pos1 + "," + pos2 + "]");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (laSNT(arr2c[i][j]) == true) System.out.print (arr2c[i][j]+" ");
                    else System.out.print(0 + " ");
            }
            System.out.println();
        }
        // con sort nua ma luoi` lam` nen thui, pai hihihihihihi
        scanIn.close();
    }
    public static void main(String[] args) {
    
    }    
}