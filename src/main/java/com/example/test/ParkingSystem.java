package com.example.test;

import com.example.inter.IParams;
import com.example.inter.IParking;

import java.lang.String;
import java.util.List;

public class ParkingSystem implements IParking {

    private Integer big;
    private Integer Medium;
    private Integer Small;
    boolean[] judges;
    private List<Integer> planParking;
    int index = -1;

    public ParkingSystem(Integer big, Integer medium, Integer Small) {
        this.big = big;
        this.Medium = medium;
        this.Small = Small;
    }

    public static void main(String[] args) {
        IParams iParams = IParking.parse("[[1, 1, 0], [1], [2], [3], [1]]");
        ParkingSystem iParking = new ParkingSystem(iParams.getBig(),iParams.getMedium(),iParams.getSmall());
        List<Integer> list = iParams.getPlanParking();
        iParking.judges = new boolean[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iParking.addCar(list.get(i));
        }
        System.out.println();
        iParking.print();
    }

    @Override
    public void print() {
        for (boolean judge : judges) {
            System.out.print(judge +"  ");
        }
        System.out.println();
    }

    @Override
    public boolean addCar(int i) {
        if(i == 1 && this.big != 0){
            big--;
            index++;
            judges[index] = true;
            return true;
        }else if(i == 2 && this.Medium != 0){
            Medium--;
            index++;
            judges[index] = true;
            return true;
        }else if(i == 3 && this.Small != 0){
            Small--;
            index++;
            judges[index] = true;
            return true;
        }
        index++;
        judges[index] = false;
        return false;
    }
    update 111111111 byGLingche
}
