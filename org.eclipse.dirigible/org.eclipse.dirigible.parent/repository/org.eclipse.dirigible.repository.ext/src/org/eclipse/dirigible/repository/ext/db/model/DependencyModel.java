/*******************************************************************************
 * Copyright (c) 2016 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * SAP - initial API and implementation
 *******************************************************************************/

package org.eclipse.dirigible.repository.ext.db.model;

/**
 * Dependency element of the DataStructureModel
 */
public class DependencyModel {

	private String name;

	private String type;

	/**
	 * The constructor from fields
	 *
	 * @param name
	 * @param type
	 */
	public DependencyModel(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	/**
	 * Getter for the name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for the name
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for the type
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter for the type
	 *
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

}