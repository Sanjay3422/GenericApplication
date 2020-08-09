package com.claustroproject.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.core.type.ClassMetadata;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClaustroProject {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		String message ="Welcome to Login page";
		return new ModelAndView("welcome", "message", message);
	}

	// with predicate
	public static <T> List<Class<? extends T>> find(Class<T> interfaces) {
		final Supplier<List<Class<? extends T>>> supplier = () -> loadClasses(
				cmc -> does(cmc, interfaces)).stream()
				.map(col -> (Class<? extends T>) col)
				.collect(Collectors.toList());
		Function<Integer, String> mapper = (x) -> x.toString();
		return null;
	}
	
	private static List<Class<?>> loadClasses(Predicate<ClassMetadata> metadata) {
		return null;
	}

	private static boolean does(ClassMetadata classMeata, Class<?> intr) {
		return false;
	}
	
	//without predicate
	public static <T> List<Class<? extends T>> find1(Class<T> interfaces) {
		final Supplier<List<Class<? extends T>>> supplier = () -> loadClasses1(
				interfaces).stream()
				.map(col -> (Class<? extends T>) col)
				.collect(Collectors.toList());
		List<Integer> kj = new ArrayList<>();
		kj.stream().map(a -> "a");
		return null;
	}
	
	private static <T> List<Class<?>> loadClasses1(Class<T> minterfacesetadata) {
		// some metadata instead of null
		does(null,minterfacesetadata);
		Square s = (x) -> x*x;
		s.calculate(5); // returns 25
		Predicate<Integer> multiply= (x) -> x == 5;
		multiply.test(6);
		return null;
	}

}

@FunctionalInterface
interface Square 
{ 
    int calculate(int x); 
} 
