/***************************************************************************
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package org.eclipse.net4j.internal.tcp;

import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.factory.Factory;

/**
 * @author Eike Stepper
 */
public class TCPSelectorFactory extends Factory
{
  public static final String PRODUCT_GROUP = "org.eclipse.net4j.selectors";

  public static final String TYPE = "tcp";

  public TCPSelectorFactory()
  {
    super(PRODUCT_GROUP, TYPE);
  }

  public TCPSelector create(String description)
  {
    return new TCPSelector();
  }

  public static TCPSelector get(IManagedContainer container, String description)
  {
    return (TCPSelector)container.getElement(PRODUCT_GROUP, TYPE, description);
  }
}
