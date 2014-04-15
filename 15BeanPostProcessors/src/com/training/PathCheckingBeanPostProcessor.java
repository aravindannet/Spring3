package com.training;

import java.io.File;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;

public class PathCheckingBeanPostProcessor implements BeanPostProcessor, PriorityOrdered
{

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
	System.out.println("In postProcessBeforeInitialization");
	if (bean instanceof StorageConfig)
	{
	    String path = ((StorageConfig) bean).getPath();
	    File file = new File(path);
	    if (!file.exists())
	    {
		file.mkdirs();
	    }
	}
	return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {

	return bean;
    }

    public int getOrder()
    {
	return 0;
    }

}
