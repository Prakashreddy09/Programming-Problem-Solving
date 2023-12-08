
import java.util.Scanner;

class Patterns{
    public  static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        // starsquare(x);
        // starRighttriangle(x);
        // NumRighttriangle1(x);
        // NumRighttriangle2(x);
        // StarInverseRighttriangle(x);
        // NumInverseRighttriangle(x);
        // Pyramid(x);
        // InversePyramid(x);
        // Diamond(x);
        // RightsideDiamond(x);
        // onezerorPyramid(x);
        NumU(x);
        // Numberpyramid(x);
        // Alphabetpyramid(x);
        // InverseAlphabetpyramid(x);
        // RightAlphabetpyramid(x);
        // AlphabetEquiTriangle(x);
        scan.close();
    }

    public static void starsquare(int n){
        for(int i=0; i<n; i++){
            for( int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void starRighttriangle(int n){
        for(int i=0; i<n; i++){
            for( int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void NumRighttriangle1(int n){
        for(int i=0; i<n; i++){
            for( int j=0; j<=i; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }

    public static void NumRighttriangle2(int n){
        for(int i=0; i<n; i++){
            for( int j=0; j<=i; j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }

    public static void StarInverseRighttriangle(int n){
        for(int i=0; i<n; i++){
            for( int j=0; j<=n-i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void NumInverseRighttriangle(int n){
        for(int i=0; i<n; i++){
            for( int j=0; j<=n-i-1; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }

    public static void Pyramid(int n) {
        for(int i=1; i<=n; i++){
            for(int j = n-i; j>=0; j-- ){
                System.out.print("  ");
            }
            for(int k=i*2 -1 ; k>0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void InversePyramid(int n) {
        for(int i=1; i<=n; i++){
            for(int j=i; j>0; j-- ){
                System.out.print("  ");
            }
            for(int k=(n-i)*2  ; k>=0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Diamond(int n) {

        for(int i=1; i<n; i++){
            for(int j = n-i; j>=0; j-- ){
                System.out.print("  ");
            }
            for(int k=i*2 -1 ; k>0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1; i<=n; i++){
            for(int j=i; j>0; j-- ){
                System.out.print("  ");
            }
            for(int k=(n-i)*2  ; k>=0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void RightsideDiamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=(2*n)/2; j>=0; j--){
                System.out.print(" ");
            }
            for(int k=i; k>0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1; i<=n; i++){
            for(int j=(2*n)/2; j>=0; j--){
                System.out.print(" ");
            }
            for(int k=(n-i) ; k>0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void onezerorPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%2 == 1){
                    if(j%2 == 1){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
                else{
                    if(j%2 == 1){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void NumU(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int k= (n-i)*2; k>0; k--){
                    System.out.print(" ");
                }
            for(int j=i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Numberpyramid(int n){
        int x=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }

    public static void Alphabetpyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=65; j<= i+64 ; j++){
                System.out.print((char) j);
            }
            // for(int j=i; j>=65 ; j--){
            //     System.out.print((char) j);
            // }
            System.out.println();
        }
    }

    public static void InverseAlphabetpyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=65; j<=65+n-i; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }

    public static void RightAlphabetpyramid(int n){
        for(int i=65; i<=n+65; i++){
            for(int j=0; j<=i-65; j++){
                System.out.print((char)i);
            }
            System.out.println();
        }
    }

    public static void AlphabetEquiTriangle(int n){}

}

