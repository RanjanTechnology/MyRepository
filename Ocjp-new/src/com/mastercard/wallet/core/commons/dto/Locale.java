/*******************************************************************************
 * Copyright (c) 2016, MasterCard International Incorporated and/or its
 * affiliates. All rights reserved.
 *
 * TO THE EXTENT PERMITTED BY LAW, THE SOFTWARE IS PROVIDED "AS IS", WITHOUT 
 * WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NON INFRINGEMENT. TO THE EXTENT PERMITTED BY LAW, IN NO EVENT SHALL
 * MASTERCARD OR ITS AFFILIATES BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS 
 * IN THE SOFTWARE.
 *******************************************************************************/
package com.mastercard.wallet.core.commons.dto;

import java.io.Serializable;


/**
 * 	@author &#169;2015-2016 MasterCard. Proprietary. All rights reserved.
 *	Locale detail
 */
public class Locale implements Serializable {

	private static final long serialVersionUID = 1L;

	private String locale;

	private String language;

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public Locale getAllLocale(String userLocal) {

		long timeBefore = System.currentTimeMillis();
		java.util.Locale locale2 = java.util.Locale.forLanguageTag(userLocal);
		Locale locale = new Locale();
		locale.setLocale(userLocal);
		locale.setLanguage(locale2.getLanguage());
		
		long timeAfter = System.currentTimeMillis();
		System.out.println("Locale#1 -> " + locale2 + ", Time taken = " + (timeAfter - timeBefore));
		
		System.out.println(locale.getLanguage());
		System.out.println(locale.getLocale());
		return locale;
	}

}
