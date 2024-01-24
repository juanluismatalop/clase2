package Colecciones.Ejercicios.EjerciciosPropuestos.ExpresionesRegulares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelperTest {

    @Test
    void validarDNI() {
        assertNull(Helper.validarDNI(null));
        assertTrue(Helper.validarDNI("12345678a"));
    }

    @Test
    void validarPasaporte() {
        assertNull(Helper.validarPasaporte(null));
        assertTrue(Helper.validarPasaporte("ABC123456"));
        assertTrue(Helper.validarPasaporte("AbC123456"));
        assertFalse(Helper.validarPasaporte("abcd12345"));
        assertFalse(Helper.validarPasaporte("abc1234567"));
    }

    @Test
    void validarIBAN() {
        assertNull(Helper.validarIBAN(null));
    }
}