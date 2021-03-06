/*******************************************************************************
 * Copyright (c) 2012-2017 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.ide.api.editor.events;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Events triggered just before the selection changes (allows to modify selection on the fly).
 *
 * @author "Mickaël Leduque"
 */
public class BeforeSelectionChangeEvent extends GwtEvent<BeforeSelectionChangeHandler> {
    /** The type instance for this event. */
    public static final Type<BeforeSelectionChangeHandler> TYPE = new Type<>();

    @Override
    public Type<BeforeSelectionChangeHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(final BeforeSelectionChangeHandler handler) {
        handler.onBeforeSelectionChange(this);
    }

}
