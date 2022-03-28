import java.util.Scanner;
public class kombinasyonFormulu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N, r;

        System.out.print("N değerini giriniz:");
        N=input.nextInt();
        System.out.print("r değerini giriniz:");
        r=input.nextInt();

        int Nfaktoriyel = 1;
        for (int i=1; i<=N; i++){
            Nfaktoriyel=Nfaktoriyel*i;
        }

        int rfaktoriyel = 1;
        for (int i=1; i<=r; i++){
            rfaktoriyel=rfaktoriyel*i;
        }

        int jfaktoriyel = 1;
        for (int i=1; i<=N-r; i++){
            jfaktoriyel=jfaktoriyel*i;
        }

        int Kombinasyon=(Nfaktoriyel/(rfaktoriyel*jfaktoriyel));
        System.out.println("Kombinasyon Formülü:C(n,r) = n! / (r! * (n-r)!)");
        System.out.print("Kombinasyon sonucu:" + Kombinasyon);



    }
}
