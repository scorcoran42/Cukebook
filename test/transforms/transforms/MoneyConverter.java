/***
 * Excerpted from "The Cucumber for Java Book",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/srjcuc for more book information.
***/
package transforms;

import nicebank.Money;
import cucumber.api.Transformer;

public class MoneyConverter extends Transformer<Money> {
     
	public Money transform(String amount) {
		// substring(1) means ignore the currency symbol in the first char
         String[] numbers = amount.substring(1).split("\\.");
         
         int dollars = Integer.parseInt(numbers[0]);
         int cents = Integer.parseInt(numbers[1]);
         
         return new Money(dollars, cents);
     }
 }

