package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.cajanegra.SingleLinkedListImpl;

public class addNTimesTest {
private SingleLinkedListImpl<String> lista;
	
	@BeforeEach
	public void setUp() {
		this.lista = new SingleLinkedListImpl<String>("A", "B", "C", "M", "Y", "Z");
	}
	
	@DisplayName("Test addNTimesStrings()")
	@ParameterizedTest(name="AddNTimes {0} in list")
	@ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["})
	public void addNTimesStrings(String s) {
		int newSize = lista.size() + 3;
		this.lista.addNTimes(s, 3);
		assertEquals("[A, B, C, M, Y, Z, " + s+ ", " + s + ", "+ s +"]", this.lista.toString());	
		assertEquals(newSize, this.lista.size());
	}
	
	@DisplayName("Test addNTimesValores()")
	@ParameterizedTest(name="AddNTimes {0} in list")
	@ValueSource(ints= {1, 2, 3, 5, 10})
	public void addNTimesValores(int i) {
		int newSize = lista.size() + i;
		this.lista.addNTimes("A", i);
		String cadena= "[A, B, C, M, Y, Z";
		for(int j = 0; j < i; j++) {
			cadena += ", A";
		}
		cadena += "]";
		assertEquals(cadena , this.lista.toString());
		assertEquals(newSize, this.lista.size());
	}
	
	@DisplayName("Test addNTimesNMenorCero()")
    public void addNTimesNMenorCero(String s) {
        assertThrows(IllegalArgumentException.class, () -> {
            this.lista.addNTimes(s, -1);
        });
    }
}
