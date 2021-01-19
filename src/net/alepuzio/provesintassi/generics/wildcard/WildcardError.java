package net.alepuzio.provesintassi.generics.wildcard;

import java.util.List;

public class WildcardError {
	/**
	 * Link all references for a local rename (does not change references in
	 * other files) error: method set in interface List<E> cannot be applied to
	 * given types; i.set(0, i.get(0)); ^ required: int,CAP#1 found: int,Object
	 * reason: actual argument Object cannot be converted to CAP#1 by method
	 * invocation conversion where E is a type-variable: E extends Object
	 * declared in interface List where CAP#1 is a fresh type-variable: CAP#1
	 * extends Object from capture of ? 1 error
	 */
	void foo(List<?> i) {
		//i.set(0, i.get(0));
	}
}