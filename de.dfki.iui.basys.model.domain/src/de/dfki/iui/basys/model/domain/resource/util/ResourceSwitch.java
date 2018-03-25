/**
 */
package de.dfki.iui.basys.model.domain.resource.util;

import de.dfki.iui.basys.model.base.BObject;
import de.dfki.iui.basys.model.base.Entity;

import de.dfki.iui.basys.model.domain.resource.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.resource.ResourcePackage
 * @generated
 */
public class ResourceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResourcePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSwitch() {
		if (modelPackage == null) {
			modelPackage = ResourcePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ResourcePackage.RESOURCE_TYPE_CATALOGUE: {
				ResourceTypeCatalogue resourceTypeCatalogue = (ResourceTypeCatalogue)theEObject;
				T result = caseResourceTypeCatalogue(resourceTypeCatalogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.RESOURCE_TYPE: {
				ResourceType resourceType = (ResourceType)theEObject;
				T result = caseResourceType(resourceType);
				if (result == null) result = caseEntity(resourceType);
				if (result == null) result = caseBObject(resourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.DISCRETE_MANUFACTURING_EQUIPMENT_MODULE: {
				DiscreteManufacturingEquipmentModule discreteManufacturingEquipmentModule = (DiscreteManufacturingEquipmentModule)theEObject;
				T result = caseDiscreteManufacturingEquipmentModule(discreteManufacturingEquipmentModule);
				if (result == null) result = caseResourceType(discreteManufacturingEquipmentModule);
				if (result == null) result = caseEntity(discreteManufacturingEquipmentModule);
				if (result == null) result = caseBObject(discreteManufacturingEquipmentModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(tool);
				if (result == null) result = caseResourceType(tool);
				if (result == null) result = caseEntity(tool);
				if (result == null) result = caseBObject(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.STATIONARY_TOOL: {
				StationaryTool stationaryTool = (StationaryTool)theEObject;
				T result = caseStationaryTool(stationaryTool);
				if (result == null) result = caseTool(stationaryTool);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(stationaryTool);
				if (result == null) result = caseResourceType(stationaryTool);
				if (result == null) result = caseEntity(stationaryTool);
				if (result == null) result = caseBObject(stationaryTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.MOVABLE_TOOL: {
				MovableTool movableTool = (MovableTool)theEObject;
				T result = caseMovableTool(movableTool);
				if (result == null) result = caseTool(movableTool);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(movableTool);
				if (result == null) result = caseResourceType(movableTool);
				if (result == null) result = caseEntity(movableTool);
				if (result == null) result = caseBObject(movableTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.TRANSPORT: {
				Transport transport = (Transport)theEObject;
				T result = caseTransport(transport);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(transport);
				if (result == null) result = caseResourceType(transport);
				if (result == null) result = caseEntity(transport);
				if (result == null) result = caseBObject(transport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.STORAGE: {
				Storage storage = (Storage)theEObject;
				T result = caseStorage(storage);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(storage);
				if (result == null) result = caseResourceType(storage);
				if (result == null) result = caseEntity(storage);
				if (result == null) result = caseBObject(storage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.FIXTURE: {
				Fixture fixture = (Fixture)theEObject;
				T result = caseFixture(fixture);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(fixture);
				if (result == null) result = caseResourceType(fixture);
				if (result == null) result = caseEntity(fixture);
				if (result == null) result = caseBObject(fixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.GATE: {
				Gate gate = (Gate)theEObject;
				T result = caseGate(gate);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(gate);
				if (result == null) result = caseResourceType(gate);
				if (result == null) result = caseEntity(gate);
				if (result == null) result = caseBObject(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.ROBOT: {
				Robot robot = (Robot)theEObject;
				T result = caseRobot(robot);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(robot);
				if (result == null) result = caseResourceType(robot);
				if (result == null) result = caseEntity(robot);
				if (result == null) result = caseBObject(robot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.CARRIER: {
				Carrier carrier = (Carrier)theEObject;
				T result = caseCarrier(carrier);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(carrier);
				if (result == null) result = caseResourceType(carrier);
				if (result == null) result = caseEntity(carrier);
				if (result == null) result = caseBObject(carrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.MACHINE: {
				Machine machine = (Machine)theEObject;
				T result = caseMachine(machine);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(machine);
				if (result == null) result = caseResourceType(machine);
				if (result == null) result = caseEntity(machine);
				if (result == null) result = caseBObject(machine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.STATIC_OBJECT: {
				StaticObject staticObject = (StaticObject)theEObject;
				T result = caseStaticObject(staticObject);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(staticObject);
				if (result == null) result = caseResourceType(staticObject);
				if (result == null) result = caseEntity(staticObject);
				if (result == null) result = caseBObject(staticObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.TURNABLE: {
				Turnable turnable = (Turnable)theEObject;
				T result = caseTurnable(turnable);
				if (result == null) result = caseHorizontalTransport(turnable);
				if (result == null) result = caseTransport(turnable);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(turnable);
				if (result == null) result = caseResourceType(turnable);
				if (result == null) result = caseEntity(turnable);
				if (result == null) result = caseBObject(turnable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.CONVEYOR: {
				Conveyor conveyor = (Conveyor)theEObject;
				T result = caseConveyor(conveyor);
				if (result == null) result = caseHorizontalTransport(conveyor);
				if (result == null) result = caseTransport(conveyor);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(conveyor);
				if (result == null) result = caseResourceType(conveyor);
				if (result == null) result = caseEntity(conveyor);
				if (result == null) result = caseBObject(conveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.LIFTING_TABLE: {
				LiftingTable liftingTable = (LiftingTable)theEObject;
				T result = caseLiftingTable(liftingTable);
				if (result == null) result = caseVerticalTransport(liftingTable);
				if (result == null) result = caseTransport(liftingTable);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(liftingTable);
				if (result == null) result = caseResourceType(liftingTable);
				if (result == null) result = caseEntity(liftingTable);
				if (result == null) result = caseBObject(liftingTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.AVG: {
				AVG avg = (AVG)theEObject;
				T result = caseAVG(avg);
				if (result == null) result = caseHorizontalTransport(avg);
				if (result == null) result = caseTransport(avg);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(avg);
				if (result == null) result = caseResourceType(avg);
				if (result == null) result = caseEntity(avg);
				if (result == null) result = caseBObject(avg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.TRANSPOSER: {
				Transposer transposer = (Transposer)theEObject;
				T result = caseTransposer(transposer);
				if (result == null) result = caseTransport(transposer);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(transposer);
				if (result == null) result = caseResourceType(transposer);
				if (result == null) result = caseEntity(transposer);
				if (result == null) result = caseBObject(transposer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.CARRIER_HANDLING_SYSTEM: {
				CarrierHandlingSystem carrierHandlingSystem = (CarrierHandlingSystem)theEObject;
				T result = caseCarrierHandlingSystem(carrierHandlingSystem);
				if (result == null) result = caseTransport(carrierHandlingSystem);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(carrierHandlingSystem);
				if (result == null) result = caseResourceType(carrierHandlingSystem);
				if (result == null) result = caseEntity(carrierHandlingSystem);
				if (result == null) result = caseBObject(carrierHandlingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.LIFT: {
				Lift lift = (Lift)theEObject;
				T result = caseLift(lift);
				if (result == null) result = caseVerticalTransport(lift);
				if (result == null) result = caseTransport(lift);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(lift);
				if (result == null) result = caseResourceType(lift);
				if (result == null) result = caseEntity(lift);
				if (result == null) result = caseBObject(lift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.VERTICAL_TRANSPORT: {
				VerticalTransport verticalTransport = (VerticalTransport)theEObject;
				T result = caseVerticalTransport(verticalTransport);
				if (result == null) result = caseTransport(verticalTransport);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(verticalTransport);
				if (result == null) result = caseResourceType(verticalTransport);
				if (result == null) result = caseEntity(verticalTransport);
				if (result == null) result = caseBObject(verticalTransport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.HORIZONTAL_TRANSPORT: {
				HorizontalTransport horizontalTransport = (HorizontalTransport)theEObject;
				T result = caseHorizontalTransport(horizontalTransport);
				if (result == null) result = caseTransport(horizontalTransport);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(horizontalTransport);
				if (result == null) result = caseResourceType(horizontalTransport);
				if (result == null) result = caseEntity(horizontalTransport);
				if (result == null) result = caseBObject(horizontalTransport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.ROLLERBED: {
				Rollerbed rollerbed = (Rollerbed)theEObject;
				T result = caseRollerbed(rollerbed);
				if (result == null) result = caseHorizontalTransport(rollerbed);
				if (result == null) result = caseTransport(rollerbed);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(rollerbed);
				if (result == null) result = caseResourceType(rollerbed);
				if (result == null) result = caseEntity(rollerbed);
				if (result == null) result = caseBObject(rollerbed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.LOADER: {
				Loader loader = (Loader)theEObject;
				T result = caseLoader(loader);
				if (result == null) result = caseStorage(loader);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(loader);
				if (result == null) result = caseResourceType(loader);
				if (result == null) result = caseEntity(loader);
				if (result == null) result = caseBObject(loader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.UNLOADER: {
				Unloader unloader = (Unloader)theEObject;
				T result = caseUnloader(unloader);
				if (result == null) result = caseStorage(unloader);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(unloader);
				if (result == null) result = caseResourceType(unloader);
				if (result == null) result = caseEntity(unloader);
				if (result == null) result = caseBObject(unloader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.BODY_STORE: {
				BodyStore bodyStore = (BodyStore)theEObject;
				T result = caseBodyStore(bodyStore);
				if (result == null) result = caseStorage(bodyStore);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(bodyStore);
				if (result == null) result = caseResourceType(bodyStore);
				if (result == null) result = caseEntity(bodyStore);
				if (result == null) result = caseBObject(bodyStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.CLAMP: {
				Clamp clamp = (Clamp)theEObject;
				T result = caseClamp(clamp);
				if (result == null) result = caseFixture(clamp);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(clamp);
				if (result == null) result = caseResourceType(clamp);
				if (result == null) result = caseEntity(clamp);
				if (result == null) result = caseBObject(clamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.BELT_CONVEYOR: {
				BeltConveyor beltConveyor = (BeltConveyor)theEObject;
				T result = caseBeltConveyor(beltConveyor);
				if (result == null) result = caseConveyor(beltConveyor);
				if (result == null) result = caseHorizontalTransport(beltConveyor);
				if (result == null) result = caseTransport(beltConveyor);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(beltConveyor);
				if (result == null) result = caseResourceType(beltConveyor);
				if (result == null) result = caseEntity(beltConveyor);
				if (result == null) result = caseBObject(beltConveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.ROLL_CONVEYOR: {
				RollConveyor rollConveyor = (RollConveyor)theEObject;
				T result = caseRollConveyor(rollConveyor);
				if (result == null) result = caseConveyor(rollConveyor);
				if (result == null) result = caseHorizontalTransport(rollConveyor);
				if (result == null) result = caseTransport(rollConveyor);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(rollConveyor);
				if (result == null) result = caseResourceType(rollConveyor);
				if (result == null) result = caseEntity(rollConveyor);
				if (result == null) result = caseBObject(rollConveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.CHAIN_CONVEYOR: {
				ChainConveyor chainConveyor = (ChainConveyor)theEObject;
				T result = caseChainConveyor(chainConveyor);
				if (result == null) result = caseConveyor(chainConveyor);
				if (result == null) result = caseHorizontalTransport(chainConveyor);
				if (result == null) result = caseTransport(chainConveyor);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(chainConveyor);
				if (result == null) result = caseResourceType(chainConveyor);
				if (result == null) result = caseEntity(chainConveyor);
				if (result == null) result = caseBObject(chainConveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.PALLET_CONVEYOR: {
				PalletConveyor palletConveyor = (PalletConveyor)theEObject;
				T result = casePalletConveyor(palletConveyor);
				if (result == null) result = caseConveyor(palletConveyor);
				if (result == null) result = caseHorizontalTransport(palletConveyor);
				if (result == null) result = caseTransport(palletConveyor);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(palletConveyor);
				if (result == null) result = caseResourceType(palletConveyor);
				if (result == null) result = caseEntity(palletConveyor);
				if (result == null) result = caseBObject(palletConveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.OVERHEAD_CONVEYOR: {
				OverheadConveyor overheadConveyor = (OverheadConveyor)theEObject;
				T result = caseOverheadConveyor(overheadConveyor);
				if (result == null) result = caseConveyor(overheadConveyor);
				if (result == null) result = caseHorizontalTransport(overheadConveyor);
				if (result == null) result = caseTransport(overheadConveyor);
				if (result == null) result = caseDiscreteManufacturingEquipmentModule(overheadConveyor);
				if (result == null) result = caseResourceType(overheadConveyor);
				if (result == null) result = caseEntity(overheadConveyor);
				if (result == null) result = caseBObject(overheadConveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Catalogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceTypeCatalogue(ResourceTypeCatalogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceType(ResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Manufacturing Equipment Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Manufacturing Equipment Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteManufacturingEquipmentModule(DiscreteManufacturingEquipmentModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stationary Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stationary Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationaryTool(StationaryTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Movable Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Movable Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovableTool(MovableTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransport(Transport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixture(Fixture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobot(Robot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrier(Carrier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine(Machine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticObject(StaticObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turnable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turnable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnable(Turnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConveyor(Conveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifting Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifting Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiftingTable(LiftingTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AVG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AVG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAVG(AVG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transposer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transposer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransposer(Transposer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Handling System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Handling System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierHandlingSystem(CarrierHandlingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLift(Lift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalTransport(VerticalTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalTransport(HorizontalTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rollerbed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rollerbed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRollerbed(Rollerbed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoader(Loader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unloader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unloader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnloader(Unloader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyStore(BodyStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClamp(Clamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Belt Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Belt Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeltConveyor(BeltConveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roll Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roll Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRollConveyor(RollConveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainConveyor(ChainConveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pallet Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pallet Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePalletConveyor(PalletConveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overhead Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overhead Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverheadConveyor(OverheadConveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBObject(BObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ResourceSwitch
