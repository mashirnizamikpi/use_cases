package com.example.demo1;

class Testif{
	  public static void main (String[] args){
	    //refer to the same object and return true
	    if(  "Java" == "Java" ){
	      System.out.println("Statement  is true");
	    }else{
	      System.out.println("Statement is false");
	    }
	    //point to the different object in memory return false
	    if(new String("Java") == "Java"){
	      System.out.println("Statement  is true");
	    }else{
	      System.out.println("Statement is false");
	    }
	    //point to the different object in memory return false
	    if(new String("Java") == new String("Java") ){
	      System.out.println("Statement  is true");
	    }else{
	      System.out.println("Statement is false");
	    }
	  }
	}
