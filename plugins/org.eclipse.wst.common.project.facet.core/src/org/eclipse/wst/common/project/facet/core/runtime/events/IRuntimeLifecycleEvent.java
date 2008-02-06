/******************************************************************************
 * Copyright (c) 2008 BEA Systems, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Konstantin Komissarchik
 ******************************************************************************/

package org.eclipse.wst.common.project.facet.core.runtime.events;

import org.eclipse.wst.common.project.facet.core.runtime.IRuntime;

/**
 * The root interface of all runtime lifecycle events. 
 * 
 * @author <a href="mailto:kosta@bea.com">Konstantin Komissarchik</a>
 */

public interface IRuntimeLifecycleEvent
{
    enum Type
    {
        VALIDATION_STATUS_CHANGED
    }
    
    /**
     * Returns the type of this event.
     * 
     * @return the type of this event
     */
    
    Type getType();
    
    /**
     * The affected runtime.
     * 
     * @return the affected runtime
     */
    
    IRuntime getRuntime();

}
