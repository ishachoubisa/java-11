/**
 *               "Local Variable Type Inference"
 *               what it is:
 *               A shortcut to reduce verbosity of code.
 *               what it is not:
 *               A data type,the data type must be able to be inferred by
 *               compiler when using it.
 *               A keyword,you can actually use the text 'var' as an
 *               identifier.
 */






package com.WordyCompanyName.ALongPackageName;

public class AClassWithAVeryLongName {
    String name;

    public AClassWithAVeryLongName(){

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return "AClassWithAVeryLongName{" +
                "name='" + name + '\'' +
                '}';
    }
}
