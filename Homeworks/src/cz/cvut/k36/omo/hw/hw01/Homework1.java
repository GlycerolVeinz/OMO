package cz.cvut.k36.omo.hw.hw01;

public class Homework1 {
    private int H_val = 1;
    private static int I_val = 1;

//   ====================Getters/Setters=======================
    private void setH_val(int val){
        this.H_val = val;
    }
    private int getH_val(){
        return this.H_val;
    }

    private void setI_val(int val){
        I_val = val;
    }
    private int getI_val(){
        return I_val;
    }

//    ===================Methods========================
    public boolean f(){
        return true;
    }

    public static boolean g(){
        return false;
    }

    public int h(){
        int tmp = getH_val();
        setH_val(tmp + 1);
        return tmp;
    }

    public int i(){
        int tmp = getI_val();
        setI_val(tmp + 1);
        return tmp;
    }
}
