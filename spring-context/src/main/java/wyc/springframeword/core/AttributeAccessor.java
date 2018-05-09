package wyc.springframeword.core;

/**
 * @author wangyongchao
 * @date 2018/5/9  14:16
 */
public interface AttributeAccessor {

    String[] attributeNames();

    Object getAttribute(String name);

    boolean hasAttribute(String name);

    Object removeAttribute(String name);

    void setAttribute(String name, Object value);


}
