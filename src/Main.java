
public class Main {
    public static void main(String[] args) {
        String[][] word = new String[20][8];

        for (int i = 0; i< word.length;i++){
            for (int j =0; j< word[i].length; j++){
                word[i][j] = " ";
            }
        }

        for (int i =0 ; i< word.length;i++){

            for (int j = 0; j< word[i].length; j++){

                switch (i){
                    case 0: if (j>=0 && j<=5) word[0][j] ="*";
                    case 1: if (j>=0 && j<=6) word[1][j] ="*";
                    case 2: if (j>=0 && j<=1 || j>=5 && j<=7) word[2][j] ="*";
                    case 3: if (j>=0 && j<=1 || j>=6 && j<=7) word[3][j] ="*";
                    case 4: if (j>=0 && j<=1 || j>=6 && j<=7) word[4][j] ="*";
                    case 5: if (j>=0 && j<=1 || j>=6 && j<=7) word[5][j] ="*";
                    case 6: if (j>=0 && j<=1 || j>=6 && j<=7) word[6][j] ="*";
                    case 7: if (j>=0 && j<=1 || j>=6 && j<=7) word[7][j] ="*";
                    case 8: if (j>=0 && j<=1 || j>=5 && j<=6) word[8][j] ="*";
                    case 9: if (j>=0 && j<=5) word[9][j] ="*";
                    case 10: if (j>=0 && j<=5) word[10][j] ="*";
                    case 11: if (j>=0 && j<=1 || j>=5 && j<=6) word[11][j] ="*";
                    case 12: if (j>=0 && j<=1 || j>=6 && j<=7) word[12][j] ="*";
                    case 13: if (j>=0 && j<=1 || j>=6 && j<=7) word[13][j] ="*";
                    case 14: if (j>=0 && j<=1 || j>=6 && j<=7) word[14][j] ="*";
                    case 15: if (j>=0 && j<=1 || j>=6 && j<=7) word[15][j] ="*";
                    case 16: if (j>=0 && j<=1 || j>=6 && j<=7) word[16][j] ="*";
                    case 17: if (j>=0 && j<=1 || j>=5 && j<=7) word[17][j] ="*";
                    case 18: if (j>=0 && j<=6) word[18][j] ="*";
                    case 19: if (j>=0 && j<=5) word[19][j] ="*";
                }
            }
        }
        for (String[] row : word){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}


//https://app.patika.dev/onurarslanturk
//www.patika.dev