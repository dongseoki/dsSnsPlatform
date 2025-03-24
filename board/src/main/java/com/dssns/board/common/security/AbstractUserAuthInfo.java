package com.dssns.board.common.security;

import com.dssns.board.common.entity.Role;
import java.util.Collection;

public interface AbstractUserAuthInfo {
	long getId();

	Collection<Role> getAuthorities();
}
