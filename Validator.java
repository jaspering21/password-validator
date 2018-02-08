package com.example.jaspering21.password_validator;

/**
 * Created by Jaspering21 on 2018-02-07.
 */

public class validator {
    private String word;
    private int count;
    public int checkValid(String password){
        word = password;
        if(word.length()>8){
            count++;
        }
        if(word.matches("[A-z]*")){
            count++;
        }
        if(word.matches("[a-z]*")){
            count++;
        }
        if(word.matches("[!@#$%^&*()<>?,.]*")) {
            count++;
        }
        if(word.equals("password")){
            return 0;
        }
        return count;
    }
}
