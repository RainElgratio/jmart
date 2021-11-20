package com.rainJmartFH;


/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Account extends Serializable implements FileParser
{
    public String name;
    public String email;
    public String password;


    public Account(int id, String name, String email, String password)
    {
        super(id);
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public boolean read(String content){
        return false;
    }
    public Object write(String content){
        return null;
    }
    public Object newInstance(String content){
        return null;
    }

    public String toString(){
        String s = "name: Rahmadhan\nemail: ramdhanganteng@gmail.com\npassword: gu3G4ntEnG";
        return s;
    }


    
}
