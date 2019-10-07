package jdk1_8.lambda.function_interface;

import jdk1_8.lambda.collections_test.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @ClassName FunctionInterface
 * @Description: 四大函数式接口
 * @Author 田清波
 * @Mail tqb820965236@163.com
 * @Date 2019/10/7 16:50
 * @Version v1.0
 */
public class FunctionInterface {

    /**
     * 1. Consumer<T> ： 消费型接口
     *  void accept(T t);
     *
     * 2. Supplier<T> ： 供应型接口
     *  t get();
     *
     * 3. Function<T, R> ： 函数型接口
     *  R apply(T t);
     *
     * 4. Predicate<T> ： 断言型接口
     *  boolean test(T t);
     */

    /**
     * 消费型接口
     */
    @Test
    public void test1(){
        stringHandler("Hello World", System.out::println);
    }

    public void stringHandler(String e, Consumer<String> fun){
        fun.accept(e);
    }

    /**
     * 供应式接口
     */
    @Test
    public void test2(){
        List<Integer> lists = numList(10, () -> {
            Random random = new Random();
            return random.nextInt(10);
        });

        lists.forEach(System.out::println);// 方法引用
    }

    public List<Integer> numList(Integer num, Supplier<Integer> fun){
        List<Integer> lists = new ArrayList<>();
        for (int i = 0 ; i < num; i++) {
            lists.add(fun.get());
        }
        return lists;
    }

    /**
     * 函数型接口
     */
    @Test
    public void test3(){
        String string = stringHelper("abcdefg", (x) -> x.toUpperCase());
        System.out.println(string);
    }

    public String stringHelper(String str, Function<String, String> fun){
        return fun.apply(str);
    }

    /**
     * 断言式接口
     */
    @Test
    public void test4(){
        // 年龄是否大于15
        Employee e = new Employee(1, "张三", 18, 999.9);
        System.out.println(ageHelper(e, (x) -> x.getAge() > 15));
        System.out.println(ageHelper(e, (x) -> x.getAge() > 20));
    }

    public boolean ageHelper(Employee e, Predicate<Employee> fun) {
        return fun.test(e);
    }
}
