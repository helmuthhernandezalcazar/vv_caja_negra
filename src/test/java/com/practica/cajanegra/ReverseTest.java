package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

class ReverseTest {
	private SingleLinkedListImpl<String> lista;
	
	@DisplayName("Reverse")
	@Test
	public void reverse() {
		this.lista = new SingleLinkedListImpl<String>("A", "S", "C", "I");
		
		assertEquals("[I, C, S, A]", this.lista.reverse().toString());
		assertEquals("[A, S, C, I]", this.lista.toString());
	}
	
	@DisplayName("Reverse con lista vacía")
	@Test
	public void reverseListaVacia() {
		this.lista = new SingleLinkedListImpl<String>();
		
		assertEquals("[]", this.lista.reverse().toString());
		assertEquals("[]", this.lista.toString());
	}
	
	@DisplayName("Reverse con un elemento en la lista")
	@Test
	public void reverseListaUnElemento() {
		this.lista = new SingleLinkedListImpl<String>("A");
		
		assertEquals("[A]", this.lista.reverse().toString());
		assertEquals("[A]", this.lista.toString());
	}
}
