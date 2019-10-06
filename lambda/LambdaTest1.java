package jdk1_8.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @ClassName LambdaTest1
 * @Description: TODO
 * @Author 田清波
 * @Mail tqb820965236@163.com
 * @Date 2019/10/6 19:18
 * @Version v1.0
 */
public class LambdaTest1 {

    /**
     * Lambda表达式中的重要符号 ->
     * -> 符号分为左右两个部分 左边相当于方法的参数 右边相当于方法体
     *
     * 在接口中使用Lambda表达式时 接口必须是函数式接口 即接口中只存在一个抽象方法和多个非抽象方法（非抽象方法不是必须的）
     * 如： Runnable接口就是函数式接口
     *
     * 方法分类
     *  1. 方法无参数无返回值
     *  （） -> {}
     *  2. 方法有一个参数无返回值
     *  (x) -> {}
     *  3. 方法有没有参数且有返回值
     *  () -> {.... return ...}
     *  4. 方法有一个参数且有返回值
     *  (x) -> {.... return ...}
     *  4. 方法有多个参数
     *  (x, y) -> {}
     *
     * 其它写法
     *  1. 只存在一个参数可省略括号
     *  x -> {}
     *  2. 方法体中只存在一条语句且只有一个参数
     *  x -> System.out.println(x)
     *  3. 在参数中写明参数类型（所有参数都必须加类型，要么都加，要么都不加）
     *  (Integer x, Integer y) -> {}
     *
     */


    @Test
    public void test1(){
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("未使用Lambda表达式...");
            }
        };
        runnable1.run();
        System.out.println("---------------------");

        Runnable runnable = () -> {
            System.out.println("使用Lambda表达式...");
        };
        runnable.run();
    }

    @Test
    public void test2(){
        Consumer<String> consumer = (x) -> {
            System.out.println(x);
        };
        consumer.accept("方法存在一个参数...");
    }

    @Test
    public void test3(){
        Comparator<Integer> comparator = (x, y) -> {
            System.out.println("方法存在多个参数...");
            return Integer.compare(x, y);
        };

        System.out.println("-------------");

        // 等同于上边的写法 只不过方法体只存在了一条返回语句 即return Integer.compare(x, y);
        Comparator<Integer> comparator2 = (x, y) ->Integer.compare(x, y);
    }


}
