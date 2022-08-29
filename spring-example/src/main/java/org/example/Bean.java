package org.example;

import org.example.inject.A;
import org.example.inject.B;
import org.springframework.context.annotation.ComponentScan;

import jdk.internal.instrumentation.Logger;

/**
 * @Auther: VNBear
 * @Date: 2022/7/26 22:24
 * @Description:
 */

@ComponentScan("org.example.inject")
public class Bean {

	public Bean(){
		System.out.println(" bean construct");
	}

	public Bean(A a){
		System.out.println(" bean construct a");
	}

	public Bean(B b){
		System.out.println(" bean construct b");
	}

	public void setA(A a){
		System.out.println(" bean set a");
	}

	public void setB(B b){
		System.out.println(" bean set b");
	}
}
