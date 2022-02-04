package com.company;

public class Main {

    public static void main(String[] args) {
       fiSh balyk =new fiSh();
       papugay kush=new papugay();
       dOg nemeskiyofcharka=new dOg();
       kush.setName("alanul");
       kush.setAge(4);
       kush.setColor("Yellow");
        System.out.println(kush.getName()+" "
                          +kush.getAge()+" "
                          +kush.getColor());
        balyk.setName("agone");
        balyk.setAge((byte) 4);
        balyk.setColor("WHite");
        System.out.println(balyk.getName()+" "
                +balyk.getAge()+" "
                +balyk.getColor());
        nemeskiyofcharka.setName("REKS");
        nemeskiyofcharka.setAge(5);
        nemeskiyofcharka.setComefrom("German");
        System.out.println(nemeskiyofcharka.getName()+" "
                           +nemeskiyofcharka.getAge()+" "
                           +nemeskiyofcharka.getComefrom());

	// write your code here
    }
}
