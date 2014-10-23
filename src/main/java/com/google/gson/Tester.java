package com.google.gson;

import com.google.gson.annotations.NotNull;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class Tester {

    class ClassA {
        public String a;
        public List<ClassB> c;
        
        public String getA() {
            return a;
        }
        public void setA(String a) {
            this.a = a;
        }
        public List<ClassB> getC() {
            return c;
        }
        public void setC(List<ClassB> c) {
            this.c = c;
        }
    }
    
    class ClassB {
        @NotNull
        public String d;
        public Long e;

        public String getD() {
            return d;
        }

        public void setD(String d) {
            this.d = d;
        }

        public Long getE() {
            return e;
        }

        public void setE(Long e) {
            this.e = e;
        }
    }
    
    public static void main(String[] args) {
        String str = "{\"a\":\"abc\", \"c\": [{\"d\": \"haha\"},{\"e\":1}]}";
        Gson gson = new Gson();
        Type type = new TypeToken<ClassA>(){}.getType();
        ClassA ca = gson.fromJson(str, type);
        System.out.println("parse success");
    }
}
