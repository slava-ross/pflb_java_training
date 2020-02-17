package com.pflb.training.segments;

public class Main {

    public static void main(String[] args) {

        Segment segment1 = new Segment( 1,1,2,2 );
        Segment segment2 = new Segment( -3,0,1,1 );

        System.out.printf( "First segment length: %.2f%n", segment1.segmentLength() );
        System.out.printf( "Second segment length: %.2f%n", segment2.segmentLength() );

        if ( segment1.segmentEq( segment2 ) ) {
            System.out.printf( "Segments are equal." );
        } else {
            System.out.printf( "Segments aren't equal." );
        }
    }
}
