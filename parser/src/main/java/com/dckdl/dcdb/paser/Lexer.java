package com.dckdl.dcdb.paser;

import java.util.ArrayList;
import java.util.List;

public class Lexer {


    public static String[] bySpace(String abc) {

        abc = abc.replaceAll(" +", " ").trim();

        String[] strings = abc.split(" ");
        return strings;
    }

    public static void main(String[] args) {
        String v = "select *  from tables where a = 1";
        String[] ss = Lexer.bySpace(v);

        for (String a : Lexer.bySpace(v)) {
            System.out.println(a);
        }
    }
}
