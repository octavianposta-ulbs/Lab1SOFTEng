public class Rectangle {
    public static void drawRectangle(int n, int m) {
        for(int i = 0; i < n; i++) {
            if(i == 0 || i == n-1){
                for(int j = 0; j < m; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                System.out.print("*");
                for(int j = 0; j < m-2; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
    public static void drawRectangleWithDiagonals(int n, int m) {
        for(int i = 0; i < n; i++) {
            System.out.print("*");
            if(i == 0 || i == n-1){
                for(int j = 1; j < m-1; j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j = 1; j < m-1; j++){
                    if(i == j || j == m-i-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("*");
        }
    }
}
