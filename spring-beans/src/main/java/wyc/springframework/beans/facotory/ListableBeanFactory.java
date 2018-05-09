package wyc.springframework.beans.facotory;

import org.springframework.core.ResolvableType;

import java.lang.annotation.Annotation;

/**
 * @author wangyongchao
 * @date 2018/5/9  14:05
 */
public interface ListableBeanFactory extends BeanFactory {



    boolean containsBeanDefinition(String beanName);



    int getBeanDefinitionCount();



    String[] getBeanDefinitionNames();




    String[] getBeanNamesForType(Class<?> type);




    String[] getBeanNamesForAnnotation(Class<? extends Annotation> annotationType);

}
