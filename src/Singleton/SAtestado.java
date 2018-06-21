/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import br.com.haila.objeto.CadastrarAtestado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SAtestado {
    private List<CadastrarAtestado> cadastraratestado = new ArrayList();

    public List<CadastrarAtestado> getCadastraratestado() {
        return cadastraratestado;
    }
    
    
    private SAtestado() {
    }
    
    public static SAtestado getInstance() {
        return SAtestadoHolder.INSTANCE;
    }
    
    private static class SAtestadoHolder {

        private static final SAtestado INSTANCE = new SAtestado();
    }
}
