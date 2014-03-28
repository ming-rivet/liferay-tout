/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rivetlogic.tout.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.rivetlogic.tout.model.ToutUserStatus;
import com.rivetlogic.tout.service.ToutUserStatusLocalServiceUtil;

/**
 * The extended model base implementation for the ToutUserStatus service. Represents a row in the &quot;rivetlogic_tout_ToutUserStatus&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ToutUserStatusImpl}.
 * </p>
 *
 * @author ronny.vargas
 * @see ToutUserStatusImpl
 * @see com.rivetlogic.tout.model.ToutUserStatus
 * @generated
 */
public abstract class ToutUserStatusBaseImpl extends ToutUserStatusModelImpl
	implements ToutUserStatus {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a Tout Portlet Status by User model instance should use the {@link ToutUserStatus} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ToutUserStatusLocalServiceUtil.addToutUserStatus(this);
		}
		else {
			ToutUserStatusLocalServiceUtil.updateToutUserStatus(this);
		}
	}
}