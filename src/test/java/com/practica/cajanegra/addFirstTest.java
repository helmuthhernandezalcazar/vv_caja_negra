package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.SingleLinkedList;
import com.cajanegra.SingleLinkedListImpl;

public class addFirstTest {
	private SingleLinkedListImpl<String> miLista;
	
	@BeforeEach
	public void setUp() {
		this.miLista = new SingleLinkedListImpl<>("A", "B", "C", "M", "Y", "Z");
	}
	
	@ParameterizedTest(name="Add Last {0} in list")
	@ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["})
	public void addLast(String s) {
		this.miLista.addLast(s);
		assertEquals("[A, B, C, M, Y, Z, " + s + "]", this.miLista.toString());
	}
	
	@ParameterizedTest(name="Add First {0} in list")
	@ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["})
	public void addFist(String s) {
		this.miLista.addFirst(s);
		assertEquals("["+ s +", A, B, C, M, Y, Z]", this.miLista.toString());
	}
}
