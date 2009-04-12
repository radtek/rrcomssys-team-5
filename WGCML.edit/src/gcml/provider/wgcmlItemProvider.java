/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.provider;


import gcml.GcmlFactory;
import gcml.GcmlPackage;
import gcml.wgcml;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gcml.wgcml} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class wgcmlItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wgcmlItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GcmlPackage.Literals.WGCML__CONNECTION);
			childrenFeatures.add(GcmlPackage.Literals.WGCML__MEDIUM);
			childrenFeatures.add(GcmlPackage.Literals.WGCML__FORM);
			childrenFeatures.add(GcmlPackage.Literals.WGCML__PERSON);
			childrenFeatures.add(GcmlPackage.Literals.WGCML__IS_ATTACHED);
			childrenFeatures.add(GcmlPackage.Literals.WGCML__DEVICE);
			childrenFeatures.add(GcmlPackage.Literals.WGCML__ACTIVITIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns wgcml.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/wgcml"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_wgcml_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(wgcml.class)) {
			case GcmlPackage.WGCML__CONNECTION:
			case GcmlPackage.WGCML__MEDIUM:
			case GcmlPackage.WGCML__FORM:
			case GcmlPackage.WGCML__PERSON:
			case GcmlPackage.WGCML__IS_ATTACHED:
			case GcmlPackage.WGCML__DEVICE:
			case GcmlPackage.WGCML__ACTIVITIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GcmlPackage.Literals.WGCML__CONNECTION,
				 GcmlFactory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(GcmlPackage.Literals.WGCML__MEDIUM,
				 GcmlFactory.eINSTANCE.createMedium()));

		newChildDescriptors.add
			(createChildParameter
				(GcmlPackage.Literals.WGCML__FORM,
				 GcmlFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(GcmlPackage.Literals.WGCML__PERSON,
				 GcmlFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(GcmlPackage.Literals.WGCML__IS_ATTACHED,
				 GcmlFactory.eINSTANCE.createIsAttached()));

		newChildDescriptors.add
			(createChildParameter
				(GcmlPackage.Literals.WGCML__DEVICE,
				 GcmlFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(GcmlPackage.Literals.WGCML__ACTIVITIES,
				 GcmlFactory.eINSTANCE.createActivities()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WgcmlEditPlugin.INSTANCE;
	}

}
