package app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Зберігати під час виконання
@Target(ElementType.METHOD) // Застосовувати до методів
public @interface Author {

    String name(); // Ім'я автора

    String surname(); // Прізвище автора
}
