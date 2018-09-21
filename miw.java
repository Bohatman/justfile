/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sPutt
 */
public class miw {
    boolean isEye(int[][] arr){
        int numRow = arr.length;
        int numCol = arr[0].length;
        Object[] temRow = new Object[numRow];
        Object[] temCol = new Object[numCol];
        int cout=0;
        if(numRow != numCol)return false;
        for(int i=0;i<numRow;i++){
            for(int j=0;j<numCol;j++){
                if(arr[i][j]==1){
                        temRow[i]=i;
                        temCol[i]=j;
                        if(cout > 0) return false;
                        cout++;
                    }
                }
            if(temCol[i]== null || temRow[i] == null) return false;
            cout =0;
        }
        if((int)temCol[0] == 0){
            for(int i = 1;i<temCol.length;i++){
                if((int)temCol[i] != ((int)temCol[i-1]+1))return false;
            }
        }
        else if((int)temCol[0]==numCol-1){
            for(int i = 1;i<temCol.length;i++){
                if(((int)temCol[i] != ((int)temCol[i-1]-1)))return false;
            }
        }
        else {return false;}
    return true;
    }
}
