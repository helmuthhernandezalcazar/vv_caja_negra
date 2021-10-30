package com.practica.cajanegra;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test; 
import com.cajanegra.*;
public class Test1 {
	@Test 
	
	public void test() {
		AbstractSingleLinkedListImpl<String> lista = new SingleLinkedListImpl<String>("A", "B", "C");
		Character a = 'a';
		Character A = 'A';
		System.out.println(a > A);
		lista.addFirst("s");
		lista.addFirst("A");
		lista.addLast("B");
		System.out.println(lista.toString());
		
		
	}
}
