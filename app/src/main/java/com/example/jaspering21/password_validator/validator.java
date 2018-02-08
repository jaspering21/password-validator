package com.example.jaspering21.password_validator;

/**
 * Created by Jaspering21 on 2018-02-07.
 */

public class validator {
    private String word;
    private int count;
    public int checkValid(String password){
        word = password;
        if(word.length()>8) {
            count = 1;
        }
        if (word.matches("[0-9]*")&&word.length()>8) {
            count =2;
        }
        if (word.matches("[a-z]*")&&word.matches("[0-9]*")&&word.length()>8) {
            count = 3;
        }
        if (word.matches("[!@#$%^&*()<>,./?]*")&&word.matches("[a-z]*")&&word.matches("[0-9]*")&&word.length()>8) {
            count = 4;
        }
        if(word.equals("password")){
            return 0;
        }
        return count;
    }
}
