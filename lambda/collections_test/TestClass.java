package jdk1_8.lambda.collections_test;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName TestClass
 * @Description: TODO
 * @Author 田清波
 * @Mail tqb820965236@163.com
 * @Date 2019/10/7 11:40
 * @Version v1.0
 */
public class TestClass {

    List<Employee> lists = Arrays.asList(
            new Employee(1, "张三", 18, 999.9),
            new Employee(2, "李四", 25, 100.9),
            new Employee(3, "王五", 18, 999.9),
            new Employee(4, "赵六", 20, 888.9)
    );

    @Test
    public void test1() {
        Collections.sort(lists, (e1, e2) -> {
            /**
             * 按工资递增排序， 若工资相同则按姓名排序
             */
            if (e1.getSalary() == e2.getSalary()){
                return e1.getName().compareTo(e2.getName());
            }else {
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });

        lists.forEach((x) -> System.out.println(x));
    }
}
