package com.adm.employee.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

public class Utils {

	public static String sumaDias(String fecha) {
		LocalDate locFecha = LocalDate.parse(fecha);
		Period periodo = Period.ofDays(1);
		locFecha = locFecha.plus(periodo);
		return locFecha.toString();
	}
	
	public static Date formateaFecha(String fechanac) throws ParseException { 
		//LocalDate fecha = LocalDate.parse(fechanac);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date parsed = format.parse(fechanac);
        java.sql.Date fecha = new java.sql.Date(parsed.getTime());
        
	    System.out.println(fechanac+"\t"+fecha);
		return fecha;  
	}
}
