import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,r,i=1,fk=1,fkt=1,fktrl=1,a=1;
        Scanner inp=new Scanner(System.in);
        System.out.println("n'yi giriniz:");
          n= inp.nextInt();
        System.out.println("r'yi giriniz:");
          r=inp.nextInt();
          a=n-r;
        for (i=1; i<=n; i++) {
            fk=fk*i;
        }
        for (i=1; i<=r; i++) {
            fkt=fkt*i;
        }
        for (i=1; i<=a; i++) {
            fktrl=fktrl*i;
        }
        System.out.println(fk/fkt*fktrl);
    }
}
