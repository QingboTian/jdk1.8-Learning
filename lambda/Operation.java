package jdk1_8.lambda;

/**
 * @InterfaceName Operation
 * @Description: TODO
 * @Author 田清波
 * @Mail tqb820965236@163.com
 * @Date 2019/10/7 0:34
 * @Version v1.0
 */
public interface Operation<T> {
    public T op(T t);
}
