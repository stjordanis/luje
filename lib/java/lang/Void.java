/* Luje
 * © 2013 David Given
 * This file is redistributable under the terms of the
 * New BSD License. Please see the COPYING file in the
 * project root for the full text.
 */

package java.lang;

public class Void
{
	public static Class<Void> TYPE;

	private static native Class<Void> getVoidClass();

	static
	{
		TYPE = getVoidClass();
	}
}
