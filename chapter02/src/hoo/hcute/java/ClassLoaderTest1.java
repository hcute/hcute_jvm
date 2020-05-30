package hoo.hcute.java;

import sun.misc.Launcher;
import sun.security.ec.CurveDB;

import java.net.URL;
import java.security.Provider;

public class ClassLoaderTest1 {

    public static void main(String[] args) {
        System.out.println("***********启动类加载器所加载的类的路径**********");

        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL);
        }

        System.out.println("**************获取上面路径中的任意一个class文件的类加载器返回为null****************");
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);

        System.out.println("***********扩展类加载器所加载的类的路径**********");

//        String extDirs = System.getProperty("java.ext.dirs");
//
//        for (String path: extDirs.split(":")) {
//            System.out.println(path);
//        }

        System.out.println("**************获取上面路径中的任意一个class文件的类加载器" +
                "返回为sun.misc.Launcher$ExtClassLoader@355da254****************");

        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        System.out.println(classLoader1);


    }
}
