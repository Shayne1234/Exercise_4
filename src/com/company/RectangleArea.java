package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RectangleArea { double width,length,area;

    void getData() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter width of a Rectangle: ");
        width=Double.parseDouble(br.readLine());
        System.out.println("Please enter length of a Rectangle: ");
        length=Double.parseDouble(br.readLine());
    }
    void Computing(){
        area=length*width;
    }

    void DisplayResult(){
        System.out.println("The area of your Rectangle is = "+area);
    }
}

