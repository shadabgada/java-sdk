/*
 * *
 *  * Copyright 2015 IBM Corp. All Rights Reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.ibm.watson.developer_cloud.concept_insights.v2.model;

import java.util.List;

import com.ibm.watson.developer_cloud.concept_insights.v2.ConceptInsights;
import com.ibm.watson.developer_cloud.util.GsonSingleton;

/**
 * Documents returned by the {@link ConceptInsights} service.
 * 
 */
public class Documents {

	/** The documents. */
	private List<String> documents;

	/**
	 * Gets the documents.
	 * 
	 * @return The documents
	 */
	public List<String> getDocuments() {
		return documents;
	}

	/**
	 * Sets the documents.
	 * 
	 * @param documents
	 *            The documents
	 */
	public void setDocuments(List<String> documents) {
		this.documents = documents;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClass().getName() + " " + GsonSingleton.getGson().toJson(this);
	}

	/**
	 * With documents.
	 * 
	 * @param documents
	 *            the documents
	 * @return the documents
	 */
	public Documents withDocuments(List<String> documents) {
		this.documents = documents;
		return this;
	}
}
