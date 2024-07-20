package app;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationDemo {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = ArrayUtils.class;

        for (Method method : clazz.getDeclaredMethods()) {
            // Отримати анотацію MethodInfo
            MethodInfo methodInfoAnnotation = method.getAnnotation(MethodInfo.class);
            if (methodInfoAnnotation != null) {
                System.out.println("Метод: " + method.getName());
                System.out.println("  - Назва: " + methodInfoAnnotation.name());
                System.out.println("  - Тип повернення: " + methodInfoAnnotation.returnType().getSimpleName());
                System.out.println("  - Опис: " + methodInfoAnnotation.description());

                // Отримати анотацію Author (якщо присутня)
                Author authorAnnotation = method.getAnnotation(Author.class);
                if (authorAnnotation != null) {
                    System.out.println("  - Автор: " + authorAnnotation.name() + " " + authorAnnotation.surname());
                }
                System.out.println();
            }
        }
    }
}
