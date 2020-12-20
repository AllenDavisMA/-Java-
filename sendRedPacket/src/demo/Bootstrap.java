package demo;

import red.OpenMode;


public class Bootstrap {

    public static void main(String[] args) {
        MyRed red = new MyRed("HelloWorld");

        red.setOwnerName("马聪明");

        // 普通红包
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);

        // 手气红包
        OpenMode random = new RandomMode();
        red.setOpenWay(random);
    }

    public void testMerge1() {
        ////
        System.out.println("testmerge11!!");
    }

    public void testMerge() {
        System.out.println("testMerge222");
    }

    public void testMerge3() {
        System.out.println("testMerge333");
    }

}

