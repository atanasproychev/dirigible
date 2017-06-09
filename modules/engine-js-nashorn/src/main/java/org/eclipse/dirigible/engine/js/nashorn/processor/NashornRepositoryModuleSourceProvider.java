/*******************************************************************************
 * Copyright (c) 2015 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * SAP - initial API and implementation
 *******************************************************************************/

package org.eclipse.dirigible.engine.js.nashorn.processor;

import java.io.IOException;
import java.net.URISyntaxException;

import org.eclipse.dirigible.engine.api.IBaseScriptExecutor;

public class NashornRepositoryModuleSourceProvider {

	private static final String JS_EXTENSION = ".js"; //$NON-NLS-1$

	private IBaseScriptExecutor executor;
	
	private String rootPath;
	
	public NashornRepositoryModuleSourceProvider(IBaseScriptExecutor executor, String rootPath) {
		this.executor = executor;
		this.rootPath = rootPath;
	}
	
	public String loadSource(String module) throws IOException, URISyntaxException {

		if (module == null) {
			throw new IOException("Module location cannot be null");
		}

		byte[] sourceCode = null;
		if (module.endsWith(JS_EXTENSION)) {
			sourceCode = executor.retrieveModule(module, "", rootPath).getContent();
		} else {
			sourceCode = executor.retrieveModule(module, JS_EXTENSION, rootPath).getContent();
		}

		return new String(sourceCode);
	}

}