package com.example.jaspering21.password_validator;

/**
 * Created by Jaspering21 on 2018-02-07.
 */

public class validator {
    private String word;
    private boolean state;
    public boolean checkValid(){
        if(word.length()<8||word.equals("password")){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean check_case(){
        if(word.matches("[A-z]")){
            return true;
        }
        else if(word.matches("[a-z]")){
            return true;
        }
        else if(word.matches("[!@#$%^&*()<>?,.]*")){
            return true;
        }
        else
            return false;
    }
}
