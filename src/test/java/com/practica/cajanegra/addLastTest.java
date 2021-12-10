package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.cajanegra.SingleLinkedListImpl;

public class addLastTest {
	
	private SingleLinkedListImpl<String> miLista;
	
	@BeforeEach
	public void setUp() {
		this.miLista = new SingleLinkedListImpl<>("A", "B", "C", "M", "Y", "Z");
	}
	
	@DisplayName("Test addLast()")
	@ParameterizedTest(name="Add Last {0} in list")
	@ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["})
	public void addLast(String s) {
		this.miLista.addLast(s);
		assertEquals("[A, B, C, M, Y, Z, " + s + "]", this.miLista.toString());
		assertEquals(7, miLista.size());
	}
}
