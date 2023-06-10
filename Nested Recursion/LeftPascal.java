public class LeftPascal {
    public static void PrintSpace(int space) {
        //Termination case
        if(space==0){
            return;
        }
        //Business logic
        System.out.print(" ");
        //Recursive call
        PrintSpace(space-1);
    }

    public static void PrintStar(int star) {
        //Termination case
        if(star==0){
            return;
        }
        //Business logic
        System.out.print("*");
        //Recursive call
        PrintStar(star-1);
    }    
    public static void printcall(int rows,int lines) {
        PrintSpace((int)Math.round(lines/2.0)-((lines-rows)+1));
        PrintStar((lines-rows)+1);
        System.out.println();
    }
    public static void printline(int rows,int lines) {
        
        if(lines%2!=0){  //no.of rows is odd
            //Termination case
            if(rows==Math.round(lines/2.0)){
                printcall(rows,lines);
                return;
            }
            //Business logic
            printcall(rows,lines);

            //Recursive call
            printline(rows-1,lines);
            
            //Business logic
            printcall(rows,lines);
        }

        else{   //no.of rows even
            //Termination case
            if(rows==lines/2){
                return;
            }
            //Business logic
            printcall(rows,lines);

            //Recursive call
            printline(rows-1,lines);

            //Business logic
            printcall(rows,lines);
        }        
    }
    public static void main(String[] args) {
        printline(10, 10);
    }
}
