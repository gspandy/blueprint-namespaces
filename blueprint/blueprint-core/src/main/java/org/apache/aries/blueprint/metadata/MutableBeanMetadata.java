package org.apache.aries.blueprint.metadata;

import java.util.List;

import org.osgi.service.blueprint.reflect.BeanArgument;
import org.osgi.service.blueprint.reflect.BeanMetadata;
import org.osgi.service.blueprint.reflect.BeanProperty;
import org.osgi.service.blueprint.reflect.Metadata;
import org.osgi.service.blueprint.reflect.Target;

public interface MutableBeanMetadata<T extends BeanMetadata> 
	extends MutableComponentMetadata<T, MutableBeanMetadata<T>>, BeanMetadata {
	
	MutableBeanMetadata<T> className(String name);
	MutableBeanMetadata<T> initMethod(String method);
	MutableBeanMetadata<T> destroyMethod(String method);
	
	/**
	 * Specify / overwrite existing arguments
	 */
	MutableBeanMetadata<T> arguments(List<BeanArgument> arguments);

	/**
	 * Specify / overwrite existing arguments
	 */
	MutableBeanMetadata<T> arguments(BeanArgument ... arguments);
	
	/**
	 * Add an argument
	 */
	MutableBeanMetadata<T> addArgument(BeanArgument argument);
	
	/**
	 * Specify / overwrite existing properties
	 */
	MutableBeanMetadata<T> properties(List<BeanProperty> properties);
	
	/**
	 * Specify / overwrite existing properties
	 */
	MutableBeanMetadata<T> properties(BeanProperty ... properties);
	
	/**
	 * Add a property
	 */
	MutableBeanMetadata<T> addProperty(BeanProperty property);
	MutableBeanMetadata<T> addProperty(String name, Metadata value);
	
	MutableBeanMetadata<T> factoryMethod(String method);
	MutableBeanMetadata<T> factoryComponent(Target component);
	MutableBeanMetadata<T> scope(String scope);	
}
