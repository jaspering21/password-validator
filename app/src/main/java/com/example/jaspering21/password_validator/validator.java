package com.example.jaspering21.password_validator;

import static android.view.View.Z;

/**
 * Created by Jaspering21 on 2018-02-07.
 */

public class validator {
    private String word;
    private int count;
    public int checkValid(String password){
        word = password;
        count = 0;
        if(!word.equals("password")&&word.length()>8) {
            count ++;
        }
        if(word.length()>8) {
            count ++;
        }
        if (word.matches(".*[a-z].*")&&word.length()>8) {
            count ++;
        }
        if (word.matches(".*[0-9].*")&&word.length()>8) {
            count ++;
        }
        if (word.matches(".*[A-Z].*")&&word.length()>8){
            count ++;
        }
        return count;
    }
}
