package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.cajanegra.SingleLinkedListImpl;

public class IndexOfTest {
	
	private SingleLinkedListImpl<String> lista;
	
	@ParameterizedTest(name="Posición primera aparición de {0}")
	@ValueSource(strings= {"A", "B", "M", "Y", "Z", "@", "["})
	public void IndexOfSEnLista(String s) {
		
		this.lista = new SingleLinkedListImpl<String>("A", "S", "C", "I", "B", "Y", "Z", "B", "B", "M", "@", "[", "@");
		Map<String, Integer> resultadosEsperados = new HashMap<String, Integer>();
		resultadosEsperados.put("A", 1);
		resultadosEsperados.put("B", 5);
		resultadosEsperados.put("M", 10);
		resultadosEsperados.put("Y", 6);
		resultadosEsperados.put("Z", 7);
		resultadosEsperados.put("@", 11);
		resultadosEsperados.put("[", 12);
		
		assertEquals(resultadosEsperados.get(s), lista.indexOf(s));
	}
	
	@ParameterizedTest(name="Posición de {0} en lista que no aparece")
	@ValueSource(strings= {"A", "M", "Z", "@", "["})
	public void IndexOfSNoEnLista(String s) {
		
		this.lista = new SingleLinkedListImpl<String>("J", "U", "E", "V", "E", "S");
		
		assertThrows(NoSuchElementException.class, () ->{
			lista.indexOf(s);
		});
	}
	
}
