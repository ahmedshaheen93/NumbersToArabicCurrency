/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberToArabic;

import java.math.BigDecimal;

/**
 *
 * @author lts
 */
public class Main {
    public static void main(String[] args){
        // test SAR Currency
        String convertToArabic = NumberToArabic.convertToArabic(new BigDecimal(1920.25), "SAR");
        System.out.println(convertToArabic);
    }
}
