package com.practica.cajanegra;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

public class isEmptyTest {
	
	private SingleLinkedListImpl<String> miListaVacia = new SingleLinkedListImpl<>();
	private SingleLinkedListImpl<String> miListaNoVacia = new SingleLinkedListImpl<>("A", "B", "M", "Y", "Z");
	
	@Test
	@DisplayName("isEmptyVacia")
	public void isEmptyVacia() {
		assertTrue(this.miListaVacia.isEmpty());
	}
	
	@Test
	@DisplayName("isEmptyNoVacia")
	public void isEmptyNoVacia() {
		assertFalse(this.miListaNoVacia.isEmpty());
	}

}
