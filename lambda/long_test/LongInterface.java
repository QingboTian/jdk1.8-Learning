package jdk1_8.lambda.long_test;

/**
 * @InterfaceName LongInterface
 * @Description: TODO
 * @Author 田清波
 * @Mail tqb820965236@163.com
 * @Date 2019/10/7 12:09
 * @Version v1.0
 */
@FunctionalInterface
public interface LongInterface<T, R> {
    public R getValue(T t1, T t2);
}
