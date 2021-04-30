package com.zsd;

import java.net.SocketTimeoutException;
import java.util.ArrayList;

/**
 * @autore zhangge
 * @create 2021-04-29-10:36
 */
public class Main {

    //This,is,an,eggplant,of,our,beautifull,sweety,baby
    //16
    public static void main(String[] args) {
        System.out.println("master1");
        System.out.println("master1");
        System.out.println("hotfix");
        System.out.println("ziji");
        String str = "This,is,an,eggplant,of,our,beautifull,sweety,baby";
        int splitlength = 16;
        //str = str.replace(",","*");

        String[] strs = str.split(",");

        ArrayList<Integer> al = new ArrayList();
        al.add(0);
        int len = 0;
        int count = 0;
        for(int i=0;i<strs.length;i++)
        {
            len+=strs[i].length();
            count++;

            if((len+count/2)>=splitlength)
            {
                al.add((--i));
                len = 0;
                count = 0;
                continue;
            }
        }
        al.add(strs.length-1);

        //System.out.println(al.toString());

        for (int i = 0; i <al.size()-1 ; i++) {
            int start = (al.get(i)==0)?0:al.get(i)+1;
            int end = al.get(i+1);
            //System.out.print(start+" "+end+" ");
            for(int j=start;j<=end;j++)
            {
                System.out.print(strs[j]);
                System.out.print("*");
            }
            System.out.println();
        }
//
//
//        int length = str.length();
//        int startindex = 0;
//
//        int locationX = 0;
//
//        while((length - startindex)>0)
//        {
//
//            String strtemp = str.substring(startindex,((startindex+splitlength)>length)?length:startindex+splitlength);
//
//
//
//            System.out.println(strtemp);
//
//            startindex = startindex+splitlength;
//
//        }


        //1、先给每一行分好单词

        //2、填充每一行

    }
//
//    //获取真正的一行的数据，返回分隔的index
//    public static String getOneHang(String strtemp,String str)
//    {
//        int i = strtemp.lastIndexOf("*");
//
//        if(i!=15)
//        {
//            return strtemp.substring(0,i);
//        }
//        return strtemp.substring(0,14);
//    }
}
