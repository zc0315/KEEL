/***********************************************************************

	This file is part of KEEL-software, the Data Mining tool for regression, 
	classification, clustering, pattern mining and so on.

	Copyright (C) 2004-2010
	
	F. Herrera (herrera@decsai.ugr.es)
    L. Sánchez (luciano@uniovi.es)
    J. Alcalá-Fdez (jalcala@decsai.ugr.es)
    S. García (sglopez@ujaen.es)
    A. Fernández (alberto.fernandez@ujaen.es)
    J. Luengo (julianlm@decsai.ugr.es)

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with this program.  If not, see http://www.gnu.org/licenses/
  
**********************************************************************/


package keel.Algorithms.Shared.Exceptions;

	/**
	  * <p>
	  * This exception is to report an invalid fitness function.
	  * </p>
* <p> 
* @author Written by Luciano Sánchez (University of Oviedo) 08/03/2004
* @author Modified by Enrique A. de la Cal (University of Oviedo) 13/12/2008  
* @version 1.0 
* @since JDK1.4 
* </p> 
*/
public class invalidFitness extends Exception{

	 /**
	  * <p>
	  * Creates an new invalidFitness object calling the super() method();
	  * 
	  * </p>	
	  */
 public  invalidFitness() { super(); }
 /**
  * <p>
  * 
  * Creates an new invalidFitness object calling the super(s) method() with the report string s.
  * </p>	
  *
  * @param s the report String.
  */
 public  invalidFitness(String s) { super(s); }
}

