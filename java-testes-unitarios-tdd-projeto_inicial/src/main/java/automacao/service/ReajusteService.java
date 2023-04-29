package automacao.service;

import automacao.modelo.Desempenho;
import automacao.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
           BigDecimal percentual = desempenho.percentualReajuste();
           BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
           funcionario.reajustarSalario(reajuste);

    }
}
