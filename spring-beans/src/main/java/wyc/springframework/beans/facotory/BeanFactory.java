package wyc.springframework.beans.facotory;

/**
 * @author wangyongchao
 * @date 2018/5/9  11:18
 */
public interface BeanFactory {


    Object getBean(String beanName);


    <T> T  getBean(String beanName,Class<T> classType  );





}
