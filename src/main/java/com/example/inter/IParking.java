package com.example.inter;

import com.example.inter.Impl.IParamsImpl;

import java.util.ArrayList;
import java.util.List;

public interface IParking {

    void print();

    boolean addCar(int i);

    //解析命令行输入参数
   static IParams parse(String s){
        //[[1, 1, 0], [1], [2], [3], [1]]
        String[] split = s.split("]");
        int temp,big = 0,medium = 0,small = 0;
        List<Integer> list = new ArrayList<>();


        big = Integer.parseInt(split[0].charAt(2)+"");
        medium = Integer.parseInt(split[0].charAt(5)+"");
        small = Integer.parseInt(split[0].charAt(8)+"");


        for (int i = 1; i < split.length; i++) {
            list.add(Integer.parseInt(split[i].charAt(3)+""));
        }


        IParamsImpl iParams = new IParamsImpl();
        iParams.setBig(big);
        iParams.setMedium(medium);
        iParams.setSmall(small);
        iParams.setPlanParking(list);
        return iParams;
    }

}
