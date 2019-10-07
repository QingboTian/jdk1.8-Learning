package jdk1_8.lambda.long_test;

import org.junit.Test;

/**
 * @ClassName TestClass
 * @Description: TODO
 * @Author 田清波
 * @Mail tqb820965236@163.com
 * @Date 2019/10/7 12:10
 * @Version v1.0
 */
public class TestClass {
    @Test
    public void test(){
        System.out.println(helper(100L, 200L, (x, y) -> x + y));
        System.out.println(helper(100L, 200L, (x, y) -> x * y));
    }

    public Long helper(Long l1, Long l2, LongInterface<Long, Long> fun){
        return fun.getValue(l1, l2);
    }
}
