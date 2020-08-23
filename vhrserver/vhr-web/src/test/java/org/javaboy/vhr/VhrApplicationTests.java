package org.javaboy.vhr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VhrApplicationTests {

    @Test
    public void contextLoads() {
    }
    public ArrayList<String> Permutation(String str) {

        if(str.length()==0)
        {
            return new ArrayList();
        }
        ArrayList<String> arr=new ArrayList();
        fullsort(str,"",arr);
        return arr;
//        arr.toArray(new String[str.length()]);
    }

    public void fullsort(String str,String cur,ArrayList<String> arr)
    {

        if(str.length()==0)
        {
            if(!arr.contains(cur))
            {
                arr.add(cur);
            }

        }
        for(int i=0;i<str.length();i++)
        {
            fullsort(str.substring(0,i)+str.substring(i+1,str.length()),cur+str.charAt(i),arr);
        }
    }

    @org.junit.Test
    public void test01(){
        String str="abc";
        Permutation(str);


    }


}
