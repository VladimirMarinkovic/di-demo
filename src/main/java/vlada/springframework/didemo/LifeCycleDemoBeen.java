package vlada.springframework.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBeen implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBeen() {
        System.out.printf("## LifeCycleBeen Konstruktor \n");
    }

    @Override
    public void destroy() throws Exception {
        System.out.printf("## LifeCycleBeen Destroy \n");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.printf("## LifeCycleBeen Proprties set \n");
    }



    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.printf("## LifeCycleBeen Factory set \n");
    }


    @Override
    public void setBeanName(String s) {
        System.out.printf("## LifeCycleBeen Beem naziv: " + s + " \n");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.printf("## LifeCycleBeen Contex set \n");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.printf(" ## Post Construct metod ce biti pozvan \n");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.printf(" ## Predestroy metod ce biti pozvan \n");
    }

    public void beforeInit() {
        System.out.printf(" ## - Before Init -  poziva Bean Post Procesor \n");
    }

    public void afterInit() {
        System.out.printf("## - After Init -  poziva Been Post Procesor \n");
    }







}
