package com.dssns.board.security;

import com.dssns.board.entity.Role;
import java.util.Collection;

public interface AbstractUserAuthInfo {
	long getId();

	Collection<Role> getAuthorities();
}
