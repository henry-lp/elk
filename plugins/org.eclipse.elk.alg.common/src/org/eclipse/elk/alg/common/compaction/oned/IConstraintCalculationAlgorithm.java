/*******************************************************************************
 * Copyright (c) 2017 Kiel University and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.elk.alg.common.compaction.oned;

/**
 * An algorithm that calculates separation constraints in one dimension that are induced by a
 * set of boxes in the plane.
 */
@FunctionalInterface
public interface IConstraintCalculationAlgorithm {

    /**
     * @param compactor
     *            the instance of the surrounding {@link OneDimensionalCompactor}.
     */
    void calculateConstraints(OneDimensionalCompactor compactor);
    
}