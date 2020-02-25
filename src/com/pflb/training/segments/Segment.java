package com.pflb.training.segments;
import java.lang.Math;

public class Segment {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Segment( int x1, int y1, int x2, int y2 ) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double segmentLength () {
        double segLen = Math.sqrt( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) );
        return segLen;
    }

    public boolean segmentEq ( Segment segmentToCompare ) {
        return this.segmentLength() == segmentToCompare.segmentLength();
    }

}
