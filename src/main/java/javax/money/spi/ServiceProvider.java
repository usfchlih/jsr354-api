/*
 * CREDIT SUISSE IS WILLING TO LICENSE THIS SPECIFICATION TO YOU ONLY UPON THE
 * CONDITION THAT YOU ACCEPT ALL OF THE TERMS CONTAINED IN THIS AGREEMENT.
 * PLEASE READ THE TERMS AND CONDITIONS OF THIS AGREEMENT CAREFULLY. BY
 * DOWNLOADING THIS SPECIFICATION, YOU ACCEPT THE TERMS AND CONDITIONS OF THE
 * AGREEMENT. IF YOU ARE NOT WILLING TO BE BOUND BY IT, SELECT THE "DECLINE"
 * BUTTON AT THE BOTTOM OF THIS PAGE. Specification: JSR-354 Money and Currency
 * API ("Specification") Copyright (c) 2012-2013, Credit Suisse All rights
 * reserved.
 */
package javax.money.spi;

import java.util.Collection;
import java.util.List;

/**
 * This class models the component that is managing the lifecycle of the
 * monetary services used by the Money and Currency API.
 * 
 * @author Anatole Tresch
 * @author Werner Keil
 */
public interface ServiceProvider {

//	/**
//	 * Access a service, given its type. If multiple instances are registered
//	 * some priority mechanism must be implemented to determine which
//	 * implementation should be used.
//	 * 
//	 * @param serviceType
//	 *            the service type.
//	 * @return The instance to be used, never {@code null}
//	 */
//	public <T> T getService(Class<T> serviceType);
//
//	/**
//	 * Access a service, given its type. If multiple instances are registered
//	 * some priority mechanism must be implemented to determine which
//	 * implementation should be used.
//	 * 
//	 * @param serviceType
//	 *            the service type.
//	 * @param defaultInstance
//	 *            returned if not such service is registered.
//	 * @return The instance to be used, also {@code null}, if no instance is
//	 *         registered and {@code defaultInstance == null}.
//	 */
//	public <T> T getService(Class<T> serviceType, T defaultInstance);

	/**
	 * Access a list of services, given its type. The bootstrap mechanism should
	 * order the instance for precedence, hereby the most significant should be
	 * first in order.
	 * 
	 * @param serviceType
	 *            the service type.
	 * @return The instance to be used, never {@code null}
	 */
	public <T> List<T> getServices(Class<T> serviceType);

	/**
	 * Access a list of services, given its type. The bootstrap mechanism should
	 * order the instance for precedence, hereby the most significant should be
	 * first in order.
	 * 
	 * @param serviceType
	 *            the service type.
	 * @param defaultList
	 *            the lis returned, if no services could be found.
	 * @return The instance to be used, never {@code null}
	 */
	public <T> List<T> getServices(Class<T> serviceType,
			List<T> defaultList);

}