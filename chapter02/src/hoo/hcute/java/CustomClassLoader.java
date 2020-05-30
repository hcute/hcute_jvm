package hoo.hcute.java;

import java.io.FileNotFoundException;

public class CustomClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        byte[] result = getClassFromCustomPath(name);
        if (result == null) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }else {
            return defineClass(name,result,0,result.length);
        }
        return super.findClass(name);
    }

    private byte[] getClassFromCustomPath(String path){
        // 从自定义的路径中加载指定类，如果字节码文件加密了，可以在这里进行解密
        return  null;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        Class<?> one = Class.forName("One", true, customClassLoader);
        System.out.println(one.getClass().getClassLoader());

    }
}
