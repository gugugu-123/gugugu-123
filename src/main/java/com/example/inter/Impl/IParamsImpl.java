package com.example.inter.Impl;

import com.example.inter.IParams;

import java.util.List;

public class IParamsImpl implements IParams {
    private Integer big;
    private Integer Medium;
    private Integer Small;
    private List<Integer> planParking;

    public void setBig(Integer big) {
        this.big = big;
    }

    public void setMedium(Integer medium) {
        Medium = medium;
    }

    public void setSmall(Integer small) {
        Small = small;
    }

    public void setPlanParking(List<Integer> planParking) {
        this.planParking = planParking;
    }

    @Override
    public int getBig() {
        return big;
    }

    @Override
    public int getMedium() {
        return Medium;
    }

    @Override
    public int getSmall() {
        return Small;
    }

    @Override
    public List<Integer> getPlanParking() {
        return planParking;
    }
}
