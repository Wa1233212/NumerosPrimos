/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import numerosprimos.CribaEratostenes;
import static numerosprimos.CribaEratostenes.generarPrimos;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wa
 */
public class TestCriba {
    
    
    @Test
    public void primerCasoApuesta() throws Exception {
       int[] centArray = CribaEratostenes.generarPrimos(0);
       for (int i=0;i<centArray.length;i++){
            System.out.println(centArray[i]);
            
        }
    }
    @Test
    public void segundoCasoApuesta() throws Exception {
       int[] centArray = CribaEratostenes.generarPrimos(2);
       for (int i=0;i<centArray.length;i++){
            System.out.println(centArray[i]);
            
        }
    }
    @Test
    public void tercerCasoApuesta() throws Exception {
       int[] centArray = CribaEratostenes.generarPrimos(3);
       for (int i=0;i<centArray.length;i++){
            System.out.println(centArray[i]);
            
        }
    }
    @Test
    public void cuartoCasoApuesta() throws Exception {
       int[] centArray = CribaEratostenes.generarPrimos(100);
       for (int i=0;i<centArray.length;i++){
            System.out.println(centArray[i]);
            
        }
    }
    
}
