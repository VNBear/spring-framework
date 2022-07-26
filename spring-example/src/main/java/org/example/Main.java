package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: ${USER}
 * @Date: ${DATE} ${HOUR}:${MINUTE}
 * @Description:
 */
public class Main {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Bean.class);
		context.refresh();
		System.out.println(context.getBean(Bean.class));
	}
}