package com.practica.cajanegra;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

public class removeLastTElement {
	private SingleLinkedListImpl<String> miLista;
	private SingleLinkedListImpl<String> miListaVacia;
	private SingleLinkedListImpl<String> miListaSinElemento;
	
	@BeforeEach
	public void setUp() {
		this.miLista = new SingleLinkedListImpl<>("A", "C", "B", "C", "D", "C");
	}
	
	@DisplayName("Excepción lista vacia")
	@Test
	public void excepcionListaVacia() {
		this.miListaVacia = new SingleLinkedListImpl<>();
		assertThrows(EmptyCollectionException.class, () -> {
		String elemento;
		elemento = this.miListaVacia.removeLast("C");
	  });
	 
	}
	
	@DisplayName("Excepción el elemento no está en la lista")
	@Test
	public void excepcionElementoNoLista() {
		this.miListaSinElemento = new SingleLinkedListImpl<>("A", "B", "D");
		assertThrows(java.util.NoSuchElementException.class, () -> {
		String elemento = this.miListaSinElemento.removeLast("X");
	  });
	 
	}
	
	@DisplayName("Test removeLast() elemento si esta en la lista")
	@Test
	public void removeLast() throws EmptyCollectionException {
		System.out.println("Lista antes de eliminar el elemento: " + (miLista.toString()));
		String last = this.miLista.removeLast("C");
		assertEquals(last, "C");
		System.out.println("Lista despues de eliminar el elemento: " + (miLista.toString()));
		assertEquals("[A,C,B,C,D]", this.miLista.toString());
		assertEquals(5, miLista.size());

	}
	
	@DisplayName("Test removeLast() elemento no esta en la lista")
	@Test
	public void removeLastElementoT() throws java.util.NoSuchElementException, EmptyCollectionException {
		this.miListaSinElemento = new SingleLinkedListImpl<>("A", "B", "D");
		String last = this.miListaSinElemento.removeLast("C");
		
	}
}
