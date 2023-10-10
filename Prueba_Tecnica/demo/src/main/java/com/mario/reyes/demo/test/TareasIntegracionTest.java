package com.mario.reyes.demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.mario.reyes.demo.controller.usuarioController;

@RunWith(MockitoJUnitRunner.class)
public class TareasIntegracionTest {
    @InjectMocks
    private usuarioController taskController;

    @Mock
    private usuarioController taskRepository;

    @Test
    public void getAllTasks_ShouldReturnAllTasks() {
        // Implementa la prueba aquí
    }
    
    // Agrega más pruebas para otros métodos del controlador
}
