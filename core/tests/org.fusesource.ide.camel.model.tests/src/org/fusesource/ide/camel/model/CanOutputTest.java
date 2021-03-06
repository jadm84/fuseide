/*******************************************************************************
 * Copyright (c) 2013 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/

package org.fusesource.ide.camel.model;

import junit.framework.Assert;

import org.fusesource.ide.camel.model.AbstractNode;
import org.fusesource.ide.camel.model.Endpoint;
import org.fusesource.ide.camel.model.generated.Aggregate;
import org.fusesource.ide.camel.model.generated.ConvertBody;
import org.fusesource.ide.camel.model.generated.Filter;
import org.fusesource.ide.camel.model.generated.Log;
import org.fusesource.ide.camel.model.generated.RecipientList;
import org.fusesource.ide.camel.model.generated.RoutingSlip;
import org.junit.Test;



public class CanOutputTest {

	@Test
	@SuppressWarnings("unchecked")
	public void testCanOutput() throws Exception {
		assertCanOutput(false, ConvertBody.class, Log.class, RoutingSlip.class, RecipientList.class, Endpoint.class);
		///assertCanOutput(true, RemoveHeaders.class, Aggregate.class, Filter.class);
		assertCanOutput(true, Aggregate.class, Filter.class);
	}

	protected void assertCanOutput(boolean expected, Class<? extends AbstractNode>... classes) throws Exception { 
		for (Class<? extends AbstractNode> aClass : classes) {
			System.out.println("Testing class: " + aClass.getName());
			
			AbstractNode node = aClass.newInstance();
			boolean actual = node.canAcceptOutput();
			
			Assert.assertEquals("Class " + aClass.getName() + " canOutput?", expected, actual);
		}
	}
}
