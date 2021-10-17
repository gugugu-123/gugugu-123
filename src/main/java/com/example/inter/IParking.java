package com.example.inter;

import com.example.inter.Impl.IParamsImpl;

import java.util.ArrayList;
import java.util.List;

public interface IParking {

    void print();

    boolean addCar();

    //解析命令行输入参数
   static IParams parse(String s){
        //[[1, 1, 0], [1], [2], [3], [1]]
        String[] split = s.split("]");
        List<Integer> list = new ArrayList<>();
        char[] chars = split[0].toCharArray();
        for (int i = 2; i < chars.length; i += 2) {
            list.add(Integer.valueOf(chars[i]));
        }
        int temp,big = 0,medium = 0,small = 0;
        for (int i = 1; i < split.length; i++) {
            temp = split[i].charAt(2) - 'a';
            if(temp == 1){
                big++;
            }else if(temp == 2){
                medium++;
            }else if(temp == 3){
                small++;
            }
        }
        IParamsImpl iParams = new IParamsImpl();
        iParams.setBig(big);
        iParams.setMedium(medium);
        iParams.setSmall(small);
        iParams.setPlanParking(list);
        return iParams;
    }

}
