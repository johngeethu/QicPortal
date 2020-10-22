package com.maximus.qicportaltestautomation.qic_object_model;

public class Sequence {
    Integer maxIndex;
    Integer initialIndex;
    Integer currentIndex;

    public Sequence(Integer maxIndex, Integer initialIndex) {
        this.maxIndex = maxIndex;
        this.initialIndex = initialIndex;
        this.currentIndex = initialIndex;
    }

    public Integer getMaxIndex() {
        return maxIndex;
    }

    public void setMaxIndex(Integer maxIndex) {
        this.maxIndex = maxIndex;
    }

    public Integer getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(Integer currentIndex) {
        this.currentIndex = currentIndex;
    }

    public Integer nextIndex(){
        if(this.currentIndex>this.maxIndex){
            this.currentIndex = initialIndex;
        } else {
            this.currentIndex = this.currentIndex+1;
        }
        return this.currentIndex;
    }

    public Integer getInitialIndex() {
        return initialIndex;
    }

    public void setInitialIndex(Integer initialIndex) {
        this.initialIndex = initialIndex;
    }
}
