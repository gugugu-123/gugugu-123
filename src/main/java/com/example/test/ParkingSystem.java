package com.example.test;

import com.example.inter.IParams;
import com.example.inter.IParking;

public class ParkingSystem implements IParking {
    public static void main(String[] args) {
        IParams iParams = IParking.parse("[[1, 1, 0], [1], [2], [3], [1]]");


    }

    @Override
    public void print() {

    }

    @Override
    public boolean addCar() {
        return false;
    }
}
