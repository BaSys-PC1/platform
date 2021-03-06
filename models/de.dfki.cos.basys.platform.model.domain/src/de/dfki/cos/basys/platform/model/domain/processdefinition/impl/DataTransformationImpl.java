/**
 */
package de.dfki.cos.basys.platform.model.domain.processdefinition.impl;

import de.dfki.cos.basys.platform.model.domain.processdefinition.DataTransformation;
import de.dfki.cos.basys.platform.model.domain.processdefinition.ProcessdefinitionPackage;
import de.dfki.cos.basys.platform.model.util.BasysEObjectImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DataTransformationImpl extends BasysEObjectImpl implements DataTransformation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessdefinitionPackage.Literals.DATA_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object apply(Object instance) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProcessdefinitionPackage.DATA_TRANSFORMATION___APPLY__OBJECT:
				return apply(arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataTransformationImpl
