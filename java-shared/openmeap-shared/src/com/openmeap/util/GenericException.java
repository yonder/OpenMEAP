/*
 ###############################################################################
 #                                                                             #
 #    Copyright (C) 2011-2012 OpenMEAP, Inc.                                   #
 #    Credits to Jonathan Schang & Robert Thacher                              #
 #                                                                             #
 #    Released under the LGPLv3                                                #
 #                                                                             #
 #    OpenMEAP is free software: you can redistribute it and/or modify         #
 #    it under the terms of the GNU Lesser General Public License as published #
 #    by the Free Software Foundation, either version 3 of the License, or     #
 #    (at your option) any later version.                                      #
 #                                                                             #
 #    OpenMEAP is distributed in the hope that it will be useful,              #
 #    but WITHOUT ANY WARRANTY; without even the implied warranty of           #
 #    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
 #    GNU Lesser General Public License for more details.                      #
 #                                                                             #
 #    You should have received a copy of the GNU Lesser General Public License #
 #    along with OpenMEAP.  If not, see <http://www.gnu.org/licenses/>.        #
 #                                                                             #
 ###############################################################################
 */

package com.openmeap.util;

public class GenericException extends Exception {

	private Throwable cause;
	
	public GenericException() {
	}

	public GenericException(String arg0) {
		super(arg0);
	}

	public GenericException(Throwable arg0) {
		this.cause=arg0;
	}

	public GenericException(String arg0, Throwable arg1) {
		super(arg0);
		this.cause=arg1;
	}

	public GenericException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0);
		this.cause=arg1;
	}
	
	public Throwable getCause() {
		return this.cause;
	}

}