package jdk1_8.lambda.string_test;

import org.junit.Test;

/**
 * @ClassName TestClass
 * @Description: TODO
 * @Author 田清波
 * @Mail tqb820965236@163.com
 * @Date 2019/10/7 12:03
 * @Version v1.0
 */
public class TestClass {

    @Test
    public void test(){
        String upCase = helper("abcdefg", (str) -> str.toUpperCase());
        System.out.println(upCase);

        String sub = helper("西安邮电大学是四大邮电之一，是西北地区唯一一所邮电通信类高校", (str) -> str.substring(0, 6));
        System.out.println(sub);
    }

    public String helper(String str, StringInterface fun){
        return fun.getValue(str);
    }
}
