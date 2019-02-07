package com.hackerrank.JavaEightFeatures.OptionalClass;

import java.util.Optional;

/*
 employee.getPassport() has raised a NullPointerException.
This might be because there are some full-time employees who do not have a passport.
With previous java versions this was handled by doing an if clause check for null values
but that would hide/clash with the business validation like the code should query all employees
rather than filtering the ones with passport. And in order to decouple the null check from a business validation
java 8 introduced optional classed in java.util package
flapMap() is used when the method reference passed to it, returns an Optional while map() 
is used when the method reference passed to it, returns a non optional value. 
 */

public class FullTimeEmployee {

	// Declaring an Optional container which can hold Passport object
    private Optional<PassPortDetails> passport = Optional.empty();    // The container is initially empty
    private Optional<PassPortDetails> passport1 = Optional.of(new PassPortDetails(111,"Dagim"));
    private Optional<PassPortDetails> passport2 = Optional.ofNullable(new PassPortDetails(111,"Dagimawit"));
    
    public Optional<PassPortDetails> getPassport() {
        return passport;
    }
    public void setPassport(Optional<PassPortDetails> passport) {
        this.passport = passport;
    }
    // Other fields and methods

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
