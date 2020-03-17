package main.java.CustomAnnotations;

import main.java.SpringBeans.Wheel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.requireNonNull;

public class Annotations {


    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface JsonField {
        public String value() default "";
    }

    public static Map<String,String> findAnnotatedParameters(Object object){
        Map<String, String> jsonElements=null;
        try {
            Class<?> objectClass = requireNonNull(object).getClass();
            jsonElements = new HashMap<>();
            for (Field field: objectClass.getDeclaredFields()) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(JsonField.class)) {
                    jsonElements.put(getSerializedKey(field), (String) field.get(object));
                }
            }

        }
        catch (IllegalAccessException e) {

        }
        return jsonElements;
    }
    private static String getSerializedKey(Field field) {
        String annotationValue = field.getAnnotation(JsonField.class).value();
        if (annotationValue.isEmpty()) {
            return field.getName();
        }
        else {
            return annotationValue;
        }
    }
}
