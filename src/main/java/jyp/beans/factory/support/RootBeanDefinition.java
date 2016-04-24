package jyp.beans.factory.support;

import jyp.beans.PropertyValues;
import jyp.beans.factory.config.ConstructorArgumentValues;

public class RootBeanDefinition extends AbstractBeanDefinition {

    private final Class clazz;
    private final ConstructorArgumentValues constructorArgumentValues;

    public RootBeanDefinition(Class clazz, PropertyValues propertyValues,
            ConstructorArgumentValues constructorArgumentValues, String scope) {
        super(propertyValues);
        this.clazz = clazz;
        this.constructorArgumentValues = constructorArgumentValues;
        super.setSingleton(scope.equals("singleton"));
    }

    public Class getBeanClass() {
        return clazz;
    }

    public ConstructorArgumentValues getConstructorArgumentValues() {
        return constructorArgumentValues;
    }

    public boolean isCreateWithConstructor() {
        return this.constructorArgumentValues != null
            && this.constructorArgumentValues.hasConstructorArguments();
    }
}
