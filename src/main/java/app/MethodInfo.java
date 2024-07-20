package app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Зберігати під час виконання
@Target(ElementType.METHOD) // Застосовувати до методів
public @interface MethodInfo {

    String name() default ""; // Назва методу (за замовчуванням "")

    Class<?> returnType(); // Тип поверненого значення

    String description() default ""; // Опис (за замовчуванням "")
}
