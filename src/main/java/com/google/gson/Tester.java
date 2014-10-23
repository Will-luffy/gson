package com.google.gson;

import com.google.gson.annotations.NotNull;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class Tester {

    class ClassA {
        public String a;
        public Long b;
        @NotNull
        public Double c;
        
        public String getA() {
            return a;
        }
        public void setA(String a) {
            this.a = a;
        }
        public Long getB() {
            return b;
        }
        public void setB(Long b) {
            this.b = b;
        }
        public Double getC() {
            return c;
        }
        public void setC(Double c) {
            this.c = c;
        }
    }
    
    public static void main(String[] args) {
        String str = "{\"a\":\"abc\", \"b\": 1}";
        Gson gson = new Gson();
        Type type = new TypeToken<ClassA>(){}.getType();
        ClassA ca = gson.fromJson(str, type);
        System.out.println("parse success");
    }
}
