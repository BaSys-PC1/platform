/**
 */
package de.dfki.iui.basys.model.domain.process.impl;

import de.dfki.iui.basys.model.domain.process.ProcessPackage;
import de.dfki.iui.basys.model.domain.process.TaskActive;
import de.dfki.iui.basys.model.domain.process.TaskExecuting;
import de.dfki.iui.basys.model.domain.process.TaskState;
import de.dfki.iui.basys.model.domain.process.TaskStateEnum;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Executing</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TaskExecutingImpl extends TaskActiveImpl implements TaskExecuting {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskExecutingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.TASK_EXECUTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStateEnum toEnum() {
		return TaskStateEnum.EXECUTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == TaskState.class) {
			switch (baseOperationID) {
				case ProcessPackage.TASK_STATE___TO_ENUM: return ProcessPackage.TASK_EXECUTING___TO_ENUM;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == TaskActive.class) {
			switch (baseOperationID) {
				case ProcessPackage.TASK_ACTIVE___TO_ENUM: return ProcessPackage.TASK_EXECUTING___TO_ENUM;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProcessPackage.TASK_EXECUTING___TO_ENUM:
				return toEnum();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskExecutingImpl
