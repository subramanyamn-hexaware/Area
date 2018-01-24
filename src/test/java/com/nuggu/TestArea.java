package com.nuggu;

import org.junit.Test;

// import org.junit.Test;



public class TestArea{
    // public static void main(String[] args) {
        
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter length=");
    //     float length=sc.nextFloat();
    //     System.out.println("Enter breadth=");
    //     float breadth=sc.nextFloat();
    //     Area.area(length, breadth);
    // }

    @Test
    public void testArea(){
        float length=3.16f;
        float breadth=4.62f;
        float AreaofRectangle=Area.area(length, breadth);
        System.out.println("_______________________");
        System.out.println("Area Of Rectangle="+AreaofRectangle);
    }

}