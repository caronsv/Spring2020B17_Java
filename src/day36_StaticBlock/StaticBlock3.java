package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock3 {
    static String name;
    static int num;

  static Tester tester1;
  static {
       name="Sveta";
        num=200;
        tester1=new Tester();
        tester1.setTesterInfo("Gean",123,"SCTE",150000);
        System.out.println(name);
        System.out.println(num);
    }}

