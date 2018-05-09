package wyc.springframeword.core;
import wyc.springframework.beans.facotory.ConfigurableBeanFactory;

/**
 * @author wangyongchao
 * @date 2018/5/9  14:32
 */
public interface BeanDefinition extends  AttributeAccessor  {

    //scope值，单例
    String SCOPE_SINGLETON = ConfigurableBeanFactory.SCOPE_SINGLETON;

    //scope值，非单例
    String SCOPE_PROTOTYPE = ConfigurableBeanFactory.SCOPE_PROTOTYPE;


    //Bean角色：
    //用户
    int ROLE_APPLICATION = 0;
    //某些复杂的配置
    int ROLE_SUPPORT = 1;
    //完全内部使用
    int ROLE_INFRASTRUCTURE = 2;


    //返回此bean定义的父bean定义的名称，如果有的话 <bean parent="">
    String getParentName();

    void setParentName(String parentName);

    //获取bean对象className <bean class="">
    String getBeanClassName();


    void setBeanClassName(String beanClassName);

    //定义创建该Bean对象的工厂l类  <bean factory-bean="">
    String getFactoryBeanName();



    void setFactoryBeanName(String factoryBeanName);


    //定义创建该Bean对象的工厂方法 <bean factory-method="">
    String getFactoryMethodName();


    void setFactoryMethodName(String factoryMethodName);


    //<bean scope="singleton/prototype">
    String getScope();


    void setScope(String scope);


    //懒加载 <bean lazy-init="true/false">
    boolean isLazyInit();


    void setLazyInit(boolean lazyInit);

    //依赖对象  <bean depends-on="">
    String[] getDependsOn();


    void setDependsOn(String[] dependsOn);


    //是否为被自动装配 <bean autowire-candidate="true/false">
    boolean isAutowireCandidate();


    void setAutowireCandidate(boolean autowireCandidate);

    //是否为主候选bean    使用注解：@Primary
    boolean isPrimary();


    void setPrimary(boolean primary);


    //是否为单例
    boolean isSingleton();
    //是否为原型
    boolean isPrototype();
    //是否为抽象类
    boolean isAbstract();

    //获取这个bean的应用
    int getRole();

    //返回对bean定义的可读描述。
    String getDescription();

    //返回该bean定义来自的资源的描述（用于在出现错误时显示上下文）
    String getResourceDescription();

    BeanDefinition getOriginatingBeanDefinition();



}
