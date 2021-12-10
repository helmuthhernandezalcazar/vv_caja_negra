package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

public class removeLastTElementTest {
	
	private SingleLinkedListImpl<String> miLista;
	private SingleLinkedListImpl<String> miListaVacia;
	
	@BeforeEach
	public void setUp() {
		this.miLista = new SingleLinkedListImpl<>("A", "C", "B", "C", "D", "C");
	}
	
	@Test
	@DisplayName("Excepción lista vacia")
	public void excepcionListaVacia() {
		this.miListaVacia = new SingleLinkedListImpl<>();
		assertThrows(EmptyCollectionException.class, () -> {
			String elemento = this.miListaVacia.removeLast("C");
		});
	}
	
	@Test
	@DisplayName("Excepción el elemento no está en la lista")
	public void excepcionElementoNoLista() {
		assertThrows(NoSuchElementException.class, () -> {
			String elemento = this.miLista.removeLast("X");
		});
	}
	
	@Test
	@DisplayName("Test removeLast() elemento si esta en la lista")
	public void removeLast() throws EmptyCollectionException {
		String last = this.miLista.removeLast("C");
		assertEquals(last, "C");
		assertEquals("[A, C, B, C, D]", this.miLista.toString());
		assertEquals(5, miLista.size());
	}
}
