/**
 */
package de.dfki.cos.basys.platform.model.pattern;

import de.dfki.cos.basys.platform.model.base.datatypes.BLong;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PLong Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.pattern.PLongRestriction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPLongRestriction()
 * @model superTypes="de.dfki.cos.basys.platform.model.pattern.PNumberRestriction&lt;de.dfki.cos.basys.platform.model.base.BLong&gt;"
 * @generated
 */
public interface PLongRestriction extends PNumberRestriction<BLong> {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BLong)
	 * @see de.dfki.cos.basys.platform.model.pattern.PatternPackage#getPLongRestriction_Value()
	 * @model dataType="de.dfki.cos.basys.platform.model.base.BLong"
	 * @generated
	 */
	BLong getValue();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.pattern.PLongRestriction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BLong value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Object newValue;\r\nif (value instanceof Long  || value instanceof de.dfki.cos.basys.platform.model.base.datatypes.BLong) {\r\nnewValue = value instanceof Long  ? value : ((de.dfki.cos.basys.platform.model.base.datatypes.BLong) value).getValue();\t\t\t\r\nint result = ((Long) newValue).compareTo(getValue().getValue());\r\n\treturn _compareTo(result, getFunction());\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isSatisfiedBy(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if ( defVal != null ) {\r\n\treturn isSatisfiedBy( defVal ) ? defVal : null;\r\n}\r\n// create a value based on this restriction\r\nLong v = getValue().getValue();\r\nswitch ( getFunction() ) {\r\n\tcase EQUALS:\r\n\tcase GREATER_EQUALS:\r\n\tcase LESS_EQUALS:\r\n\t\treturn v;\r\n\tcase GREATER_THAN:\r\n\tcase NOT_EQUALS:\r\n\t\treturn v + 1;\r\n\tcase LESS_THAN:\r\n\t\treturn v - 1;\r\n\tdefault:\r\n\t\treturn null;\r\n}'"
	 * @generated
	 */
	Object getDefaultValue(Object defVal);

} // PLongRestriction
