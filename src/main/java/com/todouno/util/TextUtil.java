package com.todouno.util;

public class TextUtil {
	
	public String limpiar(String limpiarTexto) {
        return limpiarTexto.replaceAll("\\s+", " ");
    }
}
