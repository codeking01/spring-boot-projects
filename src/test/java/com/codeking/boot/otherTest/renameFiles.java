package com.codeking.boot.otherTest;


import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author : codeking
 * @create : 2022/12/3 19:55
 */
public class renameFiles {
    @Test
    public void hello() throws IOException {
        File folder = new File("C:\\Users\\king\\Desktop\\数据汇总\\1202数据\\训练300次\\final_results\\");
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                File f = new File("C:\\Users\\king\\Desktop\\数据汇总\\1202数据\\训练300次\\final_results\\" + listOfFiles[i].getName());
                try {
                    f.renameTo(new File("C:\\Users\\king\\Desktop\\数据汇总\\1202数据\\训练300次\\final_results\\" + listOfFiles[i].getName().substring(0, listOfFiles[i].getName().indexOf("列")) + listOfFiles[i].getName().substring(listOfFiles[i].getName().lastIndexOf("."))));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("conversion is done");
    }
}