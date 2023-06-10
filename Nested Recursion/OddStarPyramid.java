public class OddStarPyramid {
    private static int rows=5;
    public static void printspace(int space) {
        //Termination case
        if(space==0){
            return;
        }else{
            //Business logic
            System.out.print("  ");
        }
        //Recursive call
        printspace(space-1);
    }
    public static void printstar(int star) {
        //Termination case
        if(star==0){
            return;
        }
        //Business logic
        System.out.print("*");
        System.out.print(" ");
        //Recursive call
        printstar(star-1);
    }
    public static void printline(int row,int space) {
        //Termination case
        if(row==0){
            return;
        }
        //Business logic
        printspace(row-1);
        printstar(space);
        System.out.println();
        //Recursive call
        printline(row-1, space+2);
    }

    public static int printline(int lines) {
        //Termination case
        if(lines==0){
            return 0;
        }
        //Recursive call
        int star = printline(lines-1);
        //Business logic
        printspace(rows-(star+1));
        printstar(lines+star);
        System.out.println();
        return star+1;
    }

    
    public static void main(String[] args) {
        printline(rows,1);
        System.out.println();
        printline(rows);
        
    }
}
