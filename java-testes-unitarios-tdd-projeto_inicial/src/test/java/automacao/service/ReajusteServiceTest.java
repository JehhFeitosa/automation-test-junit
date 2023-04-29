package automacao.service;

import automacao.modelo.Desempenho;
import automacao.modelo.Funcionario;
import org.junit.jupiter.api.*;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;

    //Antes de iniciar os testes chama esse método.
    @BeforeEach
    public void inicializar(){
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Stich", LocalDate.now(), new BigDecimal("1000"));
    }

    //Após Finalizar os testes executa esse método.
    @AfterEach
    public void finalizar(){
        System.out.println("FIM!");
    }

    //Executa esse Método antes de todos.
    @BeforeAll
    public static void antesDeTodos(){
        System.out.println("ANTES DE TODOS");
    }

    //Executa esse Método depois de todos.
    @AfterAll
    public static void depoisDeTodos(){
        System.out.println("DEPOIS DE TODOS");
    }


    @Test
    public void reajustDeveriaSerDe3PorCentoQuandoDesempenhoForADesejar(){
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajustDeveriaSerDe15PorCentoQuandoDesempenhoForBom(){
        service.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajustDeveriaSerDe20PorCentoQuandoDesempenhoForOtimo(){
        service.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

}
