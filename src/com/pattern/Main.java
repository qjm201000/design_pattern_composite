package com.pattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ifile folder_d = new Folder("d:");
        Ifile file_d_aa = new File("aa.txt");
        Ifile folder_d_dingding = new Folder("dingding");
        Ifile folder_d_dingding_bin = new Folder("bin");
        Ifile file_d_dingding_b = new File("可执行文件.exe");
        Ifile file_d_dingding_bin_b = new File("mm.exe");
        Ifile file_d_bb = new File("bb.txt");

        folder_d_dingding_bin.add(file_d_dingding_bin_b);

        folder_d_dingding.add(folder_d_dingding_bin);
        folder_d_dingding.add(file_d_dingding_b);

        folder_d.add(file_d_aa);
        folder_d.add(folder_d_dingding);
        folder_d.add(file_d_bb);

        show(folder_d,0);//显示当前目录下的节点
    }

    /**
     * 显示当前目录下的节点
     * @param file
     */
    public static void show(Ifile file,int deep){
        for(int m=0;m<deep;m++){
            System.out.print("--");
        }
        List<Ifile> list = file.getChild();
        for(int i = 0; i<list.size();i++){
            Ifile fi = list.get(i);
            System.out.print("--");
            if(fi instanceof  File){
                for(int n=0;n<deep-1;n++){
                    System.out.print("--");
                }
                fi.display();
            }else{
                fi.display();
                show(fi,++deep);
            }
        }
    }
}
