/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import br.com.haila.objeto.Consulta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SConsulta {
    private List<Consulta> consulta = new ArrayList();
    
    
    public List<Consulta>getConsulta(){
        return consulta;
    }
    
    
    private SConsulta() {
    }
    
    public static SConsulta getInstance() {
        return SConsultaHolder.INSTANCE;
    }
    
    private static class SConsultaHolder {

        private static final SConsulta INSTANCE = new SConsulta();
    }
}
