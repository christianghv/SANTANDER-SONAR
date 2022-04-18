/*
 * Credits
 * The Credits API provides information about customer credit lines.
 *
 * OpenAPI spec version: 2.2.0
 * Contact: gipinacho@santander.com.mx
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.bancosantander.likeu.model;

import java.math.BigDecimal;

/**
 * Money Fields that represent money, must follow this structure:
 */

public class Money {
	private BigDecimal amount = null;

	private String currencyCode = null;

	public Money() {
	}
/**
 * String
 * @param      amount    array that is the source of characters.
 * @param      currencyCode    array that is the source of characters.
 * @exception  IndexOutOfBoundsException  if the <code>offset</code>
 */
	public Money(java.math.BigDecimal amount, java.lang.String currencyCode) {
		this.amount = amount;
		this.currencyCode = currencyCode;
	}
/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 * @param      amount    array that is the source of characters.
	 * @return		retorno
	 */
	public Money amount(BigDecimal amount) {
		this.amount = amount;
		return this;
	}
	/**
	 * Amount - number
	 * 
	 * @return amount
	 **/
	public BigDecimal getAmount() {
		return amount;
	}
/**
	 * @param BigDecimal
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 * @param      currencyCode    array that is the source of characters.
	 * @return		retorno
	 */
	public Money currencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
		return this;
	}

	/**
	 * Currency codes - ISO 4217
	 * 
	 * @return currencyCode
	 **/
	public String getCurrencyCode() {
		return currencyCode;
	}
/**
	 * @param String
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Money {\n");

		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    currencyCode: ").append(toIndentedString(currencyCode))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}