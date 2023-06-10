public class InvertedLeftPyramid {
    static int classvar;
    //Using Stack Builder
    public static void printstar(int star) {
        //Termination case
        if(star==0){
            return;
        }
        //Business logic
        System.out.print("*");
        //Recursive call
        printstar(star-1);
    }
    public static void printline(int row,int index) {
        //Termination case
        if(row==0){
            return;
        }
        //Business logic
        printstar(index);
        System.out.println();
        //Recursive call
        printline(row-1,index-1);
    }

    //Using Stack Falling
    public static int printline(int row) {
        //Termination case
        if(row==0){
            return classvar;
        }
        //Recursive call
        int result = printline(row-1);
        //Business logic
        printstar(result);
        System.out.println();
        return result-1;
    }
    public static void main(String[] args) {
        classvar=5;
        printline(classvar);
    }
}
