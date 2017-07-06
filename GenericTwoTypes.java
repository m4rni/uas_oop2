/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generik;

/**
 *
 * @author user
 */
public class GenericTwoTypes <T ,N>{
    private T type;
    private N type1;
    
    public T getType(){
        return type;
    }
    
    public N getType1(){
      return type1;  
    }
    
    public void setType (T type){
        this.type = type;
    }
    
    public void setType1 (N type1){
        this.type1 =  type1;
    }
    
    public static void main(String[]args){
        
   GenericTwoTypes<Character,Character> genChar = new GenericTwoTypes();
genChar.setType('3');
System.out.println(genChar.getType());

 GenericTwoTypes<String,String> genString = new GenericTwoTypes();
genString.setType("String Type");
System.out.println(genChar.getType());

 GenericTwoTypes<Integer,Integer> genInt = new GenericTwoTypes();
genInt.setType(9);
System.out.println(genInt.getType());

 GenericTwoTypes<Double,Double> genDouble = new GenericTwoTypes();
genDouble.setType(20.20);
System.out.println(genDouble.getType());
   
    }
    
  
}
