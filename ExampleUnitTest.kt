import org.junit.Test
import org.junit.Assert.assertEquals

class MainViewModelTest {

    @Test
    fun compararTextos_iguales_retornaTrue() {
        val viewModel = MainViewModel()
        val resultado = viewModel.compararTextos("Texto", "Texto")
        assertEquals(true, resultado)
    }

    @Test
    fun compararTextos_diferentes_retornaFalse() {
        val viewModel = MainViewModel()
        val resultado = viewModel.compararTextos("Texto1", "Texto2")
        assertEquals(false, resultado)
    }
}
