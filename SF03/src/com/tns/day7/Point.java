package com.tns.day7; //overriding
//
public class Point {

 private float x;  // variables x and y both are float
 private float y;
 
 //default constructor
 public Point() {
	 x=0.0f; //initialized the value of x and y
	 y=0.0f;
 }
 public Point(float x) {
	 this.x=x; //single parameterized constructor
	 this.y=x;
 }
 
 public Point(float x,float y) {
	 this.x=x;//double parameterized constructor
	 this.y=y;
 }
 
 @Override
 public String toString() {
	 return "Point[x="+ x +" , y=" + y +"]";
 }
}
