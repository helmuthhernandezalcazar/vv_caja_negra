package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

public class removeLastTest {
	private SingleLinkedListImpl<String> miLista;
	private SingleLinkedListImpl<String> miListaVacia;
	
	@BeforeEach
	public void setUp() {
		this.miLista = new SingleLinkedListImpl<>("A", "B", "C", "M", "Y", "Z");
	}
	
	@DisplayName("Excepción lista vacia")
	@Test
	public void excepcionListaVacia() {
		this.miListaVacia = new SingleLinkedListImpl<>();
		assertThrows(EmptyCollectionException.class, () -> {
		String elemento = this.miListaVacia.removeLast();
	  });
	 
	}
	
	@DisplayName("Test removeLast()")
	@Test
	public void removeLast() throws EmptyCollectionException {
		
		String last = this.miLista.removeLast();
		assertEquals(last, "Z");
		assertEquals("[A, B, C, M, Y]", this.miLista.toString());
		assertEquals(5, miLista.size());

	}
}
