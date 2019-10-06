package jdk1_8.lambda;

import org.junit.Test;

/**
 * @ClassName LambdaTest2
 * @Description: TODO
 * @Author 田清波
 * @Mail tqb820965236@163.com
 * @Date 2019/10/7 0:36
 * @Version v1.0
 */
public class LambdaTest2 {
    @Test
    public void test(){
        // 平方
        Operation<Integer> pow = (x) -> x * x;
        System.out.println(pow.op(200));

        // 和
        Operation<Integer> sum = (x) -> x + x;
        System.out.println(sum.op(200));
    }
}
