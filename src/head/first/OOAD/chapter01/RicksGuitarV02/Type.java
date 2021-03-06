/**
 * Type.java
 * 26-Feb-2014 : 10:01:38 pm
 * 
 */
package head.first.OOAD.chapter01.RicksGuitarV02;

/**
 * @author ubuntu
 * @packageName = head.first.OOAD.chapter01.RicksGuitarV02:Type.java
 * @createdOn: 26-Feb-2014 : 10:01:38 pm
 * 
 * This is a file for my practice and notes of "Head First
 * OOAD, 1nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://www.headfirstlabs.com/books/hfooad/)
 */
public enum Type {
	ACOUSTIC, ELECTRIC;

	  public String toString() {
	    switch(this) {
	      case ACOUSTIC: return "acoustic";
	      case ELECTRIC: return "electric";
	      default:       return "unspecified";
	    }
	  }

}
