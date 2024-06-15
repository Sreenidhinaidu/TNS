package com.tns.day7;

public class OverridingDemo {

	public static void main(String[] args) {
				RBI rbi;

//				Dynamic binding assigning child class object to parent class reference variable.
				rbi = new SBI();
				System.out.println(rbi.getRateOfInterest());

				rbi = new ICIC();
				System.out.println(rbi.getRateOfInterest());

				rbi = new HDFC();
				System.out.println(rbi.getRateOfInterest());

			}

		}
