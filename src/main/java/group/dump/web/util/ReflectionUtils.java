package group.dump.web.util;

import org.reflections.Reflections;

import java.util.Set;

public class ReflectionUtils {

    private static final Reflections reflections = new Reflections("");

    public static Set<Class<?>> getAllClass(Class clazz) {
        Set<Class<?>> classesList = reflections.getTypesAnnotatedWith(clazz);
        return classesList;
    }
}
