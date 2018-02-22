/**
 */
package de.dfki.iui.basys.model.domain.product;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.basys.model.domain.product.ProductPackage
 * @generated
 */
public interface ProductFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductFactory eINSTANCE = de.dfki.iui.basys.model.domain.product.impl.ProductFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalogue</em>'.
	 * @generated
	 */
	ProductCatalogue createProductCatalogue();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	ProductGroup createProductGroup();

	/**
	 * Returns a new object of class '<em>Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variant</em>'.
	 * @generated
	 */
	ProductVariant createProductVariant();

	/**
	 * Returns a new object of class '<em>Bill Of Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bill Of Material</em>'.
	 * @generated
	 */
	BillOfMaterial createBillOfMaterial();

	/**
	 * Returns a new object of class '<em>BOM Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BOM Entry</em>'.
	 * @generated
	 */
	BOMEntry createBOMEntry();

	/**
	 * Returns a new object of class '<em>Assembly Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Group</em>'.
	 * @generated
	 */
	AssemblyGroup createAssemblyGroup();

	/**
	 * Returns a new object of class '<em>Assembly Group Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Group Entry</em>'.
	 * @generated
	 */
	AssemblyGroupEntry createAssemblyGroupEntry();

	/**
	 * Returns a new object of class '<em>Component Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Entry</em>'.
	 * @generated
	 */
	ComponentEntry createComponentEntry();

	/**
	 * Returns a new object of class '<em>Manufactured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manufactured Component</em>'.
	 * @generated
	 */
	ManufacturedComponent createManufacturedComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProductPackage getProductPackage();

} //ProductFactory
