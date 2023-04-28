package automacao.service;

import automacao.modelo.Desempenho;
import automacao.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        if(desempenho == Desempenho.A_DESEJAR){
           BigDecimal reajuste3 =  funcionario.getSalario().multiply(new BigDecimal("0.03"));
           funcionario.reajustarSalario(reajuste3);
        }else if(desempenho == Desempenho.BOM){
            BigDecimal reajuste15 =  funcionario.getSalario().multiply(new BigDecimal("0.15"));
            funcionario.reajustarSalario(reajuste15);
        }else if(desempenho == Desempenho.OTIMO){
            BigDecimal reajuste15 =  funcionario.getSalario().multiply(new BigDecimal("0.20"));
            funcionario.reajustarSalario(reajuste15);
        }
    }
}
